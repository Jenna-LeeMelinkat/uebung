public class Frage {

    public String frage;
    public String[] antwortmoeglichkeit;
    public int loesung;
    public double relevanz;





    public Frage(String frage, String[] antwortmoeglichkeit, int loesung, double relevanz) {
        this.frage = frage;
        this.antwortmoeglichkeit = antwortmoeglichkeit;
        this.loesung = loesung;
        this.relevanz = relevanz;

    }

}