public class Planeta extends ASTROS {

    private double distanciaSol;
    private double orbitaSol;
    private boolean tieneSatelites;

    public Planeta(double radioEcuatorial, double rotacion, double masa, double temperaturaMedia, double gravedad, double distanciaSol, double orbitaSol, boolean tieneSatelites) {
        super(radioEcuatorial, rotacion, masa, temperaturaMedia, gravedad);
        this.distanciaSol= distanciaSol;
        this.orbitaSol= orbitaSol;
        this.tieneSatelites= tieneSatelites;
    }

    public double getDistanciaSol() {
        return this.distanciaSol;
    }

    public double getOrbitaSol() {
        return this.orbitaSol;
    }

    public boolean isTieneSatelites() {
        return this.tieneSatelites;
    }

    @Override
    public String muestra() {
        return super.toString()+this.toString();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("distanciaSol=").append(distanciaSol).append("\n");
        sb.append("orbitaSol=").append(orbitaSol).append("\n");
        sb.append("tieneSatelites=").append(tieneSatelites).append("\n");
        return sb.toString();
    }
}
