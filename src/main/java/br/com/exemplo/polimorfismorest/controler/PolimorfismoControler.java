package br.com.exemplo.polimorfismorest.controler;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.exemplo.polimorfismorest.model.Animal;
import br.com.exemplo.polimorfismorest.model.Zoo;

@RestController
public class PolimorfismoControler {
	
	@PostMapping("/animal/incluir")
	public ResponseEntity<?> incluirAnimalList(@RequestBody List<Animal> animais){
		
		animais.stream().forEach(System.out::println);
		
		return null;
	}
	@PostMapping("/zoo/incluir")
	public ResponseEntity<?> incluirZoo(@RequestBody Zoo zoo){
		
		zoo.getAnimais().stream().forEach(System.out::println);
		
		return null;
	}

}
