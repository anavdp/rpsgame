package com.lottoland.springboot.web.app.repository;

import java.util.List;

import com.lottoland.springboot.web.app.models.Game;
import com.lottoland.springboot.web.app.models.Round;

public interface GameRepository {

	void addRound(Round round);
	
	List<Round> getAllRounds();
	
	
	
}
