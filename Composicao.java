class Componente {
    private String nome;

    public Componente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Robo {
    private Componente braço;
    private Componente perna;
    private Componente nucleoDeEnergia;

    public Robo(String nomeBraço, String nomePerna, String nomeNucleoDeEnergia) {
        // Composição: os componentes fazem parte do robô e são destruídos junto com ele
        this.braço = new Componente(nomeBraço);
        this.perna = new Componente(nomePerna);
        this.nucleoDeEnergia = new Componente(nomeNucleoDeEnergia);
    }

    public void mostrarComponentes() {
        System.out.println("Braço: " + braço.getNome());
        System.out.println("Perna: " + perna.getNome());
        System.out.println("Núcleo de Energia: " + nucleoDeEnergia.getNome());
    }
}


