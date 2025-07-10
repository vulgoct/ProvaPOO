public class Aluno extends UsuarioBiblioteca {
    private int calcularMulta;

    public Aluno (String nome, int diasAtraso) {
        super(nome, diasAtraso);
    }
    @Override
    public double calcularMulta() {
        return diasAtraso * 0.50;
    }

}
