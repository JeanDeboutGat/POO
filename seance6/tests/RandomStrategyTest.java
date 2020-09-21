
import static org.junit.Assert.*;

import org.junit.Test;
import pfc.strategy.RandomStrategy;
import pfc.Shape;
public class RandomStrategyTest{

	@Test
	public void ShapeCanBeAny() {

    RandomStrategy randShape= new RandomStrategy();
		Shape rand=randShape.getShape();
    assertTrue(rand==Shape.PAPER || rand==Shape.SCISSOR ||rand==Shape.ROCK);
	}

    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(RandomStrategyTest.class);
    }


}
