import java.util.HashMap;
import java.util.ArrayList;

public class NotesScolaires{
    //Encapsulation 
    private HashMap<String ,ArrayList<Integer>> notesScolaires ;

    //Constructeur
    public NotesScolaires(){
        this.notesScolaires = new HashMap<String ,ArrayList<Integer>>();
    }

    //Méthodes 
    //ajouter un élève 
    public void ajouterEleve(String nom){
        if(notesScolaires.containsKey(nom)){
            System.err.println(" Erreur d'ajout , cet élève est déjà dans la liste ");
        }
        else{
            notesScolaires.put(nom, null);
            System.out.println("elève : " + nom + " ajouter avec succés !");
        }
    }

    


}