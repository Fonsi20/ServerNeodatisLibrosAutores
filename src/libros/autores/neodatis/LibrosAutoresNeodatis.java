/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros.autores.neodatis;

import java.io.IOException;
import static libros.autores.neodatis.EntradaTeclado.read;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.ODBServer;

/**
 *
 * @author a16alfonsofa
 */
public class LibrosAutoresNeodatis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        ODBServer server = ODBFactory.openServer(8000);
        server.addBase("LibrosAutores", "LibrosAutores.neo");
        server.startServer(true);
        int opc = 0;

        do {
            System.out.println("\n\nBienvenido al Servidor de Libros Autores Neodatis - Alfonso Fernández Álvarez\n"
                    + " 1 --- Consultar todos los Libros\n"
                    + " 2 --- Consultar todos los Autores\n"
                    + "-----------------------------------------------------------------------------------\n"
                    + " 3 --- Cerrar Servidor\n");
            
            opc = Integer.parseInt(read.readLine());

            switch (opc) {
                case 1:
                    Consultas.verLibros();
                    break;
                case 2:
                    Consultas.verAutores();
                    break;
                case 3:
                    server.close();
                    break;
                default:
                    System.out.println("'Error', elija una opción porfavor");
                    break;
            }
        } while (opc != 3);
    }
}
