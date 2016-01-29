package testing;

import static org.junit.Assert.*;

import javax.swing.JButton;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import PuzzleGCHQ.*;

public class PuzzleTest {

	static Grid grid;
	static Square square;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		grid = new Grid(4,4, "easy");
		square = new Square(0, false, 4, 4, new JButton());
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGridConstructor() {
		assertEquals("Expected column: 4.", 4, grid.getColumnSize());
		assertEquals("Expected row: 4.", 4, grid.getRowSize());
		assertEquals("The difficulty should be easy.", "easy", grid.getDifficulty());
	}
	
	@Test
	public void testGridMutators() {
		grid.setColumnSize(10);
		grid.setRowSize(5);
		grid.setDifficulty("hard");
		
		assertEquals("Expected column: 10", 10, grid.getColumnSize());
		assertEquals("Expected row: 5", 5, grid.getRowSize());
		assertEquals("Exptected difficulty: hard", "hard", grid.getDifficulty());
		
	}
	
	@Test
	public void testSquareConstructor() {
		assertEquals("Expected rowPos: 4", 4, square.getRowPosition());
		assertEquals("Expected colPos: 4", 4, square.getColumnPosition());
	}

}
