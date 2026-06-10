import java.util.Arrays;
public class Moveelements {
    public static void main(String[] args) {
        int[] arr = {4, 5, 0, 1, 9, 0, 5, 0};
        if (arr.length == 1) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } else {
                    continue;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
    }
}
