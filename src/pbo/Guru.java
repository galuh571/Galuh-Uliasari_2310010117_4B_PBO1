/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

/**
 *
 * @author LENOVO
 */
public class Guru {
    //class
    
    //atribut dan encapsulation
    private String nama;
    private String nip;
    
    //constructor
    public Guru(String nama,String nip){
        this.nama = nama;
        this.nip = nip;
    }
    
    //mutator(setter)
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setNip(String nip){
        this.nip = nip;
    }
    
    //accessor(getter)
    public String getNama(){
        return nama;
    }
    
    public String getNip(){
        return nip;
    }
    
    public String displayInfo(){
        return "Nama:"+getNama()+"\nNIP:"+getNip();
    }
    
    //polymorphism (overloading)
    public String displayInfo(String statuskepegawaian){
        return displayInfo()+"\nStatusKepegawaian:"+statuskepegawaian;
    }
}
