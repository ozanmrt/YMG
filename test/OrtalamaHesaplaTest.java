import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class OrtalamaHesaplaTest {

    private OrtalamaHesapla OrtalamaHesapla;
    
    public OrtalamaHesaplaTest() {
        
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        OrtalamaHesapla = new OrtalamaHesapla();
        
    }
    
    @Test
    public void NotAA() {
        Assert.assertEquals("AA", OrtalamaHesapla.OrtalamaHesapla(96, 95));
    }
    
    @Test
    public void NotBA() {
        Assert.assertEquals("BA",OrtalamaHesapla.OrtalamaHesapla(88, 88));
    }
    
    @Test
    public void NotBB() {
        Assert.assertEquals("BB",OrtalamaHesapla.OrtalamaHesapla(81, 85));
    }
    
    @Test
    public void NotCB() {
        Assert.assertEquals("CB",OrtalamaHesapla.OrtalamaHesapla(80, 75));
    }
    @Test
    public void NotCC() {
        Assert.assertEquals("CC",OrtalamaHesapla.OrtalamaHesapla(72, 72));
    }
    @Test
    public void NotFD() {
        Assert.assertEquals("FD",OrtalamaHesapla.OrtalamaHesapla(60, 60));
    }
    @Test
    public void NotFF() {
        Assert.assertEquals("FF",OrtalamaHesapla.OrtalamaHesapla(0, 0));
    }
    @Test
    public void NotHATA() {
        Assert.assertEquals("HATA",OrtalamaHesapla.OrtalamaHesapla(150, 350));
    }
    
    @After
    public void tearDown() {
        OrtalamaHesapla = null;
    }

}
