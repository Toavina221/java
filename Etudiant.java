public class Etudiant{
    private String nom;
    private String prenom;
    private int numeroEtudiant;

    //constructeur
    public Etudiant(String nom ,  String prenom , int numeroEtudiant){
        this.nom = nom;
        this.prenom = prenom;
        this.numeroEtudiant = numeroEtudiant ; 
    }

    //getters
    public String getNom(){return nom;}
    public String getPrenom(){return prenom;}
    public int getNumeroEtudiant(){return numeroEtudiant;}

    //methode
    public void afficher(){
        System.out.println("Nom et prenom:" + nom  + "    " + prenom  + " numéro : " + numeroEtudiant );
    }

}