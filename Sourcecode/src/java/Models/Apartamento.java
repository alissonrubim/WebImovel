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
public class Apartamento extends Imovel {

    public int getAndar() {
        return Andar;
    }

    public void setAndar(int Andar) {
        this.Andar = Andar;
    }

    public int getNumGaragem() {
        return NumGaragem;
    }

    public void setNumGaragem(int NumGaragem) {
        this.NumGaragem = NumGaragem;
    }

    public int getNumQuartos() {
        return NumQuartos;
    }

    public void setNumQuartos(int NumQuartos) {
        this.NumQuartos = NumQuartos;
    }

    public int getNumBanheiros() {
        return NumBanheiros;
    }

    public void setNumBanheiros(int NumBanheiros) {
        this.NumBanheiros = NumBanheiros;
    }
    private int Andar;
    private int NumGaragem;
    private int NumQuartos;
    private int NumBanheiros;
    
    public Apartamento(){
        super();
    }
    
    public Apartamento(int metroQuadrado, double preco, String endereceo, int andar, int numGaragem, int numQuartos, int numBanheiro){
        super(metroQuadrado, preco, endereceo);
        this.Andar = andar;
        this.NumGaragem = numGaragem;
        this.NumBanheiros = numBanheiro;
        this.NumQuartos = numQuartos;
    }
}
