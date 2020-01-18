package level3;

import level4.Genere;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

public interface Trasmissione {

    String getTitolo();

    void setTitolo(String titolo);

    Genere getGenere();

    void setGenere(Genere genere);

    String getInformazioni();

    void setInformazioni(String informazioni);

    List<String> getLingue();

    void setLingue(List<String> lingue);

    void setLinguaDefault(String lingua);

    HashMap<String, String> getSottotitoli();

    void setSottotitoli(String lingua, String sottotitoli);

    LocalDateTime getDataEOraInizio();

    void setDataEOra(LocalDateTime dataEOra);

    Duration getDurata();

    void setDurata(Duration durata);

    LocalDateTime getDataEOraFine();

    boolean equals(Object object);

    boolean TrasmissioneEFutura();

}
