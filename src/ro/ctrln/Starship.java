package ro.ctrln;

import java.util.Random;

public interface Starship {

    // definim constante, variabile de clasa nu de instanta;
    int FIRST_INT = 1;
    static int SECOND_INT = 2;
    static final int THIRD_INT = 1;


    //doar signatura metodei, nu si implementarea;
    void warp ();
    void setStarshipDestination (String destination);

    //metoda functie, returneaza un rezultat, fara implementare;
    double computeWarpSpeed (int warpFactor, int lightYearsToDestination);

    //metoda implicita
    default int productionID() {
        Random r = new Random();
        return FIRST_INT + (SECOND_INT - THIRD_INT) * r.nextInt();
    }



}
