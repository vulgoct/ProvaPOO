public abstract class UsuarioBiblioteca {
    protected String nome;
    protected int diasAtraso;

    public UsuarioBiblioteca(String nome, int diasAtraso) {
        this.nome = nome;
        this.diasAtraso = diasAtraso;

    }
    public abstract double calcularMulta();

    public void exibirInformaçoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Dias de Atraso: " + diasAtraso);
    }
    public String getResumo(){
        return "Nome: " + nome + "|" + "Dias de Atraso: " + diasAtraso;
    }
}
