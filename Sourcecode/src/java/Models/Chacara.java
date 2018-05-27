/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Alisson
 */
public class Chacara extends Terreno {

    public boolean isTemPiscina() {
        return TemPiscina;
    }

    public void setTemPiscina(boolean TemPiscina) {
        this.TemPiscina = TemPiscina;
    }

    private boolean TemPiscina;

    public Chacara() {
        super();
    }

    public Chacara(boolean TemPiscina, int metroQuadrado, double preco, String endereco) {
        super(metroQuadrado, preco, endereco);
        this.TemPiscina = TemPiscina;
    }
    
    
}
