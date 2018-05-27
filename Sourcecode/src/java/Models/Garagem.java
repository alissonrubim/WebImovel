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
public class Garagem extends Imovel {

    public int getNumGaragem() {
        return NumGaragem;
    }

    public void setNumGaragem(int NumGaragem) {
        this.NumGaragem = NumGaragem;
    }

    public Garagem(int NumGaragem, int metroQuadrado, double preco, String endereco) {
        super(metroQuadrado, preco, endereco);
        this.NumGaragem = NumGaragem;
    }
    
    public Garagem(){
        super();
    }
    
    private int NumGaragem;
}
