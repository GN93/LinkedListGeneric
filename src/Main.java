public class Main {

    public static void main(String[] args){
        LinkedList<String> myList = new LinkedList<>();
        myList.append("Ala");
        myList.append("Ma");
        myList.append("Kota");
        myList.append("Oraz");
        myList.append("BMW");
        myList.append("Seraii");
        myList.append("X5");
        myList.append("hah");

//        myList.display();

        LinkedList<Integer> myIntList = new LinkedList<>();
        myIntList.append(1);
        myIntList.append(2);
        myIntList.append(144);
        myIntList.append(1997);
//        myIntList.display();

        LinkedList<Double> myDoubleList = new LinkedList<>();
        myDoubleList.append(5.22);
        myDoubleList.append(919.143);
        System.out.println(myDoubleList);


//        myDoubleList.display();

    }
}
