package de.unistuttgart.iste.sqa.pse.sheet02.homework;

/**
 * Describe the class HomeworkHamsterGame here.
 * 
 * @author (Your name)
 * @version (a version number or a date)
 */
public class HomeworkHamsterGame extends InternalHomeworkHamsterGame {

	/*
	 * Confused Paule! Help Paule to walk through the territory and to bring all the
	 * grains into his cave. In the process Paule should collect all grains on the
	 * field and deposit them in his cave (lower left corner - row 6 * column 2 and
	 * indexing starts with 0).
	 */
	@Override
	protected void hamsterRun() {
		// EXERCISE 2:
		// Help Paule to walk through the territory and to bring all the grains
		// into his cave.

		// Walk to the first grain
		paule.move();
		paule.move();
		paule.move();
		paule.move();
		paule.move();

		// Pick up the first grain
		paule.pickGrain();

		// Turn in the direction of the second grain
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();

		// You can remove this line
		paule.write("Ich weiß nicht wie es weitergeht :'(");

		// Move to the second grain
		// TODO:implement

		// Pick up the second grain
		// TODO:implement

		// Add further steps (comment + code) to collect all grains!
		// TODO:implement

		// Pick up grains in the cave
		// TODO:implement

		// Put down all grains in the cave
		// TODO:implement

	}
}
