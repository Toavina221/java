public class Main {
    public static void main(String[] args) {
        VilleStats villeStats = new VilleStats();

        villeStats.ajouterVille("Paris", 2200000);
        villeStats.ajouterVille("Tokyo", 13900000);
        villeStats.ajouterVille("Antananarivo", 1500000);
        villeStats.ajouterVille("New York", 8500000);

        villeStats.afficherVille();
    }
}