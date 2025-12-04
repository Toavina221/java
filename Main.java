public class Main{
    public static void main(String[] args) {
        InventaireMagasin listeProduit = new InventaireMagasin();
         listeProduit.ajouterProduit("Riz", 30);
        listeProduit.ajouterProduit("Lait", 12);
        listeProduit.ajouterProduit("Pates", 50);

        listeProduit.afficherProduits();
        listeProduit.supprimerProduit("Pates");
        listeProduit.trierProduitCroissante();
        listeProduit.trierProduitDecroissante();
        listeProduit.moyenneQuantite();
    }
}