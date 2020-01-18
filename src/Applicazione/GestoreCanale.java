package Applicazione;

import level3.Canale;
import level3.Trasmissione;

import java.util.HashMap;
import java.util.List;

public interface GestoreCanale {

    HashMap<Integer, Canale> getCanali();

    void addCanale(Integer programma, Canale canale);

    void addCanale(Integer programma, String nome, List<Trasmissione> trasmissioni);

    void removeTrasmissioni(Canale canale);

    List<Trasmissione> cercaPerCanale(Canale canale);

}
