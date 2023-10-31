package pl.zabrze.zs10.listy_3ac;

public class Przepis {
    private String nazwa;
    private String Kategoria;
    private int nrKategorii;
    private int idObrazka;
    private String skladniki;
    private String tresc;
    private int id;
    private static int ile;

    public Przepis(String nazwa, String kategoria, int nrKategorii, int idObrazka, String skladniki, String tresc) {
        this.nazwa = nazwa;
        Kategoria = kategoria;
        this.nrKategorii = nrKategorii;
        this.idObrazka = idObrazka;
        this.skladniki = skladniki;
        this.tresc = tresc;
        id=ile;
        ile++;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getKategoria() {
        return Kategoria;
    }

    public int getNrKategorii() {
        return nrKategorii;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public String getSkladniki() {
        return skladniki;
    }

    public String getTresc() {
        return tresc;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return nazwa;
    }
}
