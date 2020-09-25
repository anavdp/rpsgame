package com.lottoland.springboot.web.app.controllers;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lottoland.springboot.web.app.models.Resume;
import com.lottoland.springboot.web.app.models.Round;
import com.lottoland.springboot.web.app.services.GameService;

@Controller
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@RequestMapping(path="/")
	public String welcome() {
		return "game";
	}
	
	
	
	@RequestMapping(path="/resume")
	public String gameResume() {
		return "resume";
	}
	
	@GetMapping(path="/playRound")
	@ResponseBody
	public Round playRound() {
		return gameService.playRound();
	}
	
	
	@GetMapping(path="/gameInfo")
	@ResponseBody
	public Map<String,List<Resume>> gameInfo() {
		List<Resume> result = new ArrayList();
		long totalWP1 = gameService.playerOneTotalWins();
		long totalWP2 = gameService.playerTwoTotalWins();
		long totalDraws = gameService.totalDraws();
		long total = gameService.totalRounds();
		result.add(new Resume("Total rounds played", total));
		result.add(new Resume("Total wins for firsts players", totalWP1));
		result.add(new Resume("Total wins for second players", totalWP2));
		result.add(new Resume("Total draws", totalDraws));
		Map<String,List<Resume>> data = new HashMap();
		data.put("data", result);
		return data;
		
	}
}
