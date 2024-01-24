package sio.democlasse;

public class Moto {
    private String modele;
    private String couleur;
    private int vitesse;

    public Moto(String unMod, String uneCoul, int uneVit)
    {
        this.modele = unMod;
        this.couleur = uneCoul;
        this.vitesse = uneVit;
    }


    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public void accelerer(int kmh)
    {
        if (this.vitesse+kmh >= 130)
            this.vitesse = 130;
        else
            this.vitesse += kmh;
    }
    public void decelerer(int kmh)
    {
        if (this.vitesse-kmh <= 0)
            this.vitesse = 0;
        else
            this.vitesse -= kmh;
    }
    public String litVitesse()
    {
        return Integer.toString(this.vitesse);
    }
}
