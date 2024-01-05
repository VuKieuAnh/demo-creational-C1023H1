package views;

import manager.BanhFactory;
import model.Banh;
import model.BanhTet;
import model.TongGiamDoc;

public class Main {
    public static void main(String[] args) {
        TongGiamDoc phuong = TongGiamDoc.getInstance("Tran Duc Phuong", "phuong123");
        System.out.println(phuong);
        TongGiamDoc nyPhuong = TongGiamDoc.getInstance("Ny Phuong", "phuongdemo");
        System.out.println(nyPhuong);

    }

    public static Banh createNewBanh(){
        //scanner
        Banh banh = BanhFactory.getBanh(1, 2, 3, 4);
        return banh;
    }
}
