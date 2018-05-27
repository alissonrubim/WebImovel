/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Models.Storage.FakeStorage;

/**
 *
 * @author Alisson
 */
public abstract class BaseModel {
    private int id;
    
    public BaseModel(){
        id = FakeStorage.NextId;
        FakeStorage.NextId++;
    }
    
    public int getId(){
        return this.id;
    }
}
