
import static org.junit.Assert.*;

import org.junit.Test;
import pfc.strategy.HumanStrategy;
import pfc.Shape;
public class HumanStrategyTest{

	@Test
	public void ShapeISPaperReturnTrue() {

    RandomStrategy humanShape= new HumanStrategy();
    assertSame( Shape.PAPER,humanShape.getShape());
	}

    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(HumanStrategyTest.class);
    }


}
