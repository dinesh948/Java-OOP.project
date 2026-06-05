public class OperationsBinaryString {

    public static void main(String[] args) {

        String str = "1C0C1C1A0B1";
        int result = str.charAt(0) - '0';

        for (int i = 1; i < str.length(); i += 2) {
            char op = Character.toUpperCase(str.charAt(i));
            int value=str.charAt(i + 1) - '0';


            switch (op) {

                case 'A':
                    result = result & value;
                    break;

                case 'B':
                    result = result | value;
                    break;

                case 'C':
                    result = result ^ value;
                    break;
            }
        }

        System.out.println("Output: " + result);
    }
}
