package Examenpackage;

import java.util.ArrayList;

public class Examenlijst {
    private ArrayList<Examen> Examenlijst = new ArrayList<Examen>();

    public Examenlijst(ArrayList<Examen> examenlijst) {
        Examenlijst = examenlijst;
    }

    public Examenlijst(){};

    public ArrayList<Examen> getExamenlijst() {
        return Examenlijst;
    }

    public void setExamenlijst(ArrayList<Examen> examenlijst) {
        Examenlijst = examenlijst;
    }

    public void addExamen(Examen examen){
        Examenlijst.add(examen);
    }

    @Override
    public String toString() {
        return "Examenlijst{" +
                "examenLijst=" + Examenlijst +
                '}';
    }
}