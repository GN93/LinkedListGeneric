public class LinkedListNode<T> {

    private LinkedListNode<T> nextNode;
    private T value;


    public LinkedListNode(T value) {
        System.out.println("Setting value " + value);
        nextNode.setValue(value);
    }

    public LinkedListNode() {
        this.nextNode = null;
        this.value = null;
    }

    public LinkedListNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(LinkedListNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
