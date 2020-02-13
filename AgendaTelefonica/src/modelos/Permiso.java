/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author damar
 */
public class Permiso {
    private static boolean permiso;

    /**
     * @return the permiso
     */
    public static boolean isPermiso() {
        return permiso;
    }

    /**
     * @param permiso the permiso to set
     */
    public static void setPermiso(boolean ppermiso) {
        permiso = ppermiso;
    }
}
