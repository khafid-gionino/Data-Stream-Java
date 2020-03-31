/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStream;
import java.io.*;

/**
 *
 * @author asus
 */
public class mahasiswa implements Serializable{
    String nama;
    String npm;
    String jurusan;
    
    public mahasiswa (String nama, String npm, String jurusan){
        this.nama = nama;
        this.npm = npm;
        this.jurusan = jurusan;
    }

    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public String getJurusan() {
        return jurusan;
    }
    
    
    public void cetak(){
        System.out.println("Data Mahasiswa : ");
        System.out.println("Nama    : "+nama);
        System.out.println("Npm     : "+npm);
        System.out.println("Jurusan : "+jurusan);
    }
}
