package Esercizio3;

public class Persona {

    // Campi
    private String nome;
    private int eta;
    private boolean isOnline;
    private int giornoPreferito;
    private String materiaPreferita;

    // Costruttori
    public Persona(String nome, int eta) {
        this.nome = nome;
        this.setEta(eta);
    }

    public Persona() {
        this.nome = "Sconosciuto";
        this.eta = 0;
        this.saluta();
    }

    // Setter
    public void setEta(int nuovaEta) {
        if (nuovaEta >= 0)
            this.eta = nuovaEta;
        else
            System.out.println("Errore: eta non valida.");
    }

    public void setGiornoPreferito(int giorno) {
        if (giorno >= 1 && giorno <= 7)
            this.giornoPreferito = giorno;
        else
            System.out.println("Errore: il giorno deve essere compreso tra 1 e 7.");
    }

    public void setMateriaPreferita(String materia) {
        this.materiaPreferita = materia;
    }

    // Getter
    public String getNome() {
        return this.nome;
    }

    public int getEta() {
        return this.eta;
    }

    public boolean isOnline() {
        return this.isOnline;
    }

    public int getGiornoPreferito() {
        return this.giornoPreferito;
    }

    public String getMateriaPreferita() {
        return this.materiaPreferita;
    }

    // Metodi di comportamento
    public void saluta() {
        System.out.println("Ciao, il mio nome è: " + nome);
    }

    public void invecchia() {
        eta++;
    }

    public void login() {
        this.isOnline = true;
    }

    public void logout() {
        this.isOnline = false;
    }

    public String getNomeGiorno(int giorno) {
        return switch (giorno) {
            case 1 -> "Lunedi";
            case 2 -> "Martedi";
            case 3 -> "Mercoledi";
            case 4 -> "Giovedi";
            case 5 -> "Venerdi";
            case 6 -> "Sabato";
            case 7 -> "Domenica";
            default -> "Giorno non valido";
        };
    }

    public void descriviMateria(String materia) {
        switch (materia) {
            case "Matematica" -> System.out.println("Adoro la logica e i numeri.");
            case "Italiano" -> System.out.println("Amo la letteratura e la scrittura.");
            case "Filosofia" -> System.out.println("Mi appassiona il pensiero critico.");
            default -> System.out.println("Non ho un'opinione su questa materia.");
        }
    }
}