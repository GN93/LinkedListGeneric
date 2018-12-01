public class LinkedList<T> {

    private LinkedListNode head;
    private LinkedListNode tail;

    public LinkedList() {
        this.head = new LinkedListNode();
    }

    public void append(T value){
        if(value != null){
            if(head.getValue() == null){
                head.setValue(value);
                head.setNextNode(new LinkedListNode<>());
                tail = head;
            }
            else{
                tail = tail.getNextNode();
                tail.setValue(value);
                tail.setNextNode(new LinkedListNode());
            }
        }
    }

    public void display(){
        LinkedListNode node = head;

        while(node.getNextNode() != null){
            System.out.println(node.getValue());
            node = node.getNextNode();
        }
    }

    @Override
    public String toString() {
        LinkedListNode node = head;
        StringBuilder str = new StringBuilder("Objects in LinkedList: ");

        while(node.getNextNode() != null){
            str.append(node.getValue() + ", ");
            node = node.getNextNode();
        }

        return str.toString();
    }

    public boolean contains (T searchedValue){
        LinkedListNode node = head;

        while(node.getNextNode() != null){
            if(node.getValue().equals(searchedValue)) return true;
            node = node.getNextNode();
        }
        return false;
    }


}
