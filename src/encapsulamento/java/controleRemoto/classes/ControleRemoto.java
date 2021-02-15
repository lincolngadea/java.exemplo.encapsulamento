package encapsulamento.java.controleRemoto.classes;

import encapsulamento.java.controleRemoto.interfaces.Controlador;

public class ControleRemoto implements Controlador {
    private Integer volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
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
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-------- MENU ------");
        System.out.println("Está Ligado? "+this.isLigado());
        System.out.println("Está tocando?"+this.isTocando());
        System.out.print("Volume "+this.getVolume()+" ");
        for(int i = 0; i <= getVolume(); i+=10){
            System.out.print("| ");
        }

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(this.isLigado()){
            setVolume(getVolume()+5);
        }else{
            System.out.println("Impossivel aumentar volume!");
        }
    }

    @Override
    public void menosVolume() {
        if(this.isLigado()){
            setVolume(getVolume()-5);
        }else{
            System.out.println("Impossivel reduzir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() > 0 ){
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.getVolume() == 0){
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !this.isTocando()){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }
    }
}
