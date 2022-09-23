public class JajarGenjang extends JajarGenjangIntercace {

    @Override
    void luas(double s1, double s2) {
        double luas = s1 * s2;
        System.out.println("Luas Jajar Genjang adalah : " + luas);
    }

    @Override
    void keliling(double s1, double s2) {
        double keliling = 2 * (s1 + s2);
        System.out.println("Keliling Jajar Genjang adalah : " + keliling);
    }
}