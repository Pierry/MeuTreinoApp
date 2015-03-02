package br.com.pierrydev.meutreino.models;

public class Treino {

    private int id;
    private int type;
    private String title;
    private String typeOfOne;
    private String typeOfTwo;
    private boolean kg;

    public Treino(int type, String title,
                  String typeOfOne, String typeOfTwo, boolean kg){
        this.type = type;
        this.title = title;
        this.typeOfOne = typeOfOne;
        this.typeOfTwo = typeOfTwo;
        this.kg = kg;
    }

    public void isValid(){

    }

    public void changeTitle(String title){

    }

    public void changetypeOfOne(String typeOfOne){

    }

    public void changetypeOfTwo(String typeOfOne){

    }


}

