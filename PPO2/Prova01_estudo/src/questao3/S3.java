package questao3;

public class S3 extends Estado{

	public void percorreCadeia(String cadeia) {
		for (int i = 0; i<cadeia.length(); i++) {
			if ('b' == cadeia.charAt(i)) {
				this.getAutomato().setEstado(new S4());
				cadeia.substring(i);
				percorreCadeia(cadeia);
				
			}else if ('a' == cadeia.charAt(i)) {
				this.getAutomato().setEstado(new S1());
				cadeia.substring(i);
				percorreCadeia(cadeia);
				
			}else {
				cadeia.substring(i);
				percorreCadeia(cadeia);
			}
		}
	}
}
