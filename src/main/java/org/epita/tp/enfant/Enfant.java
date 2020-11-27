package org.epita.tp.enfant;

class Enfant {
    String nom;
    String prenom;
    int age = 0; //par défaut 0
    boolean estAmoureux = false;
    Enfant amoureux;


    public Enfant(String nom, String prenom) {
        //constructeur
        this.nom = nom;
        this.prenom = prenom;
    }

    public void presentation() {
        System.out.println("Bonjour, je m'appelle " + prenom + " " + nom + " j'ai " + age + " ans.");
    }

    public void feterAnniversaire() {
        if (this.age < 17) {
            this.age += 1;
        }
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void joueAuBallon(Enfant enfant) {

        System.out.println(this.prenom + " joue au ballon avec " + enfant.getPrenom());
    }

    public void tomberAmoureux(Enfant amoureux) {
        this.amoureux = amoureux;
    }

    public boolean estAmoureux() {
        if (amoureux == null) {
            return false;
        } else
            return true;

    }


}