/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 12
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack;


/** 
 *  Class instantiation is done here
 */

public class QuackBehaviorFactory {

	/**
	 * 
	 * @param type sound of duck type
	 * @return QuackBehavior instance
	 */
	
	
	public static QuackBehavior quackBehavior (QuackType type) {
		QuackBehavior quackbehavior;
		if(type!=null)
		{
		if(type.equals(QuackType.SQUEAK))
		{	
			quackbehavior = new Squeak();		
		}
		else if(type.equals(QuackType.QUACK))
			quackbehavior = new DuckQuack();
		}
		else {
			quackbehavior = new CannotQuack();
		}
		return null;
	}
}

