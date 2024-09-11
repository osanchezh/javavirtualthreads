package com.example.playerbloc;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {
	@GetMapping("players")
	public List<String> getPlayers() throws InterruptedException{
		Thread.sleep(2000);
		return List.of("AB","BC", "DE");
	}

}
