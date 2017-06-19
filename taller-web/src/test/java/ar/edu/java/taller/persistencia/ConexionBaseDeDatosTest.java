package ar.edu.java.taller.persistencia;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.java.taller.SpringTest;

import static org.assertj.core.api.Assertions.*;

// Clase que prueba la conexion a la base de datos. Hereda de SpringTest por lo que corre dentro del contexto
// de spring
public class ConexionBaseDeDatosTest extends SpringTest{

    @Test
    @Transactional @Rollback(true)
    public void pruebaConexion(){
        assertThat(getSession().isConnected()).isTrue();
    }
}
