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
public class Terreno extends Imovel{
    public double Hectares(){
        return this.MetroQuadrado * 0.0001;
    }

    public Terreno() {
        super();
    }

    public Terreno(int metroQuadrado, double preco, String endereco) {
        super(metroQuadrado, preco, endereco);
    }
    
}
