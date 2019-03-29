package br.com.bruno96dantas.ksspoohibernate.models;

import lombok.Data;

@Data
public abstract class AnimalAbstract {

    private String nome;
    private Integer idade;

    public abstract String som();

}
