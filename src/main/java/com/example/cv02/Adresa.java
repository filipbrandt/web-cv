package com.example.cv02;

public class Adresa {
    private String meno;
    private String priezvisko;

    public Adresa(String _meno, String _priezvisko){
        this.meno = _meno;
        this.priezvisko = _priezvisko;
    }

    @Override
    public String toString() {
        return "User{" +
                ", meno='" + meno + '\'' +
                ", priezvisko='" + priezvisko + '\'' +
                '}';
    }


    public void setMeno(String meno) {
        this.meno = meno;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }


    public String getMeno() {
        return meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }


}
