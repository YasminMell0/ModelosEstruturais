import java.util.ArrayList;
import java.util.List;

class Piloto {
    private String nome;

    public Piloto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class FrotaDeRobos {
    private List<Piloto> pilotos = new ArrayList<>();

    // Agregação: a frota "tem" pilotos, mas não os controla, eles podem existir sem a frota
    public void adicionarPiloto(Piloto piloto) {
        pilotos.add(piloto);
    }

    public void mostrarPilotos() {
        System.out.println("Pilotos da Frota:");
        for (Piloto piloto : pilotos) {
            System.out.println("- " + piloto.getNome());
        }
    }
}

