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
public class Casa extends Imovel {

    public boolean isTemGaragem() {
        return TemGaragem;
    }

    public void setTemGaragem(boolean TemGaragem) {
        this.TemGaragem = TemGaragem;
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

    public Casa() {
        super();
    }

    public Casa(boolean TemGaragem, int NumGaragem, int NumQuartos, int NumBanheiros, int metroQuadrado, double preco, String endereco) {
        super(metroQuadrado, preco, endereco);
        this.TemGaragem = TemGaragem;
        this.NumGaragem = NumGaragem;
        this.NumQuartos = NumQuartos;
        this.NumBanheiros = NumBanheiros;
    }
    private boolean TemGaragem;
    private int NumGaragem;
    private int NumQuartos;
    private int NumBanheiros;
}
