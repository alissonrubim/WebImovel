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
public class Kitnet extends Apartamento {

    public int getNumQuartos() {
        return NumQuartos;
    }


    public int getNumBanheiros() {
        return NumBanheiros;
    }

    public Kitnet(int metroQuadrado, double preco, String endereceo, int andar, int numGaragem) {
        super(metroQuadrado, preco, endereceo, andar, numGaragem, 1, 1);
    }
    
    public Kitnet(){
        super();
    }
    
    public int NumQuartos = 1;
    public int NumBanheiros = 1;
}
