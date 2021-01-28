package linkedList;


import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

public class ListaTest {
	 @BeforeClass
	    public static void setUpClass() {
	    }
	    
	    @AfterClass
	    public static void tearDownClass() {
	    }
	    
	    @Before
	    public void setUp() {
	    }
	    
	    @After
	    public void tearDown() {
	    }

	    /**
	     * prueba para funciones de la lista
	     */
	    @org.junit.Test
	    public void deberiaA�adirBien() {
	        Lista lista= new Lista();
	        lista.add(333.0);
	        lista.add(4.0);
	        lista.add(6555.0);
	        int tama�o=3;
	        assertEquals(tama�o,lista.size());
	    }
	    
	    /**
	     * prueba para funciones de la lista
	     */
	    @org.junit.Test
	    public void deberiaEliminarBien() {
	        Lista lista= new Lista();
	        lista.add(333.0);
	        lista.add(4.0);
	        lista.add(6555.0);
	        int tama�o=3;
	        assertEquals(tama�o,lista.size());
	        lista.remove(2);
	        tama�o--;
	        assertEquals(tama�o,lista.size());
	    }
	
	
}
