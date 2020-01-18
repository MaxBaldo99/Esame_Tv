package Applicazione;

public interface TV {

    int getVolume();

    void setVolume(int volume);

    int getLuminosita();

    void setLuminosita(int luminosita);

    String getLingua();

    void setLingua(String lingua);

    boolean isDoppioSchermo();

    Integer getCanaleSelezPrinc();

    Integer getCanaleSelezSecond();

    void show(Integer programma);

    void show(Integer programmaPrincipale, Integer programmaSecondario);
}
