/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros.autores.neodatis;

import Objetos.Autores;
import Objetos.Libros;
import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.ObjectValues;
import org.neodatis.odb.Values;
import org.neodatis.odb.impl.core.query.values.ValuesCriteriaQuery;

/**
 *
 * @author a16alfonsofa
 */
class Consultas {

    static void verAutores() {
        ODB odb = ODBFactory.openClient("localhost", 8000, "LibrosAutores");

        Values val = odb.getValues(new ValuesCriteriaQuery(Autores.class)
                .field("dni")
                .field("nombre")
                .field("direccion")
                .field("edad")
                .field("nacionalidad"));

        while (val.hasNext()) {
            ObjectValues ov = (ObjectValues) val.next();

            System.out.println("\nDNI: " + ov.getByAlias("dni")
                    + "\n Nombre:      " + ov.getByAlias("nombre")
                    + "\n Direccion:      " + ov.getByAlias("direccion")
                    + "\n Edad:      " + ov.getByAlias("edad")
                    + "\n Nacionalidad:      " + ov.getByAlias("nacionalidad")
                    + "\n\n ------------------------------------------------------");

//            odb.close();
        }
    }

    static void verLibros() {
        ODB odb = ODBFactory.openClient("localhost", 8000, "LibrosAutores");

        Values val = odb.getValues(new ValuesCriteriaQuery(Libros.class)
                .field("cod")
                .field("Titulo")
                .field("Categoria")
                .field("Precio")
                .field("fechaPublicacion"));

        while (val.hasNext()) {
            ObjectValues ov = (ObjectValues) val.next();

            System.out.println("\nCodigo: " + ov.getByAlias("cod")
                    + "\n Titulo:      " + ov.getByAlias("Titulo")
                    + "\n Categoria:      " + ov.getByAlias("Categoria")
                    + "\n Precio:      " + ov.getByAlias("Precio")
                    + "\n Fecha Publicacion:      " + ov.getByAlias("fechaPublicacion")
                    + "\n\n ------------------------------------------------------ \n");
            //  odb.close();
        }

    }
}
