import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GestorTiendaTest {

	@Test
	void testCalcularDescuento() {
		GestorTienda GestorTienda = new GestorTienda();
		assertEquals(0.1, GestorTienda.calcularDescuento(1, 11));
		assertEquals(0.05, GestorTienda.calcularDescuento(1, 5));
		assertEquals(0, GestorTienda.calcularDescuento(1, 3));
	}
	@Test
	void testCategorizarProducto() {
		GestorTienda GestorTienda = new GestorTienda();
		assertEquals("Económico", GestorTienda.categorizarProducto(1));
		assertEquals("Estándar", GestorTienda.categorizarProducto(40));
		assertEquals("Premium", GestorTienda.categorizarProducto(600));
		

}
	
	@Test
	void BuscarProducto() {
		GestorTienda GestorTienda = new GestorTienda();
		String[] inventario = {"Camiseta", "Calcetin"};
		assertEquals("Calcetin", GestorTienda.buscarProducto(inventario,"Calcetin"));
		assertNull(null, GestorTienda.buscarProducto(inventario, "Pantalon"));
	}
}
