import java.util.LinkedList;

public class MyQueue<T> {
    private LinkedList<T> data;

    public MyQueue() {
        data = new LinkedList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.size(); i++) {
            sb.append(data.get(i) + " ");
        }
        return sb.toString();
    }

    public void enqueue(T item) {
        data.addLast(item);
    }

    public T dequeue() {
        if (data.size() > 0) {
            return data.removeFirst();
        }
        return null;
    }

    public T first() {
        if (data.size() > 0) {
            return data.getFirst();
        }
        return null;
    }

}
