public class Tid {
    public static void main(String[] args) {
        int tidTimer = 11;
        int tidMinutter = 11;
        int tidSekunder = 30;
        int sekunderSidenMidnat = tidTimer*60*60+tidMinutter*60+tidSekunder;
        int sekunderTilMidnat = 24*60*60-sekunderSidenMidnat;
        int nutidTimer = 11;
        int nutidSekunder = 20;
        int nutidMinutter = 37;
        int nutidSekunderSidenMidnat = nutidTimer*60*60+nutidMinutter*60+nutidSekunder;
        int tidBrugt = nutidSekunderSidenMidnat-sekunderSidenMidnat;

        System.out.println(" timer:" + tidTimer + " minutter:" + tidMinutter + " sekunder:" + tidSekunder);
        System.out.println("Sekunder siden midnat:" + sekunderSidenMidnat + " sekunder");
        System.out.println("Sekunder til midnat:" + sekunderTilMidnat + " sekunder");
        System.out.println("Tid brugt:"+ tidBrugt + " sekunder");
        System.out.println("Tid brugt:"+ tidBrugt/60 + " minutter");
    }
}
