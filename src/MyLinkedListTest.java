public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addLast(13);
        ll.remove(1);
        ll.removeFirst();
        ll.removeLast();
        ll.size();
        ll.contains(9);

        ll.add(4,9);
        ll.add(4,9);
        ll.printList();

    }
}