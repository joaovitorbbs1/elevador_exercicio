package exercicios;

public class Principal {

	public static void main(String[] args) {
		Elevador elevador = new Elevador();
		
		// inicializando um objeto elevador com 10 andares e capacidade de 10 pessoas
		elevador.inicializar(10, 10);
		
		//adicioanndo 10 pessoas no elevador
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		
		// adicionando mais 1 para testar o limite de capacidade
		elevador.entrar();
		System.out.println(elevador.getPessoasPresentes());
		
		//removendo as 10 pessoas
		elevador.sair();
		elevador.sair();
		elevador.sair();
		elevador.sair();
		elevador.sair();
		elevador.sair();
		elevador.sair();
		elevador.sair();
		elevador.sair();
		elevador.sair();
		
		//removendo mais 1
		elevador.sair();
		System.out.println(elevador.getPessoasPresentes());
		
		//testar o método de descer
		elevador.descer();
		
		//testar o método de subir até o último andar
		elevador.subir();
		elevador.subir();
		elevador.subir();
		elevador.subir();
		elevador.subir();
		elevador.subir();
		elevador.subir();
		elevador.subir();
		elevador.subir();
		elevador.subir();
		
		//teste de limite do último andar
		elevador.subir();
		System.out.println(elevador.getAndarAtual());
		
	}

}
