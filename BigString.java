public class bigstring {
    public static void main(String[] args) {
        String str = "i love to code java programming";
        String[] a = str.split(" ");
        int max = 0;
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            String s = a[i];
            int len = s.length();
            if (len > max) {
                max = len;
                index = i;
            }
        }
        System.out.println("longest word index:"+index);
        System.out.println("longest word:"+a[index]);
    }
}
