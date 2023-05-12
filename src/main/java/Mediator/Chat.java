package Mediator;

public class Chat {
    private static Chat chat = new Chat();

    private Chat() {}

    public static Chat getInstancia() {
        return chat;
    }

    public String mandarMensagem(String mensagem){
        return Grupo.getInstance().mandarMensagem(mensagem);
    }
    public String adicionarAoGrupo(String numero){
        return  Grupo.getInstance().adicionarAoGrupo(numero);
    }
}
