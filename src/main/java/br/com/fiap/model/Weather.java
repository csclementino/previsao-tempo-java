package br.com.fiap.model;

import java.util.ArrayList;
import java.util.List;

public class Weather {

    private String main;
    private String description;

    // Lista de objetos Weather dentro da classe
    private List<Weather> weatherList = new ArrayList<>();

    // Construtores
    public Weather() {}

    public Weather(String main, String description) {
        this.main = main;
        this.description = description;
    }

    // Getters e Setters
    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Weather> getWeatherList() {
        return weatherList;
    }

    public void adicionarWeather(String main, String description) {
        weatherList.add(new Weather(main, description));
    }

    public String icone() {
        String icone = "";
        if ("Clear" .equals(getMain())){
            icone = "\uD83C\uDF1E";
        }
        if ("Rain" .equals(getMain())){
            icone = "\uD83C\uDF27\uFE0F";
        }
        if ("Clouds" .equals(getMain())){
            icone = "☁\uFE0F";
        }
        return icone;
    }
}
