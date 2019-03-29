package br.com.bruno96dantas.ksspoohibernate.models;

public class Gato extends AnimalAbstract {

    public Gato() {
    }

    @Override
    public String som() {
        return "Miau!";
    }
}
