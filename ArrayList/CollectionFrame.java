import java.util.ArrayList;

public class CollectionFrame{
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Akash");
        list.add("Giridhari");
        list.add("Ramesh");
        System.out.println(list);
        ArrayList l1=new ArrayList();
        l1.add(111);
        l1.add(222);
        l1.add(333);
        System.out.println(l1);
        l1.addAll(list);
       System.out.println(l1);
        l1.remove("Ramesh");
        // System.out.println(l1);
        // l1.removeAll(list);
        // System.out.println(l1);
        // l1.clear();
        // System.out.println(l1);
        l1.retainAll(list);
        System.out.println(l1);
    }
}