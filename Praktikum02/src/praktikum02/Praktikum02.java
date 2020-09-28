/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum02;
class keramik{
    int luas = 1000000, panjang, lebar, isi, harga;
    keramik (int p, int l, int i, int h) {
        panjang = p;
        lebar = l;
        isi = i;
        harga = h;
    }
    int hitungKeramik(){
        int jumlahKeramik = (luas / (panjang * lebar));
        return jumlahKeramik; 
    }
    int hitungBox(){
        int jumlahBox = (luas / (panjang * lebar)) / isi;
        return jumlahBox;
    }
    int hitungHarga(){
        int jumlahTotal = ((luas / (panjang * lebar)) / isi) * harga;
        return jumlahTotal;
    }
}
/**
 *
 * @author afiff
 */
public class Praktikum02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        keramik A = new keramik(30, 30, 10, 54000);
        keramik B = new keramik(40, 40, 5, 65000);
        keramik C = new keramik(30, 40, 8, 60000);

        /*Keramik A*/
        System.out.println ("Jumlah Keramik yang Dibutuhkan : " + A.hitungKeramik() + " pcs");
        System.out.println ("Sebanyak " + A.hitungBox() + " box");
        System.out.println ("Jadi, total Harga Keramik Rp." + A.hitungHarga());

        /*Keramik B*/
        System.out.println ("Jumlah Keramik yang Dibutuhkan : " + B.hitungKeramik() + " pcs");
        System.out.println ("Sebanyak " + B.hitungBox() + " box");
        System.out.println ("Jadi, total Harga Keramik Rp." + B.hitungHarga());
        
        /*Keramik C*/
        System.out.println ("Jumlah Keramik Yang Dibutuhkan = " + C.hitungKeramik() + " pcs");
        System.out.println ("Sebanyak " + C.hitungBox() + " box");
        System.out.println ("Jadi, total Harga Keramik Rp." + C.hitungHarga());   
    }
    
}
