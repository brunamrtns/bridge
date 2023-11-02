package bridge;

public class TV implements dispositivo{
	
	  @Override
	    public void ligar() {
	        System.out.println("TV ligada");
	    }

	    @Override
	    public void desligar() {
	        System.out.println("TV desligada");
	    }

	    @Override
	    public void ajustarVolume(int volume) {
	        System.out.println("Volume da TV ajustado para " + volume);
	    }
}
