import java.math.BigDecimal;
import java.util.ArrayList;

public class Multiplier {

    public int Multiply(int x, int y){
        return x*y;
    }

    public int Multiply(int x, int y, int w, int q) {
        return x*y*w*q;
    }

    public BigDecimal Multiply(BigDecimal a, BigDecimal b){
        return a.multiply(b);
    }

    public int Multiply(ArrayList<Integer> lista) {
        int wynik = 1;
        for (int i = 0; i < lista.size(); i++) {
            wynik *= lista.get(i);
        }
        return wynik;
    }
}
