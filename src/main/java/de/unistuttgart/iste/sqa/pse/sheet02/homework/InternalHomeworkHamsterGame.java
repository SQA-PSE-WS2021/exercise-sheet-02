package de.unistuttgart.iste.sqa.pse.sheet02.homework;

import de.hamstersimulator.objectsfirst.datatypes.Location;
import de.hamstersimulator.objectsfirst.external.model.Territory;
import de.hamstersimulator.objectsfirst.inspector.InspectableSimpleHamsterGame;

public abstract class InternalHomeworkHamsterGame extends InspectableSimpleHamsterGame {
	public InternalHomeworkHamsterGame() {
		this.loadTerritoryFromResourceFile("/territories/territory.ter");
		this.displayInNewGameWindow();
	}

	protected final void testPaulesSkills() {
		hamsterRun();
		testAllGrainsInCave();
	}

	private void testAllGrainsInCave() {
		paule.write("Test:");
		Territory territory = game.getTerritory();
		if (territory.getNumberOfGrainsAt(new Location(6, 1)) == territory.getTotalGrainCount() && paule.mouthEmpty()) {
			paule.write("Wuhu, I did it!");
		} else {
			paule.write("Oh no! That did not work out!");
		}
	}

	@Override
	protected void run() {
		game.startGame();
		testPaulesSkills();
		game.stopGame();
	}

	abstract void hamsterRun();
}
