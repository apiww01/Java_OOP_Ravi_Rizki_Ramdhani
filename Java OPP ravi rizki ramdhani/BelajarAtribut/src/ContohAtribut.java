/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class ContohAtribut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Orang Pitung = new Orang();
        Pitung.nama = "Pitung";
        Pitung.alamat = "Bandung";
        Pitung.umur = 30;
        Pitung.menikah = false;
        
        Orang Berlin = new Orang();
        Berlin.nama = "Berlin";
        Berlin.alamat = "Bogor";
        Berlin.umur = 28;
        Berlin.menikah = false;
        
        System.out.println(Pitung.nama);
        System.out.println(Berlin.nama);
    }
    
}
