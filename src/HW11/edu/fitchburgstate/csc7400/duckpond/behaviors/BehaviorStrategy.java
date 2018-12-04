/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 12
 * Date: 2018-11-28
 */
package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors;

import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly.FlyBehaviorFactory;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly.FlyingBehavior;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.QuackBehavior;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.QuackType;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim.SwimBehavior;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim.SwimBehaviorFactory;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.QuackBehaviorFactory;


public class BehaviorStrategy {
	
	public String flyBehavior;
	public QuackType quackBehavior;
	public String swimBehavior;
	/**  
	  * Returns the flying behavior
	  */
	 public FlyingBehavior getFlyBehavior() {
		 return FlyBehaviorFactory.flyBehavior(this.flyBehavior);
	 }

	 /**
	  * Returns the quacking behavior
	  */
	 public QuackBehavior getQuackBehavior() {
		 return QuackBehaviorFactory.quackBehavior(this.quackBehavior);
	 }

	 /**
	  * Returns the swimming behavior
	  */
	 public SwimBehavior getSwimBehavior() {
		 return SwimBehaviorFactory.swimBehavior(this.swimBehavior);
	 }

	 /**
	  * 
	  * @param flyBehavior illustrates flying behavior
	  * @param quackBehavior illustrates sound of duck
	  * @param swimBehavior illustrates swimming behavior
	  * @return behaviorStrategy instance
	  */
	public static BehaviorStrategy getBehavior(String flyBehavior, String swimBehavior, QuackType quackBehavior) 
	{
		BehaviorStrategy behaviorStrategy = new BehaviorStrategy();
		behaviorStrategy.flyBehavior = flyBehavior;
		behaviorStrategy.quackBehavior = quackBehavior;
		behaviorStrategy.swimBehavior = swimBehavior;
		return behaviorStrategy;

}
}
