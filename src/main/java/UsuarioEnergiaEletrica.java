public class UsuarioEnergiaEletrica {
    private String nome;
    private float consumoQuilowatts;

    public UsuarioEnergiaEletrica(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getConsumoQuilowatts() {
        return consumoQuilowatts;
    }

    public void setConsumoQuilowatts(float consumo) {
        if(consumo < 0) {
            throw new IllegalArgumentException("Tentativa de definir consumo de quilowatts negativos");
        }
        this.consumoQuilowatts = consumo;
    }

    public float calculaValorAPagar() {
        float valor = consumoQuilowatts*0.12f*1.18f;
        return Math.round(valor*100)/100f;
    }
}
