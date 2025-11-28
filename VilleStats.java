import java.util.Collections;
import java.util.HashMap;

public class VilleStats {
    //Encapsulation 
    private HashMap<String ,Integer> villeStats ;

    //Constructeur
    public VilleStats(){
        this.villeStats = new HashMap<>();
    }

    //Méthodes
    //ajouter une ville
    public void ajouterVille(String ville , Integer stat){
        villeStats.put(ville, stat);
        System.out.println("ville "+ ville +" ajouté ");
    }


    //Afficher toutes les villes 
    public void afficherVille(){
        if(villeStats.isEmpty()){
            System.err.println("Erreur , la liste est vide !");
        }
        for(String ville : villeStats.keySet()){
            System.out.println("ville : " + villeStats.get(ville));
        }
    }

    //trier par ordre croissant
    public void triCroissant(){
        Collections.sort(villeStats.values());
    }

}