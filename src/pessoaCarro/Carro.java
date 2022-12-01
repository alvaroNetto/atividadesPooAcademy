package classes_em_java_III;

import java.util.ArrayList;

public class Carro {

    private String marca;
    private Pessoa dono;
    private ArrayList<Pessoa> dirigidoPor = new ArrayList<>();

    public Carro() {
    }

    public Carro(String marca) {
        this.marca = marca;
    }

    public void novoDono(Pessoa dono) {
        this.dono = dono;
        this.dirigidoPor.add(dono);
    }

    public void adicionarMotorista(Pessoa motorista) {
        this.dirigidoPor.add(motorista);
    }

    public int totalMotorista() {
        return this.dirigidoPor.size();
    }

    public String getMarca() {
        return this.marca;
    }
}