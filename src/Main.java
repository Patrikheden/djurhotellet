// MIN ATT-GÖRA-LISTA IDAG:
// [x] 1. Klassen Katt i mappen src: namn, chipnummer, ras, konstruktor, getters
// [x] 2. Klassen KattHotell i mappen src: privat lista och en dörr in
// [x] 3. Dubblettskydd på chipnummer, testat från Main
// [x] 4. Upprop som skriver namn, ras och chipnummer
// [x] 5. Tydlig statusrad när hotellet är tomt

public class Main {
    public static void main(String[] args) {
        KattHotell hotell = new KattHotell();
        hotell.listaAlla();
        hotell.laggTill(new Katt("Bosse", 101, "Siames"));
        hotell.laggTill(new Katt("Luna", 102, "Ragdoll"));
        hotell.laggTill(new Katt("Lenny", 103,"Bengal"));

    if (!hotell.laggTill(new Katt("Kopia", 101, "Perser"))) {
            System.out.println("Dubblett nekad");
        }
        System.out.println("Antal: " + hotell.antalKatter());

        hotell.listaAlla();
    }

}
