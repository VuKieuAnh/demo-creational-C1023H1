package views;

import manager.BanhFactory;
import manager.TypeBanh;
import model.Banh;
import model.BanhTet;
import model.TongGiamDoc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TongGiamDoc phuong = TongGiamDoc.getInstance("Tran Duc Phuong", "phuong123");
        System.out.println(phuong);
        TongGiamDoc nyPhuong = TongGiamDoc.getInstance("Ny Phuong", "phuongdemo");
        System.out.println(nyPhuong);

    }

    public static Banh createNewBanh(){
        //scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap 1 de chon banh tet");
        System.out.println("Moi ban nhap 2 de chon banh chung");
        TypeBanh typeBanh;
        int type= scanner.nextInt();
        typeBanh = type==1?TypeBanh.BANHTET:TypeBanh.BANHCHUNG;
        Banh banh = BanhFactory.getBanh(typeBanh, 2, 3, 4);
        return banh;
    }
}
