package engsoft3;

public class Fila {

	private static Fila instancia = null;

	private Fila() {
	}

	public static Fila getInstancia() {
		if (instancia == null) {
			instancia = new Fila();
		}
		return instancia;
	}

	public void ImprimirDocumento() {
		System.out.println("Imprimiu o documento");
	}

	public void RemoverDocumento() {
		System.out.println("Removeu o documento");
	}

	public void RemoveTodosDocumentos() {
		System.out.println("Removeu todos os documentos");
	}
}
