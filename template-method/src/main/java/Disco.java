public abstract class Disco {
    private int idDisco;
    protected String nome;
    private float valido;
    private float fabricado;

    public int getIdDisco() {
        return idDisco;
    }

    public void setIdDisco(int idDisco) {
        this.idDisco = idDisco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValido() {
        return valido;
    }

    public void setValido(float valido) {
        this.valido = valido;
    }

    public float getFabricado() {
        return fabricado;
    }

    public void setFabricado(float fabricado) {
        this.fabricado = fabricado;
    }

    public float calcularTempoValido() {
        return (this.valido - this.fabricado);
    }

    public abstract String verificarValidade();

    public String getCategoria() {
        return "Disco";
    }

    public String getInfo() {
        return getCategoria() + "{" +
                "idDisco=" + this.idDisco +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarValidade() +
                '}';
    }
}
