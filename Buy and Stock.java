class BuyandStock {
    public static void main(String[] args) {
        System.out.println(profit(new int[]{100, 180, 240, 310, 40, 535, 695}));
    }

    public static int profit(int arr[]) {
        int buy = arr[0];
        int profit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < buy) {
                profit += (arr[i - 1] - buy);

                    buy = arr[i];
            }
            if (i == arr.length - 1) {
                profit += (arr[i] - buy);
            }

        }
        return profit;
    }
}
