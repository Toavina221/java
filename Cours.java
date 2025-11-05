import java.util.ArrayList;

public class Cours{
    private String titre;
    private String professeur;
    private ArrayList<Etudiant> listeEtudiants;

    //constructeur
    public Cours(String titre ,  String professeur ){
        this.titre = titre;
        this.professeur = professeur;
        this.listeEtudiants =  new ArrayList <>();
    }

    //getters
    public String getTitre(){return titre;}
    public String getProfesseur(){return professeur;}
    public int getListeEtudiants(){return listeEtudiants.size();}

    //methode
     public void ajouterEtudiant(Etudiant e){
        listeEtudiants.add(e);
        System.out.println("liste actuel des etudiants = " + listeEtudiants.size());
    }

    public void retirerEtudiant(Etudiant e){
        if(listeEtudiants.contains(e) ) { 
        listeEtudiants.remove(e);
        System.out.println("liste actuel des etudiants = " + listeEtudiants.size());}
    }

    public void afficherEtudiant(){
        System.out.println("Etudiants du cours" + titre + ":");
        for(Etudiant e : listeEtudiants){
            e.afficher();
        }
    }
    
}