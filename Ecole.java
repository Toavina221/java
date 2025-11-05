import java.util.ArrayList;

public class Ecole{
    private String nomEcole;
    private String adresse;
    private ArrayList<Cours> listeDesCours;

    //constructeur
    public Ecole(String nomEcole ,  String adresse    ){
        this.nomEcole = nomEcole;
        this.adresse = adresse;
        this.listeDesCours = new ArrayList<>() ; 
    }

    //getters
    public String getNomEcole(){return nomEcole;}
    public String getAdresse(){return adresse;}

    //methode
    public void ajouterCours(Cours c){
        listeDesCours.add(c);
        System.out.println("Cours ajouté!");
    }

        public void affichercours(){
       for(Cours c : listeDesCours){
        System.out.println(c.getTitre());
       }
    }

}