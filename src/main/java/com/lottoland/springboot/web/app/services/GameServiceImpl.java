package com.lottoland.springboot.web.app.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottoland.springboot.web.app.models.PlayerType;
import com.lottoland.springboot.web.app.models.Round;
import com.lottoland.springboot.web.app.repository.GameRepository;

@Service
public class GameServiceImpl implements GameService {
	
	@Autowired
	private GameRepository repository;

	@Override
	public Round playRound() {
		Round round = new Round();
		switch (round.getPlayer2().getChoice()) {
		case PAPER:
			round.setWinner(Optional.of(round.getPlayer2()));
			break;
		case SCISSORS:
			round.setWinner(Optional.of(round.getPlayer1()));
			break;
		case ROCK:
			round.setWinner(Optional.empty());
		}
		repository.addRound(round);
		return round;
	}

	@Override
	public long playerOneTotalWins() {
		return repository.getAllRounds().stream().filter(r -> r.getWinner().isPresent() && r.getWinner().get().getName().equals(PlayerType.PLAYER_ONE)).count();
	}

	@Override
	public long playerTwoTotalWins() {
		return repository.getAllRounds().stream().filter(r -> r.getWinner().isPresent() && r.getWinner().get().getName().equals(PlayerType.PLAYER_TWO)).count();
	}

	@Override
	public long totalDraws() {
		return repository.getAllRounds().stream().filter(r -> !r.getWinner().isPresent()).count();

	}

	@Override
	public long totalRounds() {
		return repository.getAllRounds().size();
	}

}
