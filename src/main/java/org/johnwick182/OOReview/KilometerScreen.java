package org.johnwick182.OOReview;

/*
The sub class had to implement the methods of super class
 */
public class KilometerScreen extends Screen {
    int km = 0;

    public KilometerScreen() {
        super.setTitulo("Current KM");
    }

    @Override
    public String obterInformacao() {
        km+=10;
        return String.valueOf(km) + " km";
    }

    public static void main(String[] args) {
        Screen ks = new KilometerScreen();
        ks.imprimir();

    }

}
