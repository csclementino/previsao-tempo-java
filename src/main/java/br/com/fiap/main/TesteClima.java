package br.com.fiap.main;

import br.com.fiap.model.ClimaAPI;
import br.com.fiap.services.ClimaService;

import javax.swing.*;
import java.io.IOException;

public class TesteClima {

    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }


    public static void main(String[] args) throws IOException {
        ClimaService objClimaService = new ClimaService();
        String cidade = texto("Informe a cidade: ");
        String pais = texto("Informe o pais: ");
        ClimaAPI climaAPI = objClimaService.getClima(cidade, pais);

        System.out.println("\n"+"🌤️ PREVISÃO DO TEMPO 🌤️"+"\n");
        System.out.println("📍 Cidade: "+climaAPI.getName());
        System.out.println("🌎 País: "+climaAPI.getSys().getCountry());
        System.out.println("🌡️ Temperatura: "+String.format("%.0f",climaAPI.getMain().getTemp())+"°C");
        System.out.println("📉 Mínima: "+String.format("%.0f",climaAPI.getMain().getTemp_min())+"°C");
        System.out.println("📈 Máxima: "+String.format("%.0f",climaAPI.getMain().getTemp_max())+"°C");
        System.out.println("💧 Umidade: "+climaAPI.getMain().getHumidity()+"%");
        System.out.println("☁️ Condições do tempo:");
        System.out.println("   ➤ "+climaAPI.getWeather().get(0).getDescription().toUpperCase()+
                " " +climaAPI.getWeather().get(0).icone());
    }
}
