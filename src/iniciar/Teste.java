package iniciar;

/**
 *
 * @author joseo
 */
import figuras.*;
import java.util.Scanner;

public class Teste {

    public static void main(String args[]) {
        FiguraGeometrica[] listaF = new FiguraGeometrica[4];
        System.out.println("Programa Figuras Geométricas");
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < listaF.length; i++) {
            if( i < 2) {
                System.out.println("Círculo " + (i +1));
                System.out.print("Digite o raio: ");
                Circulo c = new Circulo();
                c.setRaio(sc.nextDouble());
                c.calcularArea();
                c.calcularPerimetro();
                listaF[i] = c;
            } else {
                System.out.println("Retangulo " + (i -1));
                System.out.print("Digite a altura: ");
                Retangulo r = new Retangulo();
                r.setAltura(sc.nextDouble());
                System.out.print("Digite a largura: ");
                r.setLargura(sc.nextDouble());
                r.calcularArea();
                r.calcularPerimetro();
                listaF[i] = r;
            }
        }
        
        double somaArea = 0;
        double somaPerimetro = 0;
        
        for (int i = 0; i < listaF.length; i++) {
            somaArea += listaF[i].getArea();
            somaPerimetro += listaF[i].getPerimetro();
        }
        
        System.out.println("__________________________");
        System.out.println("Soma de todas as áreas: " + somaArea);
        System.out.println("Soma de todas os perímetros: " + somaPerimetro);

    }
}
