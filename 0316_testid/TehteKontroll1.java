import org.junit.*;
import static org.junit.Assert.*;

public class TehteKontroll1{
	@Test
	public void kontroll1(){
		assertEquals(6.0, Tehted.geomeetrilineKeskmine(4, 9), 0.0001);
	}
	@Test
	public void kontroll2(){
		assertEquals(40, Tehted.harmoonilineKeskmine(30, 60), 0.0001);
	}
}