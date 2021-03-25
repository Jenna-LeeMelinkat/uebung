import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Frage {

    public String frage;
    public String[] antwortmoeglichkeit;
    public int loesung;
    public double relevanz;
    public long letzterAufruf;

    public Frage(String frage, String[] antwortmoeglichkeit, int loesung, double relevanz) {
        this.frage = frage;
        this.antwortmoeglichkeit = antwortmoeglichkeit;
        this.loesung = loesung;
        this.relevanz = relevanz;
        //this.letzterAufruf = System.currentTimeMillis(); //Überbleibsell aus Aufgabe 1
    }

    public void stellen() {
        System.out.println(frage);
        for (int i = 0; i < antwortmoeglichkeit.length; i++) {
            System.out.println(i + " " + antwortmoeglichkeit[i]);
        }
        Scanner userInput = new Scanner(System.in);
        int u = userInput.nextInt();
        if (u == loesung) {
            System.out.println("Ihre Antwort ist richtig.");
            relevanz = relevanz / 2;
        } else {
            System.out.println("Ihre Antwort ist leider falsch, bitte versuchen Sie es später erneut.");
            relevanz = relevanz * 2;
        }
        System.out.println();
        this.letzterAufruf = System.currentTimeMillis();
    }
}
