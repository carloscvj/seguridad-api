/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cvjpy.seguridad;

import es.cvjpy.MngrPro;
import java.util.List;

/**
 *
 * @author carlos
 */
public interface MenuNodoMngrPro extends MngrPro<MenuNodo> {

    List<Rol> getRoles() throws Exception;

    List<Rol> getPermitidos(String deste) throws Exception;
}
