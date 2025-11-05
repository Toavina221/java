public class Main{
    public static void main(String[] args){
        Ecole Polytech = new Ecole("Ecole Polytech" ,  "12 rue de Paris");
        Etudiant etudiant1 = new Etudiant("Toavina" , "rova" , 1);
        Etudiant etudiant2 = new Etudiant("Rova" , "rova" , 2);
        Etudiant etudiant3 = new Etudiant("fano" , "Toavina" , 3);
        Etudiant etudiant4 = new Etudiant("fanilo" , "ravo" , 4);

        Cours Math = new Cours("Mathématiques" , "Mr jonnah");
        Cours PC = new Cours("Physique" , "Mr Rinah");

        Math.ajouterEtudiant( etudiant1);
        Math.ajouterEtudiant( etudiant2);
        PC.ajouterEtudiant( etudiant1);
        PC.ajouterEtudiant( etudiant2);
        PC.ajouterEtudiant( etudiant3);
        PC.ajouterEtudiant( etudiant4);

        Polytech.ajouterCours( Math);
        Polytech.ajouterCours( PC);

        Polytech.affichercours();
        Math.afficherEtudiant();
        PC.afficherEtudiant();
    }
}