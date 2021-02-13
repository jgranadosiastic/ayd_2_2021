
import com.jgranados.unittesting.patrones.BuilderCuenta;
import com.jgranados.unittesting.patrones.ConexionSingleton;
import com.jgranados.unittesting.patrones.Cuenta;
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jose
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(ConexionSingleton.getInstance("uno").getConexionValue());
        ConexionSingleton.getInstance("sss").setConexionValue("tres");
        System.out.println(ConexionSingleton.getInstance("dos").getConexionValue());

        Cuenta cta2 = new Cuenta(1, LocalDate.now(), "nombre", 100, "tipo", "dato2", "dato1", "dato3");

        Cuenta cta1 = new Cuenta(1, LocalDate.now(), "nombre", 100, "tipo");
        cta1.setFechaCreacion(LocalDate.now());
        cta1.setMonto(100);
        cta1.setNumero(1);
        cta1.setTipo("tipo");
        cta1.setNombre("nombre");

        BuilderCuenta builderCuenta = new BuilderCuenta(5);
        Cuenta cta3 = builderCuenta
                .withMonto(100)
                .withNombre("nombre")
                .withFechaCreacion(LocalDate.now())
                .withTipo("tipo")
                .build();
        
        Cuenta cta4 = new Cuenta();

    }

}
