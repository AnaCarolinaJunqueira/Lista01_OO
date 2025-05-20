public class UsuarioCombustivel {
    private String nome;
    private float qtdQuilometrosRodados;
    private float litrosCombustivelConsumidos;

    public UsuarioCombustivel(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public float getLitrosCombustivelConsumidos() {
        return litrosCombustivelConsumidos;
    }

    public void setLitrosCombustivelConsumidos(float litrosCombustivelConsumidos) {
        if(litrosCombustivelConsumidos < 0)
        {
            throw new IllegalArgumentException("Tentativa de definir quantidade negativa de litros de combustivel");
        }
        this.litrosCombustivelConsumidos = litrosCombustivelConsumidos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getQtdQuilometrosRodados() {
        return qtdQuilometrosRodados;
    }

    public void setQtdQuilometrosRodados(float qtdQuilometrosRodados) {
        if(qtdQuilometrosRodados < 0)
        {
            throw new IllegalArgumentException("Tentativa de definir quantidade negativa de quilometros rodados");
        }
        this.qtdQuilometrosRodados = qtdQuilometrosRodados;
    }

    public float calculaMediaCombustivelGasto() {
        return this.litrosCombustivelConsumidos/this.qtdQuilometrosRodados;
    }
}
