package classes_em_java_III;

public class PessoaCarroImpl {

    public static void main(String[] args) {
        Pessoa pai = new Pessoa("Caião");
        Pessoa mae = new Pessoa("Caia");

        Pessoa filho = new Pessoa("Caio", pai, mae);

        System.out.print("Total de carros do filho: ");
        filho.todosOsCarros();

        System.out.println("=======================ADD CARRO======================");

        Carro carro = new Carro("Mustang");

        System.out.println("Carro: " + carro.getMarca());
        System.out.println("Dirigido por " + carro.totalMotorista() + " motorista(s)");

        System.out.println("==========================ATUALIZACAO==================================");

        filho.comprarCarro(carro);

        System.out.print("Total de carros do filho: ");
        filho.todosOsCarros();

        System.out.println("Carro: " + carro.getMarca());
        System.out.println("Dirigido por " + carro.totalMotorista() + " motorista(s)");
    }

}
