public class Main {
    public static void main(String[] args) {

        Joueur joueurs = new Joueur();
        joueurs.ajouterJoueur("Rova" , 100);
        joueurs.ajouterJoueur("Toavina" , 200);
        joueurs.ajouterJoueur("Ravo" , 300);
        joueurs.ajouterJoueur("Rivo" , 400);
        joueurs.afficherScores();
        joueurs.meilleurJoueur();

        joueurs.modifierScore("Rova", 1000);

        joueurs.afficherScores();
        joueurs.meilleurJoueur();
    }
}