public class Pessoa {

    private String sexo;
    private float peso;
    private float altura;

    public Pessoa(String sexo, float peso, float altura) {
        this.setSexo(sexo);
        this.setPeso(peso);
        this.setAltura(altura);
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if(!(sexo.equals("Masculino") || sexo.equals("Feminino"))) {
            throw new IllegalArgumentException("Tentativa de atribuir sexo invalido");
        }

        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if(peso < 0) {
            throw new IllegalArgumentException("Tentativa de atribuir peso invalido");
        }
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if(altura < 0) {
            throw new IllegalArgumentException("Tentativa de atribuir altura invalida");
        }
        this.altura = altura;
    }

    public String calcularIMC() {
        float imc = this.getPeso() / (this.getAltura()*this.getAltura());
        if(this.getSexo().equals("Feminino")) {
            if(imc < 19.1f) {
                return "abaixo do peso";
            }
            else if(imc < 25.8f) {
                return "no peso normal";
            }
            else if(imc < 27.3f) {
                return "marginalmente acima do peso";
            }
            else if(imc < 32.3f) {
                return "acima do peso ideal";
            }
            else {
                return "obeso";
            }
        }
        else {
            if(imc < 20.7f) {
                return "abaixo do peso";
            }
            else if(imc < 26.4f) {
                return "no peso normal";
            }
            else if(imc < 27.8f) {
                return "marginalmente acima do peso";
            }
            else if(imc < 31.1f) {
                return "acima do peso ideal";
            }
            else {
                return "obeso";
            }
        }
    }
}
