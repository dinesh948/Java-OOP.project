import java.util.Arrays;

public class threepointers {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] arr3 = {2, 3, 6, 9, 12};
    }

    public static void findcommonelements(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0;
        int j = 0;
        int k = 0;
        if (arr1 == null || arr2 == null || arr3 == null || arr1.length == 0 || arr2.length == 0 || arr3.length == 0) {
            throw new NullPointerException("empty array");
        }
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j]&& arr2[j] == arr3[k]) {
                System.out.println("Equal Numbers are:" + arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }
    }
}

