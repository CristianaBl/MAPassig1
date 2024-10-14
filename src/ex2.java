public class ex2 {
    //a)

    public static int maxValue(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] numbers = {-4, -8, -3, -10, -17,-3, -88};
        int max = maxValue(numbers);
        System.out.println("Max Value is: " + max);
    }
}
