// This file should not run.
// Write what you believe to be correct and submit that.
/*
	Author:
	Date:
*/

public class Robot{
	private int[] hall;
	private int pos;				// current position (tile number) of Robot
	private boolean facingRight; 	// true means this Robot is facing right

	// Constructor not show, assume it works as intented

	// postcondition: return true if this Robot has a wall immediately in
	//				  front of it, so that it cannot move forward;
	//				  otherwise, return false
	private boolean forwardMoveBlocked(){
		if(pos == 0 || pos == hall.length) {
			return true;
		}
		else {
			return false;
		}

	}

	// postcondition: one move has been made according to the
	// 				  specifications above and the state of this
	//				  Robot has been updated
	private void move(){
		if(hall[pos] > 1) {
			hall[pos]--;
		}
		else if(hall[pos] == 1) {
			hall[pos]--;
			if(forwardMoveBlocked()) {
				facingRight = !facingRight;
			}
		}
		else {
			if(facingRight) {
				pos++;
			}
			else if(!facingRight) {
				pos--;
			}
		}

	}

	// postcondition: no more items remain in the hallway;
	//				  returns the number of moves made
	public int clearHall(){
		while(!hallIsClear()) {
			move();
		}

	}

	// postcondition: returns true if the hallway contains no items;
	// 				  otherwise, returns false
	private boolean hallIsClear(){
		// Implementation not shown
		// Assume this works as intended
	}
}
