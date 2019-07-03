package entidades;

public class Aluno {

    public String nome;
    public double n1;
    public double n2;
    public double n3;

    public double notaFinal() {
        return n1 + n2 + n3;
    }
    
    public double pontos(double mediaFinal){
        return 60.0 - mediaFinal;
    }
}
