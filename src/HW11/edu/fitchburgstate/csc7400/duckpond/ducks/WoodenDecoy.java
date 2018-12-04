/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 12
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.ducks;

import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.BehaviorStrategy;

/**
 * Wooden decoys for the duck.
 */
public class WoodenDecoy extends Duck {

	/**
	 * Creates a new wooden decoy with appropriate bitmaps and GIFs
	 */
	public WoodenDecoy() {
		super("Wooden Decoy",
				"wooden_decoy.bmp",
				//new CannotFly(),
				//new SimpleSwim("decoy floating"),
				//new CannotQuack());
				BehaviorStrategy.getBehavior(null, "decoy floating", null));
	}
}
