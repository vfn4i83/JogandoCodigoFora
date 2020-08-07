import java.io.IOException;

public class MainLancador {

	public static void main(String[] args) {
		try {
//			Algoritmo permite executar um aplicativo, e acompanha sua execução. 
			System.out.println("Abrindo Notepad!");
			Runtime run = Runtime.getRuntime();
			Process proc = run.exec("notepad");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Fechando Notepad!");
			proc.destroy();

		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
