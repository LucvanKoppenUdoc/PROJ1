package Examenpackage;

import java.util.ArrayList;

public class Examenlijst {
    private ArrayList<Examen> Examenlijst = new ArrayList<Examen>();

    public Examenlijst(ArrayList<Examen> examenlijst) {
        Examenlijst = examenlijst;
    }

    public ArrayList<Examen> getExamenlijst() {
        return Examenlijst;
    }

    public void setExamenlijst(ArrayList<Examen> examenlijst) {
        Examenlijst = examenlijst;
    }
}



