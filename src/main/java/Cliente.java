public class Cliente {

    private float valor;

    public float getValor() {
        return valor;
    }

    public void somarValor(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.valor = calculadora.calcular(new OperacaoSomar());
    }

    public void subtrairValor(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.valor = calculadora.calcular(new OperacaoSubtrair());
    }

    public void dividirValor(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.valor = calculadora.calcular(new OperacaoDividir());
    }


    public void multiplicarValor(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.valor = calculadora.calcular(new OperacaoMultiplicar());
    }

}
