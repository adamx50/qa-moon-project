package br.com.qa;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TesteServicoDeNotificacao {

    @Test
    public void testNotificar() {
        // Cria um mock do serviço de notificação
        ServicoDeNotificacao servicoMock = Mockito.mock(ServicoDeNotificacao.class);

        // Chamando o método da classe que será mockado
        servicoMock.enviarNotificacao("Mensagem Teste");

        // Verificando se o método foi chamado
        Mockito.verify(servicoMock).enviarNotificacao("Mensagem Teste");
    }
}
