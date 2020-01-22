package level2;
import level3.Canale;
import level4.Trasmissione;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class GestoreCanale {


    /*
    STATO ASTRATTO:
        il gestore dei canali, li contiene l'insiemee li gestisce:
        consente aggiunta modifica e rimozione

    STATO CONCRETO:
        il gestore canali contiene una HashMap<Integer, Canale>
        associa a ogni numero un canale

    INVARIANTE
        HashMap può essere nullo (non ci sono canali) ma se non è nullo:
        ogni suo elemento chiave-valore è composto da chiavi-valori non nulli
     */

    private HashMap<Integer, Canale> canali;

    public GestoreCanale(HashMap<Integer, Canale> canali) {
        if(canali != null) {
            List<Integer> keys = canali
                    .keySet()
                    .stream()
                    .filter(i -> i == null)
                    .collect(Collectors.toList());
            List<Canale> values = canali.values()
                    .stream()
                    .filter(c -> c == null)
                    .collect(Collectors.toList());
            if(!(keys == null && values == null)) {
                throw new NullPointerException("ogni canale deve avere chiave e valore non nulli");
            }
        }
        this.canali = canali;
    }

    public GestoreCanale() {
        canali = new HashMap<Integer, Canale>();
    }

    public HashMap<Integer, Canale> getCanali() {
        return canali;
    }

    public void addCanale(Integer programma, Canale canale) {
        this.canali.put(programma, canale);
    }

    public void addCanale(Integer programma, String nome, List<Trasmissione> trasmissioni) {
        this.canali.put(programma, new Canale(nome, trasmissioni));
    }

    public void removeTrasmissioni(Canale canale) {
        this.canali.remove(canale);
    }

    public List<Trasmissione> cercaTrasmissioniPerCanale(Canale canale) {
        return this.canali.get(canale).getTrasmissioni();
    }

     /*
     * cerca e restituisce tutte le trasmissioni di un dato giorno di tutti i canali
     * associa a ogni canale la lista delle trasmissioni di quel giorno
     * @param giorno il titolo che si cerca
     * @return lista delle trasmissioni future con quel titolo
     * @throws NullPointerException se titolo è nullo o se non è stata ancora inserita nessuna trasmissione

    public HashMap<Canale, List<Trasmissione>>  cercaTrasmissioniPerGiorno(LocalDate giorno)
            throws NullPointerException {
        Objects.requireNonNull(giorno);
        Objects.requireNonNull(canali);

        List<Canale> canaleList = canali.values().stream().collect(Collectors.toList());
        HashMap<Canale, List<Trasmissione>> trasmissioni = new HashMap<>();
        for(Canale c: canaleList) {
            trasmissioni.put(c, c.getTrasmissioni()
                    .stream()
                    .filter(t -> t.getDataEOraInizio().toLocalDate().isEqual(giorno))
                    .collect(Collectors.toList()));
        }

        return trasmissioni;
    }

    */





}
