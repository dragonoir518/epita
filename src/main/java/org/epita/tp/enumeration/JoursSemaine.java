package org.epita.tp.enumeration;

public enum JoursSemaine {
    LUNDI(false,":'("),
    MARDI(false,":("),
    MERCREDI(false,":-|"),
    JEUDI(false,":)"),
    VENDREDI(false,":D"),
    SAMEDI(true,":-)"),
    DIMANCHE(true,":-)");

    private final boolean isWeekend;
    private final String smiley;

    private JoursSemaine(boolean isWeekend, String smiley) {
        this.isWeekend = isWeekend;
        this.smiley = smiley;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public String getSmiley() {
        return smiley;
    }

    @Override
    public String toString() {
        return "JoursSemaine{" +
                "isWeekend=" + isWeekend +
                ", smiley='" + smiley + '\'' +
                '}';
    }
}
