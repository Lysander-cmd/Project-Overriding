
package project_overriding;


public class Main {

    
    public static void main(String[] args) {
        // membuat objek induk
        Induk induk = new Induk();
        
        // membuat objek anak dan mengisi nilai properti
        Anak anak = new Anak();
        anak.harga =  10000;
        anak.jumlah = 2;
        
        // memanggil method total dan diskon
        induk.total();
        induk.diskon();
        
        anak.total();
        anak.diskon();
        
        
        
      
    
        
}
}
