package Mediator;

public class Usuario {
    public String mandarMensagem(String mensagem){
        return Chat.getInstancia().mandarMensagem(mensagem);
    }
    public String adicionarAoGrupo(String numero){
        return Chat.getInstancia().adicionarAoGrupo(numero);
    }
}
