package figuras;

/**
 *
 * @author joseo
 */
public class Retangulo extends FiguraGeometrica {
    
    private double altura;
    private double largura;
    
    @Override
    public double calcularArea() {
        double area = this.altura * this.largura;
        this.setArea(area);
        
        return this.getArea();
    }
    
    @Override
    public double calcularPerimetro() {
        double p = 2 * this.altura + 2 * this.largura;
        this.setPerimetro(p);
        
        return this.getPerimetro();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }   
    
}
