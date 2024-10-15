import java.util.Arrays;

public class ex3 {

    public static long arrayToLong(int[] num) {
        long result = 0;
        for (int digit : num) {
            result = result * 10 + digit;
        }
        return result;
    }

    public static int[] longToArray(long num) {
        String numStr = Long.toString(num);
        int[] result = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            result[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return result;
    }

    //a)

    public static int[] add(int[] num1, int[] num2) {
        long number1 = arrayToLong(num1);
        long number2 = arrayToLong(num2);
        long sum = number1 + number2;

        return longToArray(sum);
    }

    public static void main(String[] args) {
        int[] num1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};

        int[] sum = add(num1, num2);
        System.out.println("add:"+Arrays.toString(sum));

    }
}
