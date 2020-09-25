package com.lottoland.springboot.web.app.services;

import com.lottoland.springboot.web.app.models.Round;

public interface GameService {

	Round playRound();
	
	long playerOneTotalWins();
	
	long playerTwoTotalWins();
	
	long totalDraws();
	
	long totalRounds();
}
