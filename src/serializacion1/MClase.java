package serializacion1;

import java.io.Serializable;

/**
 *
 * @author Alba
 */
public class MClase implements Serializable {

    private String nome;
//    private int numero1;
    private transient int numero1; //+ info sobre los transient: https://www.java67.com/2012/08/what-is-transient-variable-in-java.html
    private double numero2;

    public MClase() {
    }

    public MClase(String nome, int numero1, double numero2) {
        this.nome = nome;
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", numero1=" + numero1 + ", numero2=" + numero2;
    }

}
