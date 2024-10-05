
public class Main {
	public static void main(String[] args) {
        Piloto piloto1 = new Piloto("Capitão Falcon");
        Piloto piloto2 = new Piloto("Comandante Sheppard");

        FrotaDeRobos frota = new FrotaDeRobos();
        frota.adicionarPiloto(piloto1);
        frota.adicionarPiloto(piloto2);

        frota.mostrarPilotos();
        // Mesmo se a frota for destruída, os pilotos ainda existem
       
        System.out.println("\n");
        Robo robo = new Robo("Braço Laser", "Perna Turbo", "Núcleo de Plutônio");
        System.out.println("Componentes do Robô:");
        robo.mostrarComponentes();
        // Quando o robô é destruído, os componentes também desaparecem

    }
}
