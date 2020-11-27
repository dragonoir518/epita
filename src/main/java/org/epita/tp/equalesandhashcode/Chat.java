package org.epita.tp.equalesandhashcode;

import java.util.Objects;

public class Chat {
    private String nom;
    private int age;
    private char sexe;

    public Chat(String nom, int age, char sexe) {
        this.nom = nom;
        this.age = age;
        this.sexe = sexe;
    }
/*

    @Override
    public String toString() {
        return "Chat{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                ", sexe=" + sexe +
                '}';
    }
*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chat chat = (Chat) o;
        return age == chat.age &&
                sexe == chat.sexe &&
                Objects.equals(nom, chat.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, age, sexe);
    }
}
