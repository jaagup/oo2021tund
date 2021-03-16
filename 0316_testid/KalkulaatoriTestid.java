import org.junit.*;
import static org.junit.Assert.*;
public class KalkulaatoriTestid{
	KalkulaatoriLiides k=new JaagupiKalkulaator();
	@Before
	public void puhasta(){
		k.vajutus("C");
	}
	@Test
	public void sisestus1(){
		assertEquals("0", k.kuvatav());
		k.vajutus("2");
		assertEquals("2", k.kuvatav());
	}
	@Test
	public void sisestus2(){
		k.vajutus("3");
		k.vajutus("5");
		assertEquals("35", k.kuvatav());
	}
}