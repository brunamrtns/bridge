package bridge;

public abstract class controleRemoto {
	
	protected dispositivo novoDispositivo;

    public controleRemoto(dispositivo novoDispositivo) {
        this.novoDispositivo = novoDispositivo;
    }

    public void ligar() {
    	novoDispositivo.ligar();
    }

    public void desligar() {
    	novoDispositivo.desligar();
    }

    public void ajustarVolume(int volume) {
    	novoDispositivo.ajustarVolume(volume);
    }

    
}
