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
public class Sobrado extends Casa{
    private final boolean TemGaragem = false;

    public Sobrado() {
        super();
    }

    public Sobrado(boolean TemGaragem, int NumGaragem, int NumQuartos, int NumBanheiros, int metroQuadrado, double preco, String endereco) {
        super(TemGaragem, NumGaragem, NumQuartos, NumBanheiros, metroQuadrado, preco, endereco);
    }
    
    
    
    
}
