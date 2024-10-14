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
    //b)

    public static int minValue(int[] numbers) {
        int min =Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    //c)

    public static int maxSum(int[] numbers) {
        int min = minValue(numbers);
        int sum = 0;
        boolean minRemoved = false;

        for (int number : numbers) {
            if (number == min && !minRemoved) {
                minRemoved = true;
            } else {
                sum += number;
            }
        }
        return sum;
    }

    //d))
    public static int minSum(int[] numbers) {
        int max = maxValue(numbers);
        int sum = 0;
        boolean maxRemoved = false;

        for (int number : numbers) {
            if (number == max && !maxRemoved) {
                maxRemoved = true;
            } else {
                sum += number;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] numbers = {8, 2 ,33 ,84 ,109, 6};

        int max = maxValue(numbers);
        System.out.println("Max Value is: " + max);

        int min = minValue(numbers);
        System.out.println("Min Value is: " + min);

        int minSum = minSum(numbers);
        System.out.println("Min Sum is: " + minSum);

        int maxSum = maxSum(numbers);
        System.out.println("Max Sum is: " + maxSum);
    }
}
