package CSC232_HW3;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args){
        System.out.println("Hello World!");
        //howManyDays
        System.out.println(Evaluator.howManyDays());
        System.out.println("---------------------------------------------");
        //isLeapYear
        System.out.println(Evaluator.isLeapYear("2024-10-31"));
        System.out.println(Evaluator.isLeapYear("2021-10-31"));
        System.out.println("---------------------------------------------");
        //hasItHappended
        System.out.println(Evaluator.hasItHappened(10, 31, 2021));
        System.out.println(Evaluator.hasItHappened(10, 31, 2024));
        System.out.println("---------------------------------------------");
        //sort
        int[] array1={2,4,5,3,1};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println("---------------------------------------------");
        //isInArray
        int[] array2={2,4,5,7,9,1,4,5};
        int[] array3={99,0,-3,79};
        System.out.println(Evaluator.isInArray(array2, 2));
        System.out.println(Evaluator.isInArray(array3,7 ));
        System.out.println("---------------------------------------------");
        //getTheLastHalf
        int[] array4={9,3,4,5,7,1,2,8};
        int[] array5={99,0,-3,79};
        System.out.println(Arrays.toString(Evaluator.getTheLastHalf(array4)));
        System.out.println(Arrays.toString(Evaluator.getTheLastHalf(array5)));
        System.out.println("---------------------------------------------");
    }
}
