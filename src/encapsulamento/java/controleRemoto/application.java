package encapsulamento.java.controleRemoto;

import encapsulamento.java.controleRemoto.classes.ControleRemoto;

public class application {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.maisVolume();
        c.play();
        c.abrirMenu();
    }
}
