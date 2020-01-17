package Utente;

import Applicazione.*;
import level2.*;
import level2.GestoreCanale;
import level4.Genere;
import level4.Trasmissione;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.Duration;

public class Main {

    public static void main(String[] args) throws Exception {
        Applicazione app = new Applicazione();

        GestoreCanale gc = new GestoreCanale();
        gc.addCanale(1, "Rai1", null);
        gc.getCanali().get(0).addTrasmissioni( new Trasmissione(
                "Simpson",
                Genere.SHOW,
                null,
                null,
                "italiano",
                LocalDateTime.of(2015, Month.JANUARY, 20, 20, 30),
                Duration.ofMinutes(25)
        ));
    }
}
