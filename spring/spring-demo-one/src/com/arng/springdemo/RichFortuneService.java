package com.arng.springdemo;

import java.util.concurrent.ThreadLocalRandom;

public class RichFortuneService implements FortuneService {

	String[] fortunes = { "Today you will become a millionare", "Today you are winning 1 crore lottery",
			"Today you will win a flat work 10 million" };

	@Override
	public String getFortune() {
		int random = ThreadLocalRandom.current().nextInt(0, fortunes.length);
		return fortunes[random];
	}

}
