import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    public void deveSomarValorCliente(){
        Cliente cliente = new Cliente();
        cliente.somarValor(20f, 30f);

        assertEquals(50f, cliente.getValor());
    }

    @Test
    public void deveDividirValorCliente(){

        Cliente cliente = new Cliente();
        cliente.dividirValor(100f, 20f);

        assertEquals(5f, cliente.getValor());

    }

    @Test
    public void deveSubtrairValorCliente(){
        Cliente cliente = new Cliente();
        cliente.subtrairValor(155f, 100f);

        assertEquals(55f, cliente.getValor());
    }

    @Test
    public void deveMultiplicarValorCliente(){
        Cliente cliente = new Cliente();
        cliente.multiplicarValor(100f, 3f);

        assertEquals(300f, cliente.getValor());
    }


}