import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList();
        list.add(5);
        list.add(6);
        list.add("maher");
        list.add(5);
        list.add("kefi");
        Integer a = 5;
        System.out.println(list);
        System.out.println(list.contains("test"));
        System.out.println(list.contains(5));
        System.out.println(list.remove(2));
        System.out.println(list.remove(a));
        System.out.println(list.remove("test"));
        Pesrsonne p1 = new Pesrsonne(1, 15, "KEFI", "MAHER");
        Pesrsonne p2 = new Pesrsonne(2, 16, "Riyahi", "EYA");
        Pesrsonne p3 = new Pesrsonne(3, 17, "KEFI", "MAHA");
        Pesrsonne p4 = new Pesrsonne(4, 18, "Esser", "Fatnassi");
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        // Sort the list of Pesrsonne objects by age
        Collections.sort(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Pesrsonne && o2 instanceof Pesrsonne) {
                    Pesrsonne p1 = (Pesrsonne) o1;
                    Pesrsonne p2 = (Pesrsonne) o2;
                    return Integer.compare(p1.getAge(), p2.getAge());
                }
                return 0;
            }
        });

        System.out.println("Sorted list by age:");
        for (Object var : list) {
            System.out.println(var);
        }
    }
}