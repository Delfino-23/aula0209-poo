import model.Carro;
import model.Cliente;

public class GerenciarEstacionamento {

    public static void main(String[] args) {
        // 1 cliente que possui dois carros
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.setModelo("Frontier");
        carro1.setMarca("Nissan");
        carro1.setAno(2020);
        carro1.setCor("Branco-escuro");

        // Definir os dados do carro 2
        carro2.setModelo("A3");
        carro2.setMarca("Audio");
        carro2.setAno(2010);
        carro2.setCor("Preto-claro");

        // Jósep Cadura possui dois carros
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Josep Cadura");
        cliente1.setEmail("josep@gmail.com");
        cliente1.setTelefone("123-456-789");
        cliente1.adicionarCarro(carro1);
        cliente1.adicionarCarro(carro2);

        System.out.println(cliente1);
    }

}
