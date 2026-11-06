public class Servidor extends Usuario {
    private static final int LIMITE = 5;
    private static final double MULTA_POR_DIA = 0.75;

    public Servidor(String nome) {
        super(nome);
    }

    @Override
    public String getTipo() {
        return "servidor";
    }

    @Override
    public int getLimiteEmprestimos() {
        return LIMITE;
    }

    @Override
    public double getMultaPorDia() {
        return MULTA_POR_DIA;
    }
}
