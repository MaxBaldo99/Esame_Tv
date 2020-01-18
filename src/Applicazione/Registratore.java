package Applicazione;

import level3.Trasmissione;

public interface Registratore {

    /*
    TODO
        aggiungere dichiarazione dei metodi presenti nella relativa classe
     */

    void aggiungiTrasmissione(Trasmissione tr);

    boolean controllaPrenotazioneTrasmissione(Trasmissione tr);

    void eliminaTrasmissione(Trasmissione tr);
}
