package ru.kubsu.telegrambot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.client.okhttp.OkHttpTelegramClient;
import org.telegram.telegrambots.longpolling.TelegramBotsLongPollingApplication;

import ru.kubsu.telegrambot.bot.MyAmazingBot;
import ru.kubsu.telegrambot.controller.TestController;

@SpringBootApplication
public class TelegrambotApplication {


	public static void main(final String[] args) {
		SpringApplication.run(TelegrambotApplication.class, args);
	}

}
