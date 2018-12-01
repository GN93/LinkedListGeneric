package linkedList;

public class LinkedList<T> {

    private LinkedListNode<T> head;
    private LinkedListNode<T> tail;

    public LinkedList() {
        this.head = new LinkedListNode<>();
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
                tail.setNextNode(new LinkedListNode<>());
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

    public boolean contains (T searchedValue){
        LinkedListNode node = head;

        while(node.getNextNode() != null){
            if(node.getValue().equals(searchedValue)) return true;
            node = node.getNextNode();
        }
        return false;
    }

    @Override
    public String toString() {
        LinkedListNode node = head;
        StringBuilder str = new StringBuilder("Objects in linkedList.LinkedList: ");

        while(node.getNextNode() != null){
            str.append(node.getValue()).append(", ");
            node = node.getNextNode();
        }

        return str.toString();
    }


}
