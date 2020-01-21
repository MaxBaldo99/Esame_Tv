package Applicazione;
import Eccezioni.DataNelPassatoException;
import level2.TV;
import level2.Registratore;
import level2.GestoreCanale;
import level3.Canale;
import level4.Genere;
import level4.Trasmissione;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import static level4.Trasmissione.paramNotNull;

public class Applicazione {

    private TV tv;
    private GestoreCanale gestore;
    private Registratore registratore;

    public Applicazione() {
        tv = new TV();
        gestore = new GestoreCanale();
        registratore = new Registratore();
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public GestoreCanale getGestore() {
        return gestore;
    }

    public void setGestore(GestoreCanale gestore) {
        this.gestore = gestore;
    }

    public Registratore getRegistratore() {
        return registratore;
    }

    public void setRegistratore(Registratore registratore) {
        this.registratore = registratore;
    }

    /**
     * crea una nuova trasmissione
     * @param titolo titolo della trasmissione REQUIRE NOT NULL
     * @param genere genere della trasmissione
     * @param informazioni informazione sulla trasmissione
     * @param lingue insieme delle lingue disponibili
     * @param linguaDefault lingua di default REQUIRE NOT NULL
     * @param dataEOra data e ora della messas in onda REQUIRE NOT NULL and AFTER ACTUAL TIME
     * @param durata durata della trasmissione REQUIRE NOT NULL
     * @throws NullPointerException se uno dei parametri REQUIRE NOT NULL è NULL
     * @throws DataNelPassatoException se la data è al passato
     * @return la nuova trasmissione
     */
    public Trasmissione creaTrasmissione(
            String titolo, Genere genere, String informazioni, List<String> lingue, String linguaDefault,
            LocalDateTime dataEOra, Duration durata)
            throws NullPointerException, DataNelPassatoException {

        paramNotNull(titolo, linguaDefault, dataEOra, durata);
        if(dataEOra.isBefore(LocalDateTime.now())) {
            throw new DataNelPassatoException();
        }
        return new Trasmissione(titolo, genere, informazioni, lingue, linguaDefault, dataEOra, durata);
    }

    public void inserisciTrasmissione(Canale canale, Trasmissione trasmissione) {
        gestore.getCanali().get(canale).addTrasmissioni(trasmissione);
    }

    public Canale creaCanale(String nome, List<Trasmissione> trasmissioni) {
        return new Canale(nome, trasmissioni);
    }

    public void inserisciCanale(Integer numeroCanale, Canale canale) {
        gestore.addCanale(numeroCanale, canale);
    }

    /*public void show(Integer programma) {
        tv.show(programma);
    }*/

}
