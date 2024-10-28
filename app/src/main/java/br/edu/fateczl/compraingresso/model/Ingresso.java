package br.edu.fateczl.compraingresso.model;

public class Ingresso {

    private String id;
    private float valor;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }

    public float valorFinal (float taxa) {
        float valor = getValor();
        valor = valor + ((taxa/100)*valor);
        return valor;
    }
}