package bridge;

public class mainBridge {
	
	public static void main(String[] args) {
		 dispositivo tv = new TV();
	     dispositivo dvd = new DVD();

	        controleRemoto controleTV = new controleRemotoTV(tv);
	        controleRemoto controleDVD= new controleRemotoDVD(dvd);

	        controleTV.ligar();
	        controleTV.ajustarVolume(20);
	        controleTV.desligar();

	        controleDVD.ligar();
	        controleDVD.ajustarVolume(10);
	        controleDVD.desligar();
    }
	
}
