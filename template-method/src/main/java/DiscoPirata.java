public class DiscoPirata extends Disco{
    public String verificarValidade() {
        if (this.calcularTempoValido() >= 10.0f) {
            return "Valido";
        }
        else {
            return "Reprovado";
        }
    }
}
