
import static org.junit.Assert.*;

import org.junit.Test;
import pfc.strategy.Strategy;
import pfc.Shape;
public class PlayerTest{

	@Test
	public void playerAddPoints() {

  Player humanPlayer=new Player(name,humanStrat);
  assertSame( humanPlayer.getPoints(),0);
	}

    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(PlayerTest.class);
    }


}
