public class ex4 {
//a)
    public static int cheapestKeyboard(int[] keyboards) {
        int minPrice = Integer.MAX_VALUE;
        for (int price : keyboards) {
            if (price < minPrice) {
                minPrice = price;
            }
        }
        return minPrice;
    }
    public static void main(String[] args) {
        int[] keyboards = new int[]{40, 35, 70, 15, 45};
        System.out.println("the Cheapest Keyboard is: "+cheapestKeyboard(keyboards));
    }
}
