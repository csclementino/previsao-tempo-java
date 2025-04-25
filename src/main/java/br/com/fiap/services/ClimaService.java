package br.com.fiap.services;

import br.com.fiap.model.ClimaAPI;
import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class ClimaService {

    public ClimaAPI getClima(String cidade, String pais) throws IOException {
        ClimaAPI climaAPI = null;

        // colocar no formato correto convertendo o espaço em %20
        String cidadeCodificada = URLEncoder.encode(cidade, StandardCharsets.UTF_8.toString());
        String paisCodificado = URLEncoder.encode(pais, StandardCharsets.UTF_8.toString());

        // request
        HttpGet request = new HttpGet("https://api.openweathermap.org/data/2.5/weather?q="+cidadeCodificada+","+paisCodificado+"&appid=c62b05a2109101fda4da4152806dbe99&units=metric&lang=pt_br");

        //client
        CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();

        //response
        CloseableHttpResponse response = httpClient.execute(request);

        //entity
        HttpEntity entity = response.getEntity();

        if (entity != null) {
            String result = EntityUtils.toString(entity);

            Gson gson = new Gson();
            climaAPI = gson.fromJson(result, ClimaAPI.class);
        }
        return climaAPI;
    }

}
