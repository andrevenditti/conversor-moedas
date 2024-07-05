package br.com.alura.model;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoeda {
    public Moeda buscarMoeda(String moeda) {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();

        URI address = URI.create("https://v6.exchangerate-api.com/v6/a050fee79eec2ba11ed8d220/latest/" + moeda);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(address)
                .build();
        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return gson.fromJson(response.body(), Moeda.class);
        } catch (Exception e) {
            throw new RuntimeException("Não consegui obter o valor dessa moeda!");
        }
    }

}
