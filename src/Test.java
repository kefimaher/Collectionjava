import java.util.ArrayList;
import java.util.List;
public class Test {
    public static void main (String [] args) {
        ArrayList list = new ArrayList() ;
      //  List<Pesrsonne> P = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add("maher");
        list.add(5);
        list.add("kefi");
        Integer a=5 ;
        System.out.println(list);
        System.out.println(list.contains("test"));
        System.out.println(list.contains(5));
        System.out.println(list.remove(5));
        System.out.println(list.remove((a)));
        System.out.println(list.remove(("test")));
        Pesrsonne p1 = new Pesrsonne(1,15,"KEFI","MAHER") ;
        Pesrsonne p2 = new Pesrsonne(2,16,"Riyahi","EYA") ;
        Pesrsonne p3 = new Pesrsonne(3,17,"KEFI","MAHA") ;
        Pesrsonne p4 = new Pesrsonne(4,18,"Esser","Fatnassi") ;
        list.add(p1) ;
        list.add(p2) ;
        list.add(p3) ;
        list.add(p4) ;
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(8));
        System.out.println(list.get((5)));
// parcourie la liste

        for (Pesrsonne personne : personne) {
            System.out.println(personne);
        }



// parcourire et afficher que les nom des pesonne avec deux methode




    }





}
