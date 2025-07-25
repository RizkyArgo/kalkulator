import org.junit.jupiter.api.Test;
import static
org.junit.jupiter.api.Assertions.*;

public class KalkuTest{

	@Test
	public void tesTambah() {
	Kalkulator kalku = new Kalkulator();
	assertEquals(3, kalku.tambah(2, 1));
	}

	@Test
        public void tesKurang() {
        Kalkulator kalku = new Kalkulator();
        assertEquals(1, kalku.kurang(2, 1));
        }

        @Test
        public void tesKali() {
        Kalkulator kalku = new Kalkulator();
        assertEquals(3, kalku.kali(3, 1));
        }

        @Test
        public void tesBagi() {
        Kalkulator kalku = new Kalkulator();
        assertEquals(3, kalku.bagi(6, 2));
        }

        @Test
        public void tesModulus() {
        Kalkulator kalku = new Kalkulator();
        assertEquals(1, kalku.modulus(3, 2));
        }

        @Test
        public void tesPangkat() {
        Kalkulator kalku = new Kalkulator();
        assertEquals(16, kalku.pangkat(4, 2));
        }

}
