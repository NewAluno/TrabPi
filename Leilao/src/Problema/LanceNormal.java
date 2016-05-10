package Problema;
public class LanceNormal implements Runnable {

	private Incremento incremento;
	private Leilao leilao;

	public LanceNormal(Incremento incremento, Leilao leilao) {
		super();
		this.incremento = incremento;
		this.leilao = leilao;
	}

	public void run() {
		synchronized (incremento) {
			System.out.println("Iniciando Lance Normal no Leilao"
					+ leilao.getValorCorrente());
			int valor = incremento.getValor();
			synchronized (leilao) {
				leilao.darLance(valor);
				System.out.println("O valor do produto agora é "
						+ leilao.getValorCorrente());
			}
		}
	}

}
