package br.com.bruno96dantas.ksspoohibernate.models;

public class Cachorro extends Animal {

    public Cachorro() {
    }

    public Cachorro(String nome, Integer idade, String raça) {
        super(nome, idade, raça);
    }

    @Override
    public String som() {
        return "Au!";
    }
}
