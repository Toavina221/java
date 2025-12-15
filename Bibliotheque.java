import java.util.HashMap;

public class Bibliotheque {
    //Encapsulation 
    private HashMap<String , Livre> listesLivre ;

    //Constructeur
    public Bibliotheque(){
        listesLivre = new HashMap<>();
    }

    //Méthodes 
    // ajouter un livre 
    public void ajouterLivre(Livre livre){
        if(listesLivre.containsKey(livre.getIsbn())){
            System.err.println("Erreur , ce livre existe déjà dans la liste !");
        }
        else{
            listesLivre.put(livre.getIsbn(), livre);
            System.out.println("Livre ajouté !");
        }
    }

    
}