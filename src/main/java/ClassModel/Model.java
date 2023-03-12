package ClassModel;
// son role est de stocker les infos qu on va travailler avec dans la couche metier , et de mm les resultats qu'on va afficher
// en vue (jsp) seront stockes dans le model avant de les transferer

public class Model {
    double capital , taux , mensualite;
    int duree;
    public Model(double c, double t , int d , double m  ) {
        this.capital = c;
        this.taux= d;
        this.duree = d;
        this.mensualite=m;
        System.out.println("Created ");
    }
    public Model(){
        this.capital=0;
        this.taux=0;
        this.duree=0;
        this.mensualite=0;
        System.out.println("Created ");
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }


    public double getMensualite() {
        return mensualite;
    }

    public void setMensualite(double mensualite) {
        this.mensualite = mensualite;
    }

    public static void main(String[] args) {
//        Model monMod = new Model();
    }
}


