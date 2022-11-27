package application;

public class Program {

	public static void main(String[] args) {
		
		Automovel auto1 = new Automovel();
		Aviao aviao1 = new Aviao();
		Barco barco1 = new Barco();
		
		Automovel auto2 = new Automovel();
		Aviao aviao2 = new Aviao();
		Barco barco2 = new Barco();
		
		auto1.setNomeFabricante("Dodge");
		auto1.setNome("RAM 2500");
		auto1.setAnoFabricacao(2022);
		auto1.setPaisOrigem("US");
		auto1.setDiametroRoda(18);
		auto1.setCapacidade(5);
		
		auto1.mostrarDetalhes();
		auto1.acelerar();
		auto1.abrirPortaMalas();
		
		auto2.setNomeFabricante("Porsche");
		auto2.setNome("911");
		auto2.setAnoFabricacao(1991);
		auto2.setPaisOrigem("DE");
		auto2.setDiametroRoda(17);
		auto2.setCapacidade(2);
		
		auto2.mostrarDetalhes();
		auto2.acelerar();
		auto2.abrirPortaMalas();
		
		aviao1.setNomeFabricante("Boeing");
		aviao1.setNome("737");
		aviao1.setAnoFabricacao(1990);
		aviao1.setPaisOrigem("US");
		aviao1.setNumTurbinas(24);
		aviao1.setCapacidade(200);
		
		aviao1.mostrarDetalhes();
		aviao1.decolar();
		aviao1.pousar();
		
		aviao2.setNomeFabricante("Airbus");
		aviao2.setNome("A380");
		aviao2.setAnoFabricacao(2005);
		aviao2.setPaisOrigem("DE");
		aviao2.setNumTurbinas(4);
		aviao2.setCapacidade(525);
		
		aviao2.mostrarDetalhes();
		aviao2.decolar();
		aviao2.pousar();
		
		barco1.setNomeFabricante("Maramar");
		barco1.setNome("Praia 47");
		barco1.setAnoFabricacao(2014);
		barco1.setPaisOrigem("BR");
		barco1.setNumVelas(2);
		barco1.setCapacidade(6);
		
		barco1.mostrarDetalhes();
		barco1.acelerar();
		barco1.icarVelas();
		barco1.recolherVelas();
		
		barco2.setNomeFabricante("COTA (1/8) MAIN");
		barco2.setNome("MAIN 34");
		barco2.setAnoFabricacao(1986);
		barco2.setPaisOrigem("BR");
		barco2.setNumVelas(4);
		barco2.setCapacidade(8);
		
		barco2.mostrarDetalhes();
		barco2.acelerar();
		barco2.icarVelas();
		barco2.recolherVelas();
		
		
		
		

	}

}
