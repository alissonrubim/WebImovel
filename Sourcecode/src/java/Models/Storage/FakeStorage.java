/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Storage;

import java.util.ArrayList;

/**
 *
 * @author Alisson
 */
public class FakeStorage {
    public static int NextId = 1;
    
    private static boolean started = false;
    public static void StartFake(){
        if(!started){
            FakeStorage.Usuario.List.add(new Models.Usuario("admin", "1234"));
            
            started = true;
        }
    }
    
    public static class Usuario {
        public static ArrayList<Models.Usuario> List = new ArrayList<Models.Usuario>();
    }
    
    public static class Apartamento {
        public static ArrayList<Models.Apartamento> List = new ArrayList<Models.Apartamento>();
    }
    
    public static class Casa {
        public static ArrayList<Models.Casa> List = new ArrayList<Models.Casa>();
    }
    
    public static class Chacara {
        public static ArrayList<Models.Chacara> List = new ArrayList<Models.Chacara>();
    }
    
    public static class Cobertura {
        public static ArrayList<Models.Cobertura> List = new ArrayList<Models.Cobertura>();
    }
    
    public static class Flat {
        public static ArrayList<Models.Flat> List = new ArrayList<Models.Flat>();
    }
    
    public static class Garagem {
        public static ArrayList<Models.Garagem> List = new ArrayList<Models.Garagem>();
    }
    
    public static class Kitnet {
        public static ArrayList<Models.Kitnet> List = new ArrayList<Models.Kitnet>();
    }
    
    public static class Loja {
        public static ArrayList<Models.Loja> List = new ArrayList<Models.Loja>();
    }
    
    public static class Sobrado {
        public static ArrayList<Models.Sobrado> List = new ArrayList<Models.Sobrado>();
    }
    
    public static class Terreno {
        public static ArrayList<Models.Terreno> List = new ArrayList<Models.Terreno>();
    }
    
}
