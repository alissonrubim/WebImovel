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
public class Loja extends Imovel {

    public boolean isTemArmazem() {
        return TemArmazem;
    }

    public void setTemArmazem(boolean TemArmazem) {
        this.TemArmazem = TemArmazem;
    }

    public boolean isTemEstacionamento() {
        return TemEstacionamento;
    }

    public void setTemEstacionamento(boolean TemEstacionamento) {
        this.TemEstacionamento = TemEstacionamento;
    }

    public Loja(boolean TemArmazem, boolean TemEstacionamento, int metroQuadrado, double preco, String endereco) {
        super(metroQuadrado, preco, endereco);
        this.TemArmazem = TemArmazem;
        this.TemEstacionamento = TemEstacionamento;
    }
    
    public Loja(){
        super();
    }
    
    public boolean TemArmazem;
    public boolean TemEstacionamento;
}
