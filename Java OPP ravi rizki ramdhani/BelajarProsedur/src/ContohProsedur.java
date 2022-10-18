/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class ContohProsedur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manusia Dio = new Manusia();
        Dio.nama = "Dio Akbar";
        Dio.jeniskelamin = "Laki-Laki";
        Dio.alamat = "Medan";
        
        Manusia Dini = new Manusia();
        Dini.nama = "Dini Wijaya";
        Dini.jeniskelamin = "Perempuan";
        Dini.alamat = "Malang";
        
        Dio.tampilInformasi();
        Dini.tampilInformasi();
    }
    
}
