package Problema;
public class LanceIncremento implements Runnable {

	private Incremento incremento;
	private Leilao leilao;

	public LanceIncremento(Incremento incremento, Leilao leilao) {
		super();
		this.incremento = incremento;
		this.leilao = leilao;
	}

	public void run() {
		synchronized (leilao) {
			System.out
					.println("Iniciando Lance Incremento no Leilao com valor corrente "
							+ leilao.getValorCorrente());
			synchronized (incremento) {
				incremento.dobrar();
				int valor = incremento.getValor();
				leilao.darLance(valor);
				System.out.println("O valor do produto agora com incremento é "
						+ leilao.getValorCorrente());
			}
		}
	}

}
