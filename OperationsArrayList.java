import java.util.ArrayList;
public class OperationsArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        // add element  O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1, 9);
        System.out.println(list);

        //get element  O(1)
        int element = list.get(2);
        System.out.println(element);

        //remove element  O(n)
        list.remove(2);
        System.out.println(list);

        //set element at index  O(n)
        list.set(2, 10);
        System.out.println(list);

        //contains element O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

    }
}
