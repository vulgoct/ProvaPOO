public class Visitantes extends UsuarioBiblioteca{

    public Visitantes(String nome, int diasAtraso) {
        super(nome, diasAtraso);
    }
    @Override
    public double calcularMulta() {
        return diasAtraso * 1.00;
    }
}