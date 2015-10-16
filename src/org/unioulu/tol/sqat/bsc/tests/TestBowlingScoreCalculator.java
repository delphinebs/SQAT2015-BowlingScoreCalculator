package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;

import org.junit.Test;

public class TestBowlingScoreCalculator {
	
	Frame frame1 =new Frame(0, 5);//simpleframe
	Frame frame2=new Frame(10, 0);//testStrike
	Frame frame3=new Frame(5, 5);//testSpare
//TEST First Frame
	@Test
	public void testCalculateScore() {
			assertEquals(frame1.score(),frame1.getFirstThrow()+frame1.getSecondThrow() );
			assertEquals(frame2.score(),frame2.getFirstThrow()+frame2.getSecondThrow() );
			assertEquals(frame3.score(),frame3.getFirstThrow()+frame3.getSecondThrow() );
			
		
	}
	
	//TEST Strike
	@Test
	public void testIsStrikeIsFalseForDefault(){
			assertEquals(frame1.isStrike(),false);//attention : false by default
	}
	
	
	
	@Test
	public void testIsStrikeIsTrueFirstFrame(){
		
		
		
		assertEquals(frame2.isStrike(),true);
	}
	
	//TEST Spare
	@Test
	public void testIsSpareIsFalse(){
		
		
		assertEquals(frame1.isSpare(),false);//attention : false by default
	}
	
	@Test
	public void testIsSpareIsTrue(){
			
		assertEquals(frame3.isSpare(),true);//attention : false by default
	}
	
	
	
//TEST START BoWling game
	@Test
	public void testBowlingGameEmpty(){
		BowlingGame bowlingGame = new BowlingGame();
		
		assertTrue(bowlingGame.getFrames().isEmpty());//test list empty
	}
	
	@Test
	public void testBowlingGameAddFrame(){
		BowlingGame bowlingGame = new BowlingGame();
		bowlingGame.addFrame(frame1);
		
		assertEquals(bowlingGame.getFrames().get(0), frame1);//test frame1 added
	}
	
/*	@Test
	public void testBonusDefault(){
		
		Frame firstFrame=new Frame(5, 5);
		
		assertEquals(firstFrame.bonus(),0);//attention : false by default
	}*/

}
