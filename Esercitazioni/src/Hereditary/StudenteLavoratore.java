package Hereditary;

public class StudenteLavoratore extends Studente implements Lavoratore {
    private int stipendio;

    public StudenteLavoratore(int eta, String name, String corsoDiStudio, int stipendio) {
        super(eta, name, corsoDiStudio);
        this.stipendio = stipendio;
    }

    public int getStipendio() {
        return stipendio;
    }

    public void setStipendio(int nuovoStipendio) {
        this.stipendio = nuovoStipendio;
    }

    @Override
    public String lavora() {
        return "Lo Studente Lavoratore guadagna : " + getStipendio();
    }

    @Override
    public String studia() {
        return "Sono un lavoratore ma studio anche " + super.studia();
    }
}
