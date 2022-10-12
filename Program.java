import java.util.LinkedList;

public class Program {
    public static void main(String[] args) {
        Task1();
    }

    public static void Task1() {
        LinkedList<Integer> lst = new LinkedList<>();
        lst.add(0);
        lst.add(1);
        lst.add(2);
        lst.add(3);
        System.out.println(lst);
        LinkedList<Integer> reversed = reverseLinkedList(lst);
        System.out.println(reversed);
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> lst) {
        LinkedList<Integer> reversed = new LinkedList<>();
        for (int i = lst.size() - 1; i >= 0; i--) {
            reversed.add(lst.get(i));
        }
        return reversed;
    }
}
