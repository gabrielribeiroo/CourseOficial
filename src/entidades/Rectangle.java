
package entidades;


public class Rectangle {
    public double altura;
    public double largura;
    
    public double Area (){
        return largura * altura;
    }
    
    public double Perimetro(){
        return (2*largura) + (2 * altura);
    }
    
    public double Diagonal(){
        return Math.sqrt((Math.pow(largura, 2) + Math.pow(altura, 2)));
    }
    
}
