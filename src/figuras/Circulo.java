package figuras;

/**
 *
 * @author joseo
 */
public class Circulo extends FiguraGeometrica {
    
    private double raio;
    
    @Override
    public double calcularArea() {
        double area = this.raio * this.raio * 3.14;
        this.setArea(area);
        
        return this.getArea();
    }
    
    @Override
    public double calcularPerimetro() {
        double p = 2 * this.raio * 3.14;
        this.setPerimetro(p);
        
        return this.getPerimetro();
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    
}
