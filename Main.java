public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Fusca");

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Velocidade inicial: " + carro.getVelocidade() + " km/h");

        carro.acelerar(50);
        System.out.println("Velocidade após acelerar: " + carro.getVelocidade() + " km/h");

        carro.frear(20);
        System.out.println("Velocidade após frear: " + carro.getVelocidade() + " km/h");

        carro.frear(40);
        System.out.println("Velocidade final: " + carro.getVelocidade() + " km/h");
    }
}
