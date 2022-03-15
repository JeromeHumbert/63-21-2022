//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Bdd {
    private static int nbResultats = (int)(10L + Math.round(15.0D * Math.random()));

    private Bdd() {
    }

    public static int[] recupererLesDossards() {
        int[] dossards = new int[nbResultats];

        for(int i = 0; i < dossards.length; ++i) {
            dossards[i] = (int)(100L + Math.round(20.0D * Math.random()));
        }

        return dossards;
    }

    public static double[] recupererLesTemps() {
        double[] temps = new double[nbResultats];

        for(int i = 0; i < temps.length; ++i) {
            temps[i] = (double)Math.round(400.0D + 300.0D * Math.random()) / 10.0D;
        }

        return temps;
    }
}