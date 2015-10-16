package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;

import org.junit.Test;

public class TestBowlingScoreCalculator {
	
	
	//TEST First Frame
	@Test
	public void testCalculateScoreSimplethrow() {
		
		Frame firstFrame=new Frame(0, 5);
		
		
		assertEquals(firstFrame.score(),firstFrame.getFirstThrow()+firstFrame.getSecondThrow() );
		
	}
	
	
	@Test
	public void testIsStrikeIsFalseForDefault(){
		
		Frame firstFrame=new Frame(0, 5);
		
		assertEquals(firstFrame.isStrike(),false);//attention : false by default
	}
	@Test
	public void testIsStrikeIsTrueFirstFrame(){
		
		Frame firstFrame=new Frame(10, 0);
		
		assertEquals(firstFrame.isStrike(),true);
	}
	
	@Test
	public void testIsSpareIsFalse(){
		
		Frame firstFrame=new Frame(0, 5);
		
		assertEquals(firstFrame.isSpare(),false);//attention : false by default
	}
	
	@Test
	public void testIsSpareIsTrue(){
		
		Frame firstFrame=new Frame(5, 5);
		
		assertEquals(firstFrame.isSpare(),true);//attention : false by default
	}
	
	
	
	//TEST START BoWling game
	@Test
	public void testBowlingGameEmpty(){
		BowlingGame bowlingGame = new BowlingGame();
		
		assertTrue(bowlingGame.getFrames().isEmpty());//test list empty
	}
	
/*	@Test
	public void testBonusDefault(){
		
		Frame firstFrame=new Frame(5, 5);
		
		assertEquals(firstFrame.bonus(),0);//attention : false by default
	}*/

}
