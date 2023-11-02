package bridge;

public class DVD implements dispositivo{

	@Override
    public void ligar() {
        System.out.println("DVD ligado");
    }

    @Override
    public void desligar() {
        System.out.println("DVD desligado");
    }

    @Override
    public void ajustarVolume(int volume) {
        System.out.println("Volume do DVD ajustado para " + volume);
    }
    
}
