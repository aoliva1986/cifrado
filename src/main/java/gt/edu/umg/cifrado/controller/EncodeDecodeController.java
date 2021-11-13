package gt.edu.umg.cifrado.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gt.edu.umg.cifrado.model.EncodeDecodeModel;


@RestController
@RequestMapping("/endpoint")
public class EncodeDecodeController {
	
	EncodeDecodeModel encode;

	@PostMapping("/encrypt")
	public String setEncode(@Valid @RequestBody EncodeDecodeModel item) {
		
		String cadena = encode.getAES(item.getSeed());
		return cadena;
	}
	@PostMapping("/decrypt")
	public String setDecode(@Valid @RequestBody EncodeDecodeModel item) {
		

		String cadena = encode.getAESDecrypt(item.getSeed());
		return cadena;
	}
}
