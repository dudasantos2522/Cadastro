package br.edu.scl.ifsp.ads.cadastro;

import androidx.annotation.NonNull;

import java.util.Objects;

public class Formulario {
    private String nomeCompleto;
    private String telefone;
    private String email;
    private Boolean ingressarNaListaDeEmails;
    private String genero;
    private String cidade;
    private String estado;

    public Formulario(String nomeCompleto, String telefone, String email, Boolean ingressarNaListaDeEmails, String genero, String cidade, String estado) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
        this.ingressarNaListaDeEmails = ingressarNaListaDeEmails;
        this.genero = genero;
        this.cidade = cidade;
        this.estado = estado;
    }

    @NonNull
    @Override
    public String toString() {
        return "Nome Completo: " + nomeCompleto + '\n' +
                "Telefone: " + telefone + '\n' +
                "Email: " + email + '\n' +
                "Ingressar na lista de emails: " + (ingressarNaListaDeEmails ? "Sim" : "Não") + "\n" +
                "Gênero: " + genero + '\n' +
                "Cidade: " + cidade + '\n' +
                "Estado: " + estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Formulario that = (Formulario) o;
        return Objects.equals(nomeCompleto, that.nomeCompleto) && Objects.equals(telefone, that.telefone) && Objects.equals(email, that.email) && Objects.equals(ingressarNaListaDeEmails, that.ingressarNaListaDeEmails) && Objects.equals(genero, that.genero) && Objects.equals(cidade, that.cidade) && Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeCompleto, telefone, email, ingressarNaListaDeEmails, genero, cidade, estado);
    }
}
