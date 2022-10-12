import java.util.LinkedList;

public class Program {
    public static void main(String[] args) {
        // Task1();
        Task2();
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

    public static void Task2() {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(0);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.first());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> lst) {
        LinkedList<Integer> reversed = new LinkedList<>();
        for (int i = lst.size() - 1; i >= 0; i--) {
            reversed.add(lst.get(i));
        }
        return reversed;
    }
}
