package Hereditary;

public class Studente extends Persona {
    private String corsoDiStudio;

    public Studente(int eta, String name, String corsoDiStudio) {
        super(eta, name);
        this.corsoDiStudio = corsoDiStudio;
    }

    public String getCorsoDiStudio() {
        return this.corsoDiStudio;
    }

    public String studia() {
        return "Lo studente studia " + getCorsoDiStudio();
    }

    @Override
    public String presentati() {
        return super.presentati() + " - Studio " + getCorsoDiStudio();
    }
}
