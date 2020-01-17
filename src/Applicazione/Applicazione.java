package Applicazione;
import level2.TV;
import level2.Registratore;
import level2.GestoreCanale;

public class Applicazione {

    TV tv;
    GestoreCanale gestore;
    Registratore registratore;

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

    /*public void show(Integer programma) {
        tv.show(programma);
    }*/

}
