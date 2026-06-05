import java.util.HashSet;

class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 5, 1};

        HashSet<Integer> set = new HashSet<>();

        System.out.println("Duplicates:");

        for (int num : arr) {

            if (set.contains(num)) {
                System.out.println(num);
            } else {
                set.add(num);
            }
        }
    }
}
