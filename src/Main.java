public class Main {




    public static void main(String[] args) {

        Frage[] fragenkatalog = {
                new Frage("Wie heißt die Urversion von Java?", new String[] {"Bubu", "Oak", "Mallorca", "Coffee"}, 1, 1.0),
                new Frage("Wie viele Bits ergeben ein Byte?", new String[] {"16", "2", "8", "4"}, 2, 1.3),
                new Frage("Aus welchen Worten setzt sich der Begriff Informatik zusammen?", new String[] {"Information und Mathematik", "Information und Automatik", "Input und Maschine", "Informationen über Maschinen"}, 0, 4.0),
                new Frage("Wie groß ist ein int?", new String[] {"32 byte", "8 bit", "32 bit", "Größer als der Mond"}, 2, 0.7)
        };

        for(Frage f : fragenkatalog) {
            for (int i=0; i < f.antwortmoeglichkeit.length; i++)
            {

            }


            System.out.println(f.frage + f.antwortmoeglichkeit[1]);
        }

    }
}

