public class MyLinkedList {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    private int numNodes = 0;
    private Node head;

    public MyLinkedList(Object data){
        head = new Node(data);
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(Object data){
        if(head == null)
            addFirst(data);
        else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
        numNodes++;
    }

    public Node get(int index){
        Node temp=head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void removeFirst(){
        Node temp = head;
        head = temp.next;
    }

    public void removeLast(){  //đang lỗi
        Node temp = head;
        for(int i=0; i < numNodes-1; i++) {
            temp = temp.next;
        }
        temp.next = null;
        numNodes--;
    }

    public void remove(int index){
        Node temp = head;
        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numNodes--;
    }

    public int size(){
        Node temp = head;
        int size = 0;
        while (temp.next != null){
            temp = temp.next;
            size++;
        }
        return size;
    }

    public boolean contains(Object data){
        Node temp = head;
        boolean flag = false;
        for (int i=0; i<numNodes; i++){
            temp = temp.next;
            if((temp.data).equals(data)) flag=true;
        }
        return flag;
    }

    public void show(){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
            System.out.println(temp.data);
        }
    }




}
