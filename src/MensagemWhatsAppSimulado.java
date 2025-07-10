public class MensagemWhatsAppSimulado implements IMensagem {
    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("Simulando envio via WhatsApp:");
        System.out.println("WhatsApp para: " + destino);
        System.out.println("Mensagem: " + mensagem);
    }
}