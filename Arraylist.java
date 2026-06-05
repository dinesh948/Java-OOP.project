import java.util.ArrayList;
public class LearnLists {
    public static void main(String[] args){
        ArrayList<String> list =new ArrayList<>();
        list.add("Mirchi");
        list.add("Darling");
        list.add("Devara");
        System.out.println(list);

        list.set(2,"arya");
        System.out.println(list);
    }
}
