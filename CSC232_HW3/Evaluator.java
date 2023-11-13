package CSC232_HW3;

import java.time.LocalDate;
import java.util.Arrays;

public class Evaluator {
    public static double calcSphereSurface(double radius){
        return 4*Math.PI*radius*radius;
    }

    public static double myMathFunction(double x, double y, double theta){
        double result=Math.cos(theta)+4*Math.sqrt(x)-2*Math.min(x, y)+Math.pow(y, 3);
        return result;
    }

    public static int howManyDays(){
        return LocalDate.now().lengthOfMonth();
    }

    public static boolean isLeapYear(String date){
        LocalDate date2=LocalDate.parse(date);
        return date2.isLeapYear();
    }

    public static boolean hasItHappened(int month, int dayNum, int year){
        LocalDate date=LocalDate.of(year, month, dayNum);
        LocalDate current=LocalDate.now();
        return date.isBefore(current);
    }

    public static boolean isInArray(int[] values, int findMe){
        Arrays.sort(values);
        int index=Arrays.binarySearch(values,findMe);
        if(index>=0){
            return true;
        }
        return false;
    }

    public static int[] getTheLastHalf(int[]values){
        int start=values.length/2;
        int end=values.length;
        return Arrays.copyOfRange(values, start, end);
    }
}
