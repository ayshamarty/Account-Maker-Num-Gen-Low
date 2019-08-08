package com.bae.accountmaker.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class AccountNumberGeneratorImplementation implements AccountNumberGenerator {

	@Override
	public Integer generateNumber() {
		Integer number = (int) (Math.random() * 1000000);
		return number;
	}

	@Override
	public Character generateCharacter() {
		Random rnd = new Random();
		char character = (char) (rnd.nextInt(3) + 'a');
		return character;
	}

	@Override
	public String generateAccount() {
		String combination = generateCharacter().toString() + generateNumber().toString();
		return combination;
	}

}
