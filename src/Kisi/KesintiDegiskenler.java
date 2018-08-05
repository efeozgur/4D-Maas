package Kisi;

public class KesintiDegiskenler {
	boolean sendika, bes, icra;

	public KesintiDegiskenler(boolean sendika, boolean bes, boolean icra) {
		this.sendika = sendika;
		this.bes = bes;
		this.icra = icra;
	}

	public boolean isSendika() {
		return sendika;
	}

	public boolean isBes() {
		return bes;
	}

	public boolean isIcra() {
		return icra;
	}
	
	
}
