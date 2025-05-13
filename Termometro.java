public class Termometro {

    private double temperatura;


    public Termometro(double temperatura) {
        setTemperatura(temperatura);
    }

    
    public double getTemperatura() {
        return temperatura;
    }


    public void setTemperatura(double temp) {
        if (temp >= -273.15) {
            this.temperatura = temp;
        } else {
            System.out.println("Erro: temperatura abaixo do zero absoluto não é permitida.");
        }
    }
}
