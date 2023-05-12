package Mediator;

public class Grupo {
    private static Grupo grupo = new Grupo();
    private Grupo(){}
    public  static Grupo getInstance(){
        return grupo;
    }

    public String mandarMensagem(String mensagem){
        return "Mensagem enviada: " + mensagem;
    }
    public String adicionarAoGrupo(String numero){
        return "Numero: "+ numero + " adicionado ao grupo";
    }
}
