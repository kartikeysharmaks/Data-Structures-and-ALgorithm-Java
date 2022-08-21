import java.util.ArrayDeque;
import java.util.Deque;

public class Deck {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(36);
        deque.addFirst(34);
        deque.add(44);
        deque.add(46);
        deque.add(54);
        deque.addLast(56);

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());

        System.out.println(deque.removeLast());
        System.out.println(deque.removeLast());
        System.out.println(deque.removeLast());

    }
}
