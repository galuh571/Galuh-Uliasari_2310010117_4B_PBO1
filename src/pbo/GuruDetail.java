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
public class GuruDetail extends Guru{
    //overriding
    public GuruDetail(String nama,String nip){
        super(nama,nip);
    }
    
    public int getTahunMasuk(){
        return Integer.parseInt(getNip().substring(0,2))+2000;
    }
     public String getJurusan(){
         String kodeJurusan= getNip().substring(2,4);
         //seleksi if
         if(kodeJurusan.equals("10")) {
             return "Jurusan Bahasa Indonesia";
               }else{
             return"Jurusan lain";
         }
}
     public String getTahun(){
         String kodeJurusan = getNip().substring(4,6);
         //seleksi Switch
         switch(kodeJurusan){
             case"01":
                 return "Jurusan Bahasa Indonesia";
             case "02":
                 return "Jurusan Bahasa Inggris";
             default:
                 return "Jurusan lain";
         }
     }
     
public int getGolongan(){
    return Integer.parseInt(getNip().substring(6));
}

//polymorphism(overriding)
@Override
public String displayInfo(){
    return super.displayInfo()+
           "\nTahun Masuk:"+getTahunMasuk()+
           "\nJurusan:"+getJurusan()+
           "\nKodeJurusan:"+getTahun()+
           "\nGolongan:"+getGolongan();
}
}
