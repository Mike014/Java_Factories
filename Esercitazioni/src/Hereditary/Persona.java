package Hereditary;

public class Persona {
    private int eta;
    private String name;

    public Persona(int eta, String name) {
        this.eta = eta;
        this.name = name;
    }

    public String presentati() {
        return "Ciao il mio nome è: " + getName();
    }

    public int getEta() {
        return this.eta;
    }

    public String getName() {
        return this.name;
    }
}

