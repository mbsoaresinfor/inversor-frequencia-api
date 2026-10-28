package mbs.inversor.frequencia.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InversorFrequenciaController {

	public InversorFrequencia inversorFrequencia = new InversorFrequencia();

	@PostMapping("/")
	public void escrever(@RequestBody String login) {
		System.out.println("--- ESCREVER ---");

		String[] valores = login.replace("{", "").replace("}", "").split(";");
		inversorFrequencia.setDisplay(valores[0]);
		inversorFrequencia.setLeds(valores[1]);
		inversorFrequencia.setTeclas(valores[2]);
		inversorFrequencia.setPotenciometro(valores[3]);
		inversorFrequencia.setEntradasDigitais(valores[4]);
		inversorFrequencia.setSaidaDigital(valores[5]);
		inversorFrequencia.setSaidaAnalogica(valores[6]);
		inversorFrequencia.setEntradaAnalogica(valores[7]);
		System.out.println(inversorFrequencia.toString());

	}

	@GetMapping("/")
	public String leitura() {
		System.out.println("--- LEITURA ---");
		System.out.println(inversorFrequencia.toString());
		return inversorFrequencia.toJson();
	}

}
