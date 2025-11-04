public class Voiture {
    private String marque;
    private int puissance;
    private double vitesse;

    public Voiture(String marque, int puissance) {
        this.marque = marque;
        this.puissance = puissance;
        this.vitesse = 0;
    }

    public void accelerer() {
        vitesse += 10;
        System.out.println(marque + " roule à " + vitesse + " km/h");
    }

    public void freiner() {
        vitesse = 0;
        System.out.println(marque + " a freiné");
    }
}
