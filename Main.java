 public class Main {
    public static void main(String[] args) {
        GestionNotes notesEleves = new GestionNotes();
        notesEleves.ajouterEleve("Toavina");
        notesEleves.ajouterNote("Toavina", 12); 
        notesEleves.ajouterNote("Toavina", 17); 
        notesEleves.calculerMoyenne("Toavina");
    }
 }