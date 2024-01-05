package manager;

import model.Banh;
import model.BanhChung;
import model.BanhTet;

public class BanhFactory {
    public BanhFactory() {
    }
    public static Banh getBanh(TypeBanh type, int dau, int thit, int gao){
        switch (type){
            case BANHTET:
                return new BanhTet(dau, thit, gao);
            case BANHCHUNG:
                return new BanhChung(dau, thit, gao);
            default:
                return null;
        }

    }
}
