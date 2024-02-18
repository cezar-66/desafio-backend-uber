package br.com.desafiobackenduber.adapters;

public interface EmailSenderGateway {
    void sendEmail(String toEmail, String subject, String body);
}
