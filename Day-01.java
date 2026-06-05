class day01 {
    public static void main(String[] args) {

        int arr[] = {2,5,10,-8,12,0,18,7,1,-1,4};

        System.out.println("Even numbers:\n");

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                System.out.println(arr[i] + " ");
            }
        }

        System.out.println("Odd numbers:\n");

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}

