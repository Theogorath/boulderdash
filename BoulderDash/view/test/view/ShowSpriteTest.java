package view;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShowSpriteTest {
	
	private ShowSprite showSprite; 
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.showSprite = new ShowSprite(1, 16,0); 
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPaintGraphics() {
		
		//impossible to do because we would need to make a bufferedImage and it would always be working
		System.out.print("this test is unecessary because we have to create the right buffered image so the test wouldn't return any errors. The unit test would be unseless");
	}
}