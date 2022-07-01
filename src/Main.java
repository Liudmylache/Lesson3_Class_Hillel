import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("TestFirst");
        linkedList.addLast("TestLast");
        linkedList.addLast("one");
        linkedList.addLast("two");
        linkedList.addLast("five");
        linkedList.add(1,"four");
        System.out.println(linkedList.contains("gdyd"));
        System.out.println(linkedList);
        linkedList.pollFirst();
        System.out.println(linkedList);
        linkedList.pollLast();
        System.out.println(linkedList);
        System.out.println(linkedList.peekFirst());


    }
}