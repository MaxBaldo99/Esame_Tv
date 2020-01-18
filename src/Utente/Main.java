package Utente;

import Applicazione.*;
import level2.*;
import level2.GestoreCanale;
import level3.Canale;
import level4.Genere;
import level4.Trasmissione;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.Duration;

public class Main {

    public static void main(String[] args) throws Exception {
        Applicazione app = new Applicazione();

        Canale italia1 = app.creaCanale("Italia1", null);
        Trasmissione simpson = app.creaTrasmissione(
                "Simpson",
                Genere.SHOW,
                null,
                null,
                "italiano",
                LocalDateTime.of(2015, Month.JANUARY, 20, 20, 30),
                Duration.ofMinutes(25)
        );

        app.inserisciCanale(6, italia1);
        app.inserisciTrasmissione(italia1, simpson);


    }
}
