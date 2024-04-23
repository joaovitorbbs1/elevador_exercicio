package exercicios;

public class Elevador {
	private int capacidade;
	private int andarAtual = 0;
	private int totalDeAndares;
	private int pessoasPresentes = 0;
	
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
	public int getTotalDeAndares() {
		return totalDeAndares;
	}
	public void setTotalDeAndares(int totalDeAndares) {
		this.totalDeAndares = totalDeAndares;
	}
	public int getPessoasPresentes() {
		return pessoasPresentes;
	}
	public void setPessoasPresentes(int pessoasPresentes) {
		this.pessoasPresentes = pessoasPresentes;
	}
	
	public void inicializar(int totalAndares, int capacidade) {
		this.setTotalDeAndares(totalAndares);
		this.setCapacidade(capacidade);
	}
	
	public void entrar() {
		if (this.getCapacidade() > this.getPessoasPresentes()) {
			System.out.println("Pode entrar!");
			this.setPessoasPresentes(this.getPessoasPresentes()+1);
		} else {
			System.out.println("O elevador está cheio!");
		}
	}
	
	public void sair() {
		if (this.getPessoasPresentes()>0) {
			this.setPessoasPresentes(this.getPessoasPresentes()-1);
			if (this.getPessoasPresentes()>0) {
				System.out.println("Há no elevador "+this.getPessoasPresentes()+" pessoa(s)");
			} else {
				System.out.println("O elevador ficou vazio!");
			}
		} else {
			System.out.println("Elevador vazio!");
		}
	}
	
	public void subir() {
		if (this.getAndarAtual() == this.getTotalDeAndares()) {
			System.out.println("Você já está no último andar!");
		} else {
			this.setAndarAtual(this.getAndarAtual()+1);
			if (this.getAndarAtual()>0) {
				System.out.println("Você está no "+this.getAndarAtual()+"º andar!");
			} else {
				System.out.println("Você está no térreo!");
			}
		}
	}
	
	public void descer() {
		if (this.getAndarAtual() == 0) {
			System.out.println("Você já está no térreo!");
		} else {
			this.setAndarAtual(this.getAndarAtual()-1);
			if (this.getAndarAtual()==0) {
				System.out.println("Você está no térreo!");
			} else {
				System.out.println("Você está no "+this.getAndarAtual()+"º andar!");
			}
		}
	}
}
