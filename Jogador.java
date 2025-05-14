public class Jogador {
    String nome;
    int vida;
    int forca;

    public void atacar(Jogador outroJogador) {
        outroJogador.vida -= this.forca;
        System.out.println(this.nome + " atacou " + outroJogador.nome + " causando " + this.forca + " de dano.");
    }

    public void mostrarStatus() {
        System.out.println("Jogador: " + nome + " | Vida: " + vida + " | Força: " + forca);
    }
}