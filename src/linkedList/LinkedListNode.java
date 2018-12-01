package linkedList;

class LinkedListNode<T> {

    private LinkedListNode<T> nextNode;
    private T value;

    LinkedListNode() {
        this.nextNode = null;
        this.value = null;
    }

    LinkedListNode<T> getNextNode() {
        return nextNode;
    }

    void setNextNode(LinkedListNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    T getValue() {
        return value;
    }

    void setValue(T value) {
        this.value = value;
    }

}
