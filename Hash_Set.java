import java.util.*;
public class Hash_Set {
    public static void main(String args[]) {
        HashSet<Integer> set = new java.util.HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set);

        // set.remove(2);
        // if(set.contains(2)) {
        //     System.out.println("set contains 2");
        // }
        System.out.println(set.size());
        
    }
}
