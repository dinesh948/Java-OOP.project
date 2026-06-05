class Food {
    public static void main(String[] args) {

        int arr[] = {2, 8, 3, 5, 7,4,1,2};

        int r = 7;
        int unit = 2;

        int total_food = r * unit;

        int sum = 1;

        for(int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            if(sum >= total_food) {
                System.out.println(i + 1);
                return;
            }
        }

        System.out.println(-1);
    }
}
