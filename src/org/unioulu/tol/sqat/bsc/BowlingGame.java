package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		this.frames.add(frame);
		
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	public int score(){
		int scoreTotal =0;
		for (Frame frame:frames){
			scoreTotal = scoreTotal + frame.score();
		}
		return scoreTotal;//addscore
	
	}
	
	public boolean isNextFrameBonus(Frame frameCurrent){
		if(frameCurrent.isStrike()){
			//for now just strike, to do or spare
			return true;
		}
			
		return false;
	}

	public List<Frame> getFrames() {
		return frames;
	}

	public void setFrames(List<Frame> frames) {
		this.frames = frames;
	}

	public Frame getBonus() {
		
		return bonus;
	}

	public void setBonus(Frame bonus) {
		this.bonus = bonus;
	}

	
}
