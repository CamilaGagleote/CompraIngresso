package br.edu.fateczl.compraingresso.model;

public class VIP extends Ingresso{

    @Override
    public String getId() {
        return super.getId();
    }
    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public float getValor() {
        return super.getValor();
    }
    @Override
    public void setValor(float valor) {
        super.setValor(valor);
    }

    @Override
    public float valorFinal(float taxa) {
        float valor = getValor();
        valor += (taxa / 100) * valor;
        valor += (18 / 100.0f) * getValor();
        return valor;
    }
}