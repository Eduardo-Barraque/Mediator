package Mediator;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {

    @Test
    void deveMandarMensagem(){
        Participante participante = new Participante();
        assertEquals("Mensagem enviada: Bom dia!",Chat.getInstancia().mandarMensagem("Bom dia!"));
    }

    @Test
    void deveAdicionarAoGrupo(){
        Participante participante = new Participante();
        assertEquals("Numero: 24999998888 adicionado ao grupo", Chat.getInstancia().adicionarAoGrupo("24999998888"));
    }

}
