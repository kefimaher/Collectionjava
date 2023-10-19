public class Pesrsonne {

    private int id,age;
    private String nom,prenom ;

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Pesrsonne(int id, int age, String nom, String prenom) {
        this.id = id;
        this.age = age;
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Pesrsonne{" +
                "id=" + id +
                ", age=" + age +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj)
    {

        if (obj==this)
            return true ;
        if (obj==null)
            return false ;
        if (obj.getClass()!=this.getClass())
            return false ;
        Pesrsonne pe = (Pesrsonne)  obj ;
        if (pe.id==id && pe.nom==nom && pe.getPrenom()==prenom)
            return true  ;
        return false ;

    }




}
