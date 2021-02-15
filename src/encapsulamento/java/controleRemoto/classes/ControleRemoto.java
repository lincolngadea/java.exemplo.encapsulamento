package encapsulamento.java.controleRemoto.classes;

import encapsulamento.java.controleRemoto.interfaces.Controlador;

public class ControleRemoto implements Controlador {
    private Integer volume = 50;
    private boolean ligado = false;
    private boolean tocando = false;

    public ControleRemoto(Integer volume, boolean ligado, boolean tocando) {
        this.volume = volume;
        this.ligado = ligado;
        this.tocando = tocando;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {

    }

    @Override
    public void desligar() {

    }

    @Override
    public void abrirMenu() {

    }

    @Override
    public void fecharMenu() {

    }

    @Override
    public void maisVolume() {

    }

    @Override
    public void menosVolume() {

    }

    @Override
    public void ligarMudo() {

    }

    @Override
    public void desligarMudo() {

    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }
}
