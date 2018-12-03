/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.ducks;

import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly.FlyBehaviorFactory;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.QuackBehaviorFactory;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim.SwimBehaviorFactory;

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
				FlyBehaviorFactory.flyBehavior(null),
				SwimBehaviorFactory.swimBehavior("decoy floating"),
				QuackBehaviorFactory.quackBehavior(null));
	}
}
