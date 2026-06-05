import java.util.Arrays;
class Password {
    public static void main(String[] args) {
        String str = "aA1_67";
        int flag = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                flag=1;
            }
        }

        System.out.println(flag);
    }
}
