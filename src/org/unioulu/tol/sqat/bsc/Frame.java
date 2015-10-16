package org.unioulu.tol.sqat.bsc;

public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;//first opportunities in the frame
		this.secondThrow = secondThrow;
	}
	
	//the score of a single frame
	public int score(){//tested
		//to be implemented
		
		return firstThrow+secondThrow;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){//tested
		//to be implemented
		if (this.getFirstThrow()==10){
			return true;
		}
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){ //tested
		if (this.getFirstThrow()+this.getSecondThrow()==10){
			return true;
		}
		return false;
		
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){//to be tested
		//to be implemented
		return false;
	}

	//bonus throws
	public int bonus(Frame frameBefore){//bonus on this frame
		if(frameBefore.isStrike()==true){//test strike
		return this.firstThrow+this.secondThrow ;
		}
		return 0;
	}
	
	
	//getter and setter


	public int getFirstThrow() {
		return firstThrow;
	}

	public void setFirstThrow(int firstThrow) {
		this.firstThrow = firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	public void setSecondThrow(int secondThrow) {
		this.secondThrow = secondThrow;
	}
}
