package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.unioulu.tol.sqat.bsc.Frame;

import org.junit.Test;

public class TestBowlingScoreCalculator {
	
	

	@Test
	public void testCalculaateSimplethrow() {
		
		Frame firstFrame=new Frame(0, 5);
		
		
		assertEquals(firstFrame.score(),firstFrame.getFirstThrow()+firstFrame.getSecondThrow() );
		
	}
	
	@Test
	public void testIsStrikeIsFalseForDefault(){
		
		Frame firstFrame=new Frame(0, 5);
		
		assertEquals(firstFrame.isStrike(),false);//false by default
	}
	@Test
	public void testIsStrikeIsTrueFirstFrame(){
		
		Frame firstFrame=new Frame(10, 0);
		
		assertEquals(firstFrame.isStrike(),true);
	}

}
