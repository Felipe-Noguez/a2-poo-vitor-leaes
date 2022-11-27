package application;

public class Barco extends Veiculo{
	
	private int numVelas;

	public Barco() {
		super();
	}	

	public Barco(String nomeFabricante, String paisOrigem, String nome, Fabricante fabricante, int anoFabricacao,
			int capacidade, int numVelas) {
		super(nomeFabricante, paisOrigem, nome, fabricante, anoFabricacao, capacidade);
		this.numVelas = numVelas;
	}

	public int getNumVelas() {
		return numVelas;
	}

	public void setNumVelas(int numVelas) {
		this.numVelas = numVelas;
	}
	
	@Override
	public void acelerar() {
		System.out.println("O barco acelerou.");
	}
	
	@Override
	public void mostrarDetalhes() {
		System.out.println("O barco " + super.getNome()
		+ ", ano "+ super.anoFabricacao 
		+ ", produzido pela " + super.getNomeFabricante()
		+ " (" + super.getPaisOrigem() + ")"
		+ ", a quantidade de velas é " + getNumVelas()
		+ "\" e a capacidade máxima de pessoas é " + super.getCapacidade()
		+ ".");		
	}
	
	public void icarVelas() {
		System.out.println("O barco está com as velas içadas");
	}
	
	public void recolherVelas() {
		System.out.println("Velas recolhidas");
	}

}
