package classes_em_java_III;

import java.util.ArrayList;

public class Pessoa {

    private String nome;
    private Pessoa pai;
    private Pessoa mae;

    private ArrayList<Carro> carros;

    public Pessoa() {
        this.carros = new ArrayList<>();
    }

    public Pessoa(String nome) {
        this.nome = nome;
        this.carros = new ArrayList<>();
    }

    public Pessoa(String nome, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
        this.carros = new ArrayList<>();
    }

    public void comprarCarro(Carro carro) {
        carro.adicionarMotorista(this);
        this.carros.add(carro);
    }

    public void venderCarro() {
        if (this.carros.isEmpty()) {
            System.out.println("Essa pessoa não possui nenhum carro");
        } else {
            this.carros.remove(0);
        }
    }

    public void todosOsCarros() {
        if (this.carros.isEmpty()) {
            System.out.println("Nenhum carro");
        } else {
            for(Carro c : this.carros) {
                System.out.println(c.getMarca());
            }
        }
    }

    public void adicionarPai(Pessoa pai) {
        this.pai = pai;
    }

    public void adicionarMae(Pessoa mae) {
        this.mae = mae;
    }

    public Pessoa chamarPai() {
        return this.pai;
    }

    public Pessoa chamarMae() {
        return this.mae;
    }
}