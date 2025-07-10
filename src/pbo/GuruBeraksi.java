/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.util.Scanner;

public class GuruBeraksi {
    public static void main(String[] args){
        //objek
        //Guru gru = new Guru("Galuh Uliasari",2310010117";
        
        //System.out.println(gru.displayInfo());
        //Sysytem.outprintln(gru.displayInfo("4B"));
        
        //error handling
        try{
            //io sederhana
            Scanner scanner = new Scanner(System.in);
            
            //array
            GuruDetail[] gru = new GuruDetail[2];
            
            //perulangan
            for(int i=0; i<gru.length; i++){
                System.out.print("Masukan nama guru "+(i+1)+":");
                String nama = scanner.nextLine();
                System.out.print("Masukan NIP guru "+(i+1)+":");
                String nip = scanner.nextLine();
                
                //objek
                gru[i] = new GuruDetail(nama, nip);
            }
            
            //perulangan
            for(GuruDetail data: gru){
                System.out.println("==============");
                System.out.println("Data Guru:    "); 
                System.out.println(data.displayInfo());
            }
            //Error Handling
        } catch (NumberFormatException e){
            System.out.println("Kesalahan format nomor:"+e.getMessage());
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan format NIP:"+e.getMessage());
        }catch (Exception e){
            System.out.println("Kesalahan umum:"+e.getMessage());
        }
        
        
    }
    
}
