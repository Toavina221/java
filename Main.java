 public class Main {
    public static void main(String[] args) {

        Livre livre = new Livre("titre livre ", "auteur livre ", 0, "isbn livre");
        Bibliotheque listelivre = new Bibliotheque();
        listelivre.ajouterLivre(livre); 
    }
 }