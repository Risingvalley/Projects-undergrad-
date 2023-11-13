package CSC231_Project02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Parallel_Sorting {
    //import merge function
    private static int[] mergeArray(int[] arrayA, int[] arrayB){
        int[] mergedArray = new int[arrayA.length + arrayB.length];
         
        int i=0, j=0, k=0; 
                 
        while (i < arrayA.length) 
        {
            mergedArray[k] = arrayA[i];
            i++;
            k++;
        } 
                 
        while (j < arrayB.length) 
        {
            mergedArray[k] = arrayB[j];
            j++;
            k++;
        } 
             
        Arrays.sort(mergedArray);
         
        return mergedArray;
    }
    public static void main(String[] args) {
        Scanner myScanner=new Scanner(System.in);
        System.out.println("Please enter an integer N");
        int N=myScanner.nextInt();
        int[] list =new int[N];
        Random rand=new Random();
        for(int i=0;i<N;i++){
            list[i]=rand.nextInt(10*N-1)+1;
        }
        System.out.println("The orginal Array is: ");
        for(int i=0;i<N;i++){
            System.out.print(list[i]+" ");
        }
        System.out.print("\n");
        int quarter=N/4;
        int[]part1=new int[quarter];
        int[]part2=new int[quarter];
        int[]part3=new int[quarter];
        int[]part4=new int[N-3*quarter];

        for(int i=0;i<quarter;i++){
            part1[i]=list[i];
        }
        System.out.println("P1 is:");
        for(int i=0;i<part1.length;i++){
            System.out.print(part1[i]+" ");
        }
        System.out.print("\n");
        
        int k=0;
        for(int i=quarter;i<2*quarter;i++){
            part2[k]=list[i];
            k++;
        }
        System.out.println("P2 is:");
            for(int i=0;i<part2.length;i++){
                System.out.print(part2[i]+" ");
            }
            System.out.print("\n");
        k=0;
        for(int i=2*quarter;i<3*quarter;i++){
            part3[k]=list[i];
            k++;
        }
        System.out.println("P3 is:");
            for(int i=0;i<part3.length;i++){
                System.out.print(part3[i]+" ");
            }
            System.out.print("\n");
        k=0;
        for(int i=3*quarter;i<N;i++){
            part4[k]=list[i];
            k++;
        }
        System.out.println("P4 is:");
        for(int i=0;i<part4.length;i++){
            System.out.print(part4[i]+" ");
        }
        System.out.print("\n");
        System.out.println("After sorting......");
        Thread t1=new Thread();{
            Arrays.sort(part1);
            System.out.println("P1 is:");
            for(int i=0;i<part1.length;i++){
                System.out.print(part1[i]+" ");
            }
            System.out.print("\n");
        }
        Thread t2=new Thread();{
            Arrays.sort(part2);
            System.out.println("P2 is:");
            for(int i=0;i<part2.length;i++){
                System.out.print(part2[i]+" ");
            }
            System.out.print("\n");
        }
        Thread t3=new Thread();{
            Arrays.sort(part3);
            System.out.println("P3 is:");
            for(int i=0;i<part3.length;i++){
                System.out.print(part3[i]+" ");
            }
            System.out.print("\n");
        }
        Thread t4=new Thread();{
            Arrays.sort(part4);
            System.out.println("P4 is:");
            for(int i=0;i<part4.length;i++){
                System.out.print(part4[i]+" ");
            }
            System.out.print("\n");
        }
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        }
        catch(InterruptedException e){
            e.getMessage();
        }

        int[] r1=mergeArray(part1, part2);
        int[] r2=mergeArray(part3, part4);
        int[] result=mergeArray(r1, r2);
        System.out.println("The final sorted Array is: ");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
        System.out.print("\n");
    }
}
