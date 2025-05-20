public class Funcionario {
    private String nome;
    private float salarioBruto;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        if(salarioBruto <= 0) {
            throw new IllegalArgumentException("Tentativa de definir um salario bruto com valor nulo ou negativo");
        }
        this.salarioBruto = salarioBruto;
    }

    public void calculaAumento (float percentual) {
        if(percentual < 0) {
            throw new IllegalArgumentException("Tentativa de definir um aumento com valor negativo");
        }
        this.salarioBruto += percentual * salarioBruto / 100;
    }

    public float calculaSalarioLiquido(float valorHorasExtras, int numHorasExtra) {
        if(numHorasExtra < 0) {
            throw new IllegalArgumentException("Tentativa de definir um numero negativo de horas extras");
        }
        if(valorHorasExtras < 0) {
            throw new IllegalArgumentException("Tentativa de definir um valor negativo por hora extra");
        }
        float liquido = (this.salarioBruto + valorHorasExtras * numHorasExtra)*0.92f;
        return Math.round(liquido*100)/100f;
    }

}
