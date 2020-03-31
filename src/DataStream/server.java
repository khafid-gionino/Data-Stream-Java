/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStream;
import java.net.*;
import java.io.*;

/**
 *
 * @author asus
 */
public class server {
    private static final int SRV_PORT=5000;
    
    public static void main(String argv[]) throws IOException, ClassNotFoundException{
    //membuat soket server dan menunggu koneksi
    ServerSocket server = new ServerSocket(SRV_PORT);
    System.out.println("Server berjalan............");
    Socket soket = server.accept();
    
    //membuat stream untuk baca obyek
    InputStream is = soket.getInputStream();
    ObjectInputStream ibs = new ObjectInputStream(is);
    
    //menunggu dan membaca obyek yang dikirimkan
    mahasiswa mhs = (mahasiswa) ibs.readObject();

    System.out.println("\nServer menerima data ");
    mhs.cetak();
    
    System.out.println("\nSemua Data berhasil di terima !!");
    
    soket.close();
    } 
}
