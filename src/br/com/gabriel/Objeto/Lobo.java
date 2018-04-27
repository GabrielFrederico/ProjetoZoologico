package br.com.gabriel.Objeto;

import java.util.Date;

public class Lobo extends Animal {

    private float peso, tamanho;
    private Date dataNascimento;

    public Lobo(float peso, float tamanho, Date dataNascimento, Grupo grupo, int id, String descricao, char status) {
        super(id, grupo, descricao, status);
        this.peso = peso;
        this.tamanho = tamanho;
        this.dataNascimento = dataNascimento;
    }
  
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Lobo{" + "peso=" + peso + ", tamanho=" + tamanho + ", dataNascimento=" + dataNascimento + '}';
    }
    
}
