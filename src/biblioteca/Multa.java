package biblioteca;

/**
 *
 * @author Alexey
 */
public class Multa {

    private double multaTotal;

    public Multa(double multa) {
        this.multaTotal = multa;
    }

    public double calcularMulta(int diasRetraso) {
        try {
            if (diasRetraso < 0) {
                throw new IllegalArgumentException("Los retrasos no pueden ser negativos");
            }
            return diasRetraso * getMultaTotal();
        } catch (IllegalArgumentException e) {
            return Double.POSITIVE_INFINITY;
        }
    }
    
    public void aplicarDescuento(double porcentaje) {
        multaTotal = getMultaTotal() - (getMultaTotal() / 100 * porcentaje);
    }

    /**
     * @return the multaTotal
     */
    public double getMultaTotal() {
        return multaTotal;
    }
}
