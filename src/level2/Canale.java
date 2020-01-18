package level2;

import level4.Trasmissione;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface Canale {

    String getNome();

    void setNome(String nome);

    List<Trasmissione> getTrasmissioni();

    void addTrasmissioni(Trasmissione trasmissione);

    void removeTrasmissione(Trasmissione trasmissione);

    void trasmissioneGiaPresente(Trasmissione trasmissione);

    List<Trasmissione> cercaPerTitolo(String titolo);

    List<Trasmissione> cercaPerOra(LocalTime orario);

    List<Trasmissione> cercaPerGiorno(LocalDate giorno);
}
