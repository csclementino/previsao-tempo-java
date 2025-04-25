package br.com.fiap.model;

public class Local {
    private String country;

    public Local() {
        super();
    }

    public Local(String country) {
        super();
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
