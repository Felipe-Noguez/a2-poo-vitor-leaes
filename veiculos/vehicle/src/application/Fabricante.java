package application;

public class Fabricante {
	
	private String nomeFabricante;
	private String paisOrigem;
	
	public Fabricante() {
	}	

	public Fabricante(String nomeFabricante, String paisOrigem) {
		this.nomeFabricante = nomeFabricante;
		this.paisOrigem = paisOrigem;
	}

	public String getNomeFabricante() {
		return nomeFabricante;
	}

	public void setNomeFabricante(String nomeFabricante) {
		this.nomeFabricante = nomeFabricante;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	
}
