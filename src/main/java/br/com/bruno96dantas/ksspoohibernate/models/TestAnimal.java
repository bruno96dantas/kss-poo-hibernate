package br.com.bruno96dantas.ksspoohibernate.models;

public class TestAnimal {

    public static void main(String[] args) {

        AnimalAbstract animalAbstract = new AnimalAbstract() {
            @Override
            public String som() {
                return null;
            }
        };
    }
}
