package uz.dawo;

public class RightTriangle {

    private int firstKatet;
    private int secondKatet;
    private int gipatinuza;

    public RightTriangle() {
    }

    public RightTriangle(int firstKatet, int secondKatet, int gipatinuza) {
        this.firstKatet = firstKatet;
        this.secondKatet = secondKatet;
        this.gipatinuza = gipatinuza;
    }

    public int getFirstKatet() {
        return firstKatet;
    }

    public void setFirstKatet(int firstKatet) {
        this.firstKatet = firstKatet;
    }

    public int getSecondKatet() {
        return secondKatet;
    }

    public void setSecondKatet(int secondKatet) {
        this.secondKatet = secondKatet;
    }

    public int getGipatinuza() {
        return gipatinuza;
    }

    public void setGipatinuza(int gipatinuza) {
        this.gipatinuza = gipatinuza;
    }

    @Override
    public String toString() {
        return "RightTriangle{" +
                "firstKatet=" + firstKatet +
                ", secondKatet=" + secondKatet +
                ", gipatinuza=" + gipatinuza +
                '}';
    }
}
