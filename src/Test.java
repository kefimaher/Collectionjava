import java.util.ArrayList;
import java.util.List;
public class Test {
    public static void main (String [] args) {
        ArrayList list = new ArrayList();
        list.add(5);
        list.add(6);
        list.add("maher");
        list.add(5);
        list.add("kefi");
        Integer a = 5;
        System.out.println(list);
        System.out.println(list.contains("test"));
        System.out.println(list.contains(5));
        System.out.println(list.remove(5));
        System.out.println(list.remove((a)));
        System.out.println(list.remove(("test")));
        Pesrsonne p1 = new Pesrsonne(1, 15, "KEFI", "MAHER");
        Pesrsonne p2 = new Pesrsonne(2, 16, "Riyahi", "EYA");
        Pesrsonne p3 = new Pesrsonne(3, 17, "KEFI", "MAHA");
        Pesrsonne p4 = new Pesrsonne(4, 18, "Esser", "Fatnassi");
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(8));
        System.out.println(list.get((5)));

        Object v1 = list.get(0);

// parcourie la liste

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Object var:list) {
            System.out.println(var);
        }

        for (int i = 0; i < list.size(); i++) {

            Object ob=list.get(i);
            if (ob instanceof Pesrsonne)
            {
                Pesrsonne p = (Pesrsonne) ob ;
                System.out.println("nom"+p.getNom());
            }


        }

        for (Object obj:list)
        {
            if (obj instanceof Pesrsonne)
            {

                System.out.println(((Pesrsonne)obj).getNom());
            }
            ArrayList <Pesrsonne> list1 = new ArrayList<>();
            list1.add(p1);
            list1.add(p2);
            list1.add(p3);
            list1.add(p4);

            System.out.println(list1.contains(p1));
            System.out.println(list1.contains(p4));



        }








    }





}
