package br.com.alura.model;

import java.util.List;
import java.util.Objects;

public record Moeda(String baseCode, Object conversionRates) {
}
