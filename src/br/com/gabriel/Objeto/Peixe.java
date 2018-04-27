package br.com.gabriel.Objeto;

public class Peixe extends Animal {

    private String tipo;

    public Peixe(String tipo, int id, Grupo grupo, String descricao, char status) {
        super(id, grupo, descricao, status);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Peixe{" + "tipo=" + tipo + '}';
    }

}
