package application;

import java.time.LocalDate;
import java.util.ArrayList;

public class Instrutor extends Pessoa {

	private int rg;
	private LocalDate dataNascimento;
	private ArrayList<Turma> turma;

	public Instrutor() {
		super();
	}

	public Instrutor(String nome, LocalDate dataNascimento, ArrayList<Telefone> telefones,
			ArrayList<Endereco> enderecos, int rg, LocalDate dataNascimento2, ArrayList<Turma> turma) {
		super(nome, dataNascimento, telefones, enderecos);
		this.rg = rg;
		dataNascimento = dataNascimento2;
		this.turma = turma;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public ArrayList<Turma> getTurma() {
		return turma;
	}

	public void setTurma(ArrayList<Turma> turma) {
		this.turma = turma;
	}

}
