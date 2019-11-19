package figuras;

/**
 *
 * @author joseo
 */
public abstract class FiguraGeometrica {
    
    private double area;
    private double perimetro;
    
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    
}
