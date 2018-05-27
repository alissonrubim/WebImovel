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
public class Cobertura extends Apartamento{

    public boolean isTemChurrasqueira() {
        return TemChurrasqueira;
    }

    public void setTemChurrasqueira(boolean TemChurrasqueira) {
        this.TemChurrasqueira = TemChurrasqueira;
    }

    public boolean isTemPiscina() {
        return TemPiscina;
    }

    public void setTemPiscina(boolean TemPiscina) {
        this.TemPiscina = TemPiscina;
    }

    public Cobertura(boolean TemChurrasqueira, boolean TemPiscina, int metroQuadrado, double preco, String endereceo, int andar, int numGaragem, int numQuartos, int numBanheiro) {
        super(metroQuadrado, preco, endereceo, andar, numGaragem, numQuartos, numBanheiro);
        this.TemChurrasqueira = TemChurrasqueira;
        this.TemPiscina = TemPiscina;
    }
    
    public Cobertura(){
        super();
    }
    
    private boolean TemChurrasqueira;
    private boolean TemPiscina;
}
