import linkedList.LinkedList;

public class Main {

    public static void main(String[] args){
        LinkedList<String> myList = new LinkedList<>();
        myList.append("One");
        myList.append("Two");
        myList.append("Three");
        myList.append("Four");
        myList.append("Five");
        myList.append("Six");
        myList.append("Seven");
        myList.append(null);

        System.out.println(myList);

        LinkedList<Integer> myIntList = new LinkedList<>();
        myIntList.append(1);
        myIntList.append(2);
        myIntList.append(144);
        myIntList.append(1997);
        System.out.println(myIntList);

        LinkedList<Double> myDoubleList = new LinkedList<>();
        myDoubleList.append(5.22);
        myDoubleList.append(919.143);
        System.out.println(myDoubleList);


//        myDoubleList.display();

    }
}
