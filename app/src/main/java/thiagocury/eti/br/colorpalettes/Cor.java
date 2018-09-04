package thiagocury.eti.br.colorpalettes;

public class Cor {

	private String idCor;
	private String idHexaCor;

	public Cor() {
	}
	
	public Cor(String idCor, String idHexaCor) {
		this.idCor = idCor;
		this.idHexaCor = idHexaCor;
	}
	
	public String getIdCor() {
		return idCor;
	}
	public void setIdCor(String idCor) {
		this.idCor = idCor;
	}

	public String getIdHexaCor() {
		return idHexaCor;
	}

	public void setIdHexaCor(String idHexaCor) {
		this.idHexaCor = idHexaCor;
	}
	
}//fecha classe
