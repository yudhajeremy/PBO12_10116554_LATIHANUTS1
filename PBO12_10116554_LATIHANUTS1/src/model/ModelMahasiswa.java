/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Jemmy
 */
public class ModelMahasiswa {
    public String nama;
    public String nim;
    
    public ModelMahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;        
}

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }
    
          
    
}
