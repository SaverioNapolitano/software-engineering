package com.saverionapolitano.designPatterns.mixed.commandDecoratorAdapter.bell;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Scheduler {
	public static void main(String[] args) {
		int X = 10;
		ArrayList<Bell> bells = new ArrayList<>(List.of(
				new DanBell(), new DinBell(), new DonBell(),
				new EchoBellDecorator(new DonBell()),
				new EchoBellDecorator(new DinBell()),
				new EchoBellDecorator(new DanBell()),
				new WindBellDecorator(new DanBell()),
				new WindBellDecorator(new DonBell()),
				new WindBellDecorator(new DinBell()),
				new BeatBellDecorator(new DinBell()),
				new BeatBellDecorator(new DonBell()),
				new BeatBellDecorator(new DanBell())
		));

		ArrayList<Command> commands = new ArrayList<>();

		for(int i = 0; i < X; i++){
			Random random = new Random();
			int index = random.nextInt(0, bells.size());
			commands.add(new BellSoundCommand(bells.get(index)));
		}
		commands.forEach(Command::execute);
		Beep beep = new BellBeepAdapter(new DanBell());
		System.out.println(beep.getBeep());
	}
}
