package br.com.gabriel.Objeto;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {

    private int id;
    private List<Animal> animais;

    public Zoologico(int id) {
        this.id = id;
        this.animais = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }

    @Override
    public String toString() {
        String listaAnimais = "";
        for (Animal animal : animais) {
            listaAnimais += "\n" + animal.getDescricao();
        }
        return "Zoologico{" + "id=" + id + ", Animais=" + listaAnimais + '}';
    }

}
