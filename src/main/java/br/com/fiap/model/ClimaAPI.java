package br.com.fiap.model;

import java.util.ArrayList;
import java.util.List;

public class ClimaAPI {

    private String name;
    private List<Weather> weather;
    private Temperatura main;
    private Local sys;

    public ClimaAPI() {
        super();
        this.weather = new ArrayList<>();
    }

    public ClimaAPI(String name, List<Weather> weather, Temperatura main, Local sys) {
        this.name = name;
        this.weather = weather;
        this.main = main;
        this.sys = sys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public Temperatura getMain() {
        return main;
    }

    public void setMain(Temperatura main) {
        this.main = main;
    }

    public Local getSys() {
        return sys;
    }

    public void setSys(Local sys) {
        this.sys = sys;
    }
}
