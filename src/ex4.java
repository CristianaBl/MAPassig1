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

    //b)
    public static int mostExpensiveItem(int[] keyboards, int[] usbDrives) {
        int maxPrice = Integer.MIN_VALUE;

        for (int price : keyboards) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }

        for (int price : usbDrives) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }

        return maxPrice;
    }
    //c)
    public static int withinBudget(int[] usbDrives, int budget) {
        int maxAffordable = -1;
        for (int price : usbDrives) {
            if (price <= budget && price > maxAffordable) {
                maxAffordable = price;
            }
        }
        return maxAffordable;
    }

    public static void main(String[] args) {
        int[] keyboards = new int[]{40, 35, 70, 15, 45};
        System.out.println("the Cheapest Keyboard is: "+cheapestKeyboard(keyboards));

        int[] usbDrives = new int[]{80,70, 12, 8};
        System.out.println("most epensive item is: "+mostExpensiveItem(usbDrives, keyboards));

        int budget= 71;
        System.out.println("USB within budget: "+ withinBudget(usbDrives, budget));



    }
}
