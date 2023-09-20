package engsoft3;

public class Main {

	public static void main(String[] args) {
		Fila fila = Fila.getInstancia();
		fila.ImprimirDocumento();
		fila.RemoverDocumento();
		fila.RemoveTodosDocumentos();
	}
}
