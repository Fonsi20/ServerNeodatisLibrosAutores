/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros.autores.neodatis;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author a16alfonsofa
 */
public interface EntradaTeclado {
    
     BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    
}
