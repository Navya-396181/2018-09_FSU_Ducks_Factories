/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 12
 * Date: 2018-11-28
 */
package HW11.edu.fitchburgstate.csc7400.duckpond.ducks;


import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.QuackType;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.BehaviorStrategy;

/**
 * Rubber duck for pond
 */
public class RubberDuck extends Duck {

	/**
	 * Creates a new rubber duck
	 */
	public RubberDuck() {
		super("Rubber Duck",
				"ducky.bmp",
				//new CannotFly(),
				//new SimpleSwim("rubber duck floating"),
				//new Squeak());
				BehaviorStrategy.getBehavior(null, "rubber duck floating", QuackType.SQUEAK));
	}
}
