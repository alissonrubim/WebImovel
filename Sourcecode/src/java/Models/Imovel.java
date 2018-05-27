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
public class Imovel extends BaseModel{

    public int getMetroQuadrado() {
        return MetroQuadrado;
    }

    public void setMetroQuadrado(int MetroQuadrado) {
        this.MetroQuadrado = MetroQuadrado;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }
    protected int MetroQuadrado;
    protected double Preco;
    protected String Endereco;
    
    public Imovel(){
        super();
    }
    
    public Imovel(int metroQuadrado, double preco, String endereco){
        super();
        this.MetroQuadrado = metroQuadrado;
        this.Preco = preco;
        this.Endereco = endereco;
    }
}
