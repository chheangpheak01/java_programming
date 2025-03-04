package collectionFramework;
import java.util.LinkedList;

public class LinkList{
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.remove(1);
        linkedList.removeFirst();
        linkedList.set(0,200);
        linkedList.getFirst();
        linkedList.forEach(e-> System.out.println("->" + e));
    }
}
