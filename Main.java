public class Main {

    public static void main(String[] args) {
      Carro queen = new Carro("volkswagen", "gol", 1999);
        Carro king = new Carro("fiat", "argo", 2022);



        ContaBancaria conta = new ContaBancaria();
        conta.titular = "João";

        conta.depositar(500);
        conta.mostrarSaldo();

        conta.sacar(200);
        conta.mostrarSaldo();

        conta.sacar(400);
        conta.mostrarSaldo();


        Jogador jogador1 = new Jogador();
        jogador1.nome = "Arthur";
        jogador1.vida = 100;
        jogador1.forca = 20;

        Jogador jogador2 = new Jogador();
        jogador2.nome = "Lancelot";
        jogador2.vida = 80;
        jogador2.forca = 15;

        System.out.println("Antes do ataque:");
        jogador1.mostrarStatus();
        jogador2.mostrarStatus();

        jogador1.atacar(jogador2);

        System.out.println("\nDepois do ataque:");
        jogador1.mostrarStatus();
        jogador2.mostrarStatus();


        Lampada lampada = new Lampada();
        lampada.cor = "Branca";

        lampada.ligar();
        lampada.mostrarEstado();

        lampada.desligar();
        lampada.mostrarEstado();
    

   
    }
}
