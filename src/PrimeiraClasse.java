public class PrimeiraClasse {
    public static void main (String args[]){

        Cliente cliente = new Cliente();

        cliente.setNome("Michael Ferreira");
        cliente.setEndereco("Ceara");

        Produtos venda1 = new Produtos();

        venda1.setNome("Carro");

        System.out.println(cliente.getNome());
        System.out.println(cliente.getEndereco());
        System.out.println(venda1.getNome());


    }
}