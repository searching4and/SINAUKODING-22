public class PersegiPanjang extends PersegiPanjangAbstract {

    @Override
    void luas(double p, double l) {
        double luas = p * l;
        System.out.println("Luas Persegi Panjang adalah : " + luas);
    }

    @Override
    void keliling(double p, double l) {
        double keliling = 2 * (p * l);
        System.out.println("Keliling Persegi Panjang adalah : " + keliling);
    }
}