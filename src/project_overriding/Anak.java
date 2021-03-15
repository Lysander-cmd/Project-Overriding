
package project_overriding;


public class Anak extends Induk {
    //Membuat variabel integer
    int harga;
    int jumlah;
    int total;
    //Override dari method total
    @Override
    int total(){
        this.total = harga*jumlah;
        System.out.println("Total harga : "+total);
        return total;
    }
    //Override dari method diskon
    @Override
    int diskon(){
        int diskon = (total-(total*20/100));
        System.out.println("Total yang harus dibayarkan : "+diskon);
        return diskon;
    }
}
