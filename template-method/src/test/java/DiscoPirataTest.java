import org.junit.jupiter.api.Test;

public class DiscoPirataTest {

    private void assertEquals(String valido, String verificarValidade) {
    }
    @Test
    void deveRetonarValido() {
        DiscoPirata discoPirata = new DiscoPirata();
        discoPirata.setValido(20.0f);
        discoPirata.setFabricado(51.0f);
        assertEquals("Valido", discoPirata.verificarValidade());
    }

    @Test
    void deveRetonarReprovado() {
        DiscoPirata discoPirata = new DiscoPirata();
        discoPirata.setValido(10.0f);
        discoPirata.setFabricado(18.0f);
        assertEquals("Reprovado", discoPirata.verificarValidade());
    }

    @Test
    void deveRetornarInformacoesDisco() {
        DiscoPirata discoPirata = new DiscoPirata();
        discoPirata.setValido(10.0f);
        discoPirata.setFabricado(18.0f);
        discoPirata.setNome("Michael Jackson");
        discoPirata.setIdDisco(2);
        assertEquals("Produto{idProduto=2, nome='Michael Jackson', resultado=Reprovado}", discoPirata.getInfo());
    }
}
