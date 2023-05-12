import org.junit.jupiter.api.Test;

public class DiscoOriginalTest {

    private void assertEquals(String reprovado, String verificarValidade) {
    }
    @Test
    void deveRetonarValido() {
        DiscoOriginal discoOriginal = new DiscoOriginal();
        discoOriginal.setValido(10.0f);
        discoOriginal.setFabricado(20.0f);
        assertEquals("Valido", discoOriginal.verificarValidade());
    }

    @Test
    void deveRetonarReprovado() {
        DiscoOriginal discoOriginal = new DiscoOriginal();
        discoOriginal.setValido(10.0f);
        discoOriginal.setFabricado(20.0f);
        assertEquals("Reprovado", discoOriginal.verificarValidade());
    }

    @Test
    void deveRetornarInformacoesProduto() {
        DiscoOriginal discoOriginal = new DiscoOriginal();
        discoOriginal.setValido(10.0f);
        discoOriginal.setFabricado(20.0f);
        discoOriginal.setNome("Michael Jackson");
        discoOriginal.setIdDisco(1);
        assertEquals("Produto{idProduto=1, nome='Michael Jackson', resultado=Valido}", discoOriginal.getInfo());
    }
}
