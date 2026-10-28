package mbs.inversor.frequencia.api;

public class InversorFrequencia {

	private String display= "";
	private String leds = "0000000";
	private String teclas = "00000000";
	private String potenciometro = "0";
	private String entradasDigitais ="0000";
	private String saidaDigital = "0";
	private String saidaAnalogica = "0000";
	private String entradaAnalogica = "000";
	
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		if(display.length() > 7) {
			throw new  IllegalArgumentException("Dados para display invalido");
		}
		this.display = display;
	}
	public String getLeds() {
		return leds;
	}
	public void setLeds(String leds) {
		if(leds.length() > 7) {
			throw new  IllegalArgumentException("Dados para leds invalido");
		}
		this.leds = leds;
	}
	public String getTeclas() {
		return teclas;
	}
	public void setTeclas(String teclas) {
		if(teclas.length() > 8) {
			throw new  IllegalArgumentException("Dados para teclas invalido");
		}
		this.teclas = teclas;
	}
	public String getPotenciometro() {
		return potenciometro;
	}
	
	
	
	public void setPotenciometro(String potenciometro) {
		if(!isNumber(potenciometro) 
				&& Integer.parseInt(potenciometro) > 255) {
			throw new  IllegalArgumentException("Dados para potenciomentro invalido");
			
		}
		this.potenciometro = potenciometro;
	}
	public String getEntradasDigitais() {
		return entradasDigitais;
	}
	public void setEntradasDigitais(String entradasDigitais) {
		if(entradasDigitais.length() > 4) {
			throw new  IllegalArgumentException("Dados para entradas digitais invalido");
		}
		this.entradasDigitais = entradasDigitais;
	}
	public String getSaidaDigital() {
		return saidaDigital;
	}
	public void setSaidaDigital(String saidaDigital) {
		if(saidaDigital.length() > 1) {
			throw new  IllegalArgumentException("Dados para saida digital invalido");
		}
		this.saidaDigital = saidaDigital;
	}
	public String getSaidaAnalogica() {
		return saidaAnalogica;
	}
	public void setSaidaAnalogica(String saidaAnalogica) {
		if(!isNumber(saidaAnalogica) 
				&& Integer.parseInt(saidaAnalogica) > 4095) {
			throw new  IllegalArgumentException("Dados para saida analogica invalido");
			
		}
		this.saidaAnalogica = saidaAnalogica;
	}
	public String getEntradaAnalogica() {
		return entradaAnalogica;
	}
	public void setEntradaAnalogica(String entradaAnalogica) {
		if(!isNumber(entradaAnalogica) 
				&& Integer.parseInt(entradaAnalogica) > 255) {
			throw new  IllegalArgumentException("Dados para entrada Analogica invalido");
			
		}
		this.entradaAnalogica = entradaAnalogica;
	}
	@Override
	public String toString() {
		return "InversorFrequencia [display=" + display + ", leds=" + leds + ", teclas=" + teclas + ", potenciometro="
				+ potenciometro + ", entradasDigitais=" + entradasDigitais + ", saidaDigital=" + saidaDigital
				+ ", saidaAnalogica=" + saidaAnalogica + ", entradaAnalogica=" + entradaAnalogica + "]";
	}
	
	
	public String toJson() {
		return  "{" + display + ";" + leds + ";" + teclas + ";"
				+ potenciometro + ";" + entradasDigitais + ";" + saidaDigital
				+ ";" + saidaAnalogica + ";" + entradaAnalogica + "}";
	}
	
	private boolean isNumber(String dado) {
		try {
			Integer.parseInt(dado);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	
	
	
	


}
