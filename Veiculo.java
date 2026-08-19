public class Veiculo
{
    String marca;
    String modelo;
    int ano;
    int velocidadeAtual;
    
    public Veiculo (String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }
    
    public String obterInfo(){
        return "marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", velocidadeAtual " + velocidadeAtual;
    }
    
	public static void main(String[] args) {
	    Veiculo chevette = new Veiculo("Chevrolet", "Chevette", 1995);
        System.out.println(chevette.obterInfo());
    }
}
