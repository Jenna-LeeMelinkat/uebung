import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Main {




    public static void main(String[] args) {

        Frage[] fragenkatalog = {
                new Frage("Wie heißt die Urversion von Java?", new String[] {"Bubu", "Oak", "Mallorca", "Coffee"}, 1, 1.0),
                new Frage("Wie viele Bits ergeben ein Byte?", new String[] {"16", "2", "8", "4"}, 2, 1.3),
                new Frage("Aus welchen Worten setzt sich der Begriff Informatik zusammen?", new String[] {"Information und Mathematik", "Information und Automatik", "Input und Maschine", "Informationen über Maschinen"}, 0, 4.0),
                new Frage("Wie groß ist ein int?", new String[] {"32 byte", "8 bit", "32 bit", "Größer als der Mond"}, 2, 0.7)
        };

        bubbleSort(fragenkatalog);

        for(Frage f : fragenkatalog) {
            String timeStamp = "nie";
            if(f.letzterAufruf > 0)
            {
                Timestamp myTime =  new Timestamp(f.letzterAufruf);
                timeStamp = new SimpleDateFormat("HH 'Uhr' mm 'Minuten und' ss 'Sekunden'").format(myTime);
            }

            String frage =("Frage: " + f.frage + "\n" +
                    "Antwortmöglichkeit: [" + f.antwortmoeglichkeit[0] + "," + f.antwortmoeglichkeit[1] + "," + f.antwortmoeglichkeit[2] + "," + f.antwortmoeglichkeit[3] + "]" + "\n" +
                    "Lösung: " + f.antwortmoeglichkeit[f.loesung] + "\n" +
                    "Relevanz: " + f.relevanz + "\n" +
                    "Letzter Aufruf: " + timeStamp + "\n");
            //System.out.println(frage);
            f.stellen();
        }

    }

    /**
     * Zum Sortieren (absteigend nach Relevanz)
     */
    public static void bubbleSort(Frage[] fragenkatalog) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < fragenkatalog.length-1; i++) {
                if (!(fragenkatalog[i].relevanz >= fragenkatalog[i+1].relevanz)) {
                    Frage elementCopy = fragenkatalog[i];
                    fragenkatalog[i] = fragenkatalog[i+1];
                    fragenkatalog[i+1] = elementCopy;
                    unsorted = true;
                }
            }
        }
    }
}

