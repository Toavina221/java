 public class Main {
    public static void main(String[] args) {
        // Livres d'auteurs différents pour tester la recherche par auteur
            Livre livre1 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 1943, "978-2070612758");
            Livre livre2 = new Livre("Vol de nuit", "Antoine de Saint-Exupéry", 1931, "978-2070367115"); // Même auteur
            Livre livre3 = new Livre("1984", "George Orwell", 1949, "978-2070368228");
            Livre livre4 = new Livre("La Ferme des animaux", "George Orwell", 1945, "978-2070368402"); // Même auteur
            Livre livre5 = new Livre("L'Étranger", "Albert Camus", 1942, "978-2070360024");
            Livre livre6 = new Livre("La Peste", "Albert Camus", 1947, "978-2070360420"); // Même auteur
            Livre livre7 = new Livre("Germinal", "Émile Zola", 1885, "978-2253013267");
            Livre livre8 = new Livre("Bel-Ami", "Guy de Maupassant", 1885, "978-2253011348");
            Livre livre9 = new Livre("Voyage au bout de la nuit", "Louis-Ferdinand Céline", 1932, "978-2070360284");
            Livre livre10 = new Livre("La Nausée", "Jean-Paul Sartre", 1938, "978-2070368051");
        Bibliotheque listelivre = new Bibliotheque();
        listelivre.ajouterLivre(livre1); 
        listelivre.ajouterLivre(livre2); 
        listelivre.ajouterLivre(livre3); 
        listelivre.ajouterLivre(livre4); 
        listelivre.ajouterLivre(livre5); 
        listelivre.ajouterLivre(livre6); 
        listelivre.ajouterLivre(livre7); 
        listelivre.ajouterLivre(livre8); 
        listelivre.ajouterLivre(livre9); 
        listelivre.ajouterLivre(livre10); 

         
        listelivre.rechercherParAuteur("Albert Camus");
    }
 }