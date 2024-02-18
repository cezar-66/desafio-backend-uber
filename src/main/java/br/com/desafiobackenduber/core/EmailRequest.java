package br.com.desafiobackenduber.core;

public record EmailRequest(String to, String subject, String body) {
}
