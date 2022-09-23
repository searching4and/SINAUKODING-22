public class Persegi implements PersegiInterface{
    
    @Override
    public void kelilingPersegi(double s) {
        double keliling = 4 * s;
        System.out.println("Keliling Persegi adalah " + keliling);
    }

    @Override
    public void luasPersegi(double s) {
        double luas = s * s;
        System.out.println("Luas Persegi adalah " + luas);
    }

}