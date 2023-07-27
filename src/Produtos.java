public class Produtos {

    private String nome;
    private int codigo;

    /**
     *
     * Retornar o nome do produto
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     * Setta o nome do produto na variavel nome
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
