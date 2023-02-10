import java.lang.ref.PhantomReference;

public class Tiget extends Animal {
    private String tigerrrrrrr;
    public Tiget(String f, int e) {
        super(f, e);
    }

    public String getTigerrrrrrr() {
        return tigerrrrrrr;
    }

    public void setTigerrrrrrr(String tigerrrrrrr) {
        this.tigerrrrrrr = tigerrrrrrr;
    }

    @Override
    public String toString() {
        return super.toString() + " "+  this.getTigerrrrrrr();
    }
}
