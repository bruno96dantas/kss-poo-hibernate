package br.com.bruno96dantas.ksspoohibernate.models;

public class Animal {

    /* Atributos */
    private String nome;
    private Integer idade;
    private String raça;

    /* Construtor padrão */
    public Animal() {}

    /* Contrutor */
    public Animal(String nome, Integer idade, String raça) {
        this.nome = nome;
        this.idade = idade;
        this.raça = raça;
    }

    /* Getters and Setters */
    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    private void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getRaça() {
        return raça;
    }

    private void setRaça(String raça) {
        this.raça = raça;
    }

    /* Métodos */
    public String som() {

        return "Indefinido";
    }
}
