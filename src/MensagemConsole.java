public class MensagemConsole implements IMensagem {
    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("Enviando para o console:");
        System.out.println("Destinatário: " + destino);
        System.out.println("Mensagem: " + mensagem);
    }
}