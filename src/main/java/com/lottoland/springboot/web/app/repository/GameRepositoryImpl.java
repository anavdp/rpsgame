package com.lottoland.springboot.web.app.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lottoland.springboot.web.app.models.Game;
import com.lottoland.springboot.web.app.models.Round;

@Repository
public class GameRepositoryImpl implements GameRepository {

	private Game game = new Game();
	
	@Override
	public void addRound(Round round) {
		if(round != null ) {
			game.getRounds().add(round);
		}

	}

	@Override
	public List<Round> getAllRounds() {
		return game.getRounds();
	}



}
