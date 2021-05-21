/*
 * Copyright (C) 2021 Luis Tabares
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package co.unicauca.restaurant.client.infra;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Tabares
 */
public class Messages {

    /**
     * Genera un emergente de aventencia
     *
     * @param mns mensaje dentro de la ventana
     * @param title título de la ventana
     */
    public static void warningMessage(String mns, String title) {
        JOptionPane.showMessageDialog(null, mns, title, JOptionPane.DEFAULT_OPTION, new ImageIcon("./src/recursos/warning.png"));
    }

    /**
     * Genera un emergente de error
     *
     * @param mns mensaje dentro de la ventana
     * @param titulo título de la ventana
     */
    public static void errorMessage(String mns, String titulo) {
        JOptionPane.showMessageDialog(null, mns, titulo, JOptionPane.DEFAULT_OPTION, new ImageIcon("./src/recursos/warning.png"));
    }

    /**
     * Genera un emergente de exito
     *
     * @param mns mensaje dentro de la ventana
     * @param title título de la ventana
     */
    public static void successMessage(String mns, String title) {
        JOptionPane.showMessageDialog(null, mns, title, JOptionPane.DEFAULT_OPTION, new ImageIcon("./src/recursos/exitoso.png"));
    }

    /**
     * Genera un emergente de confirmación con los botones Si ó No
     *
     * @param mns mensaje dentro de la ventana
     * @param title título de la ventana
     * @return Si ó No
     */
    public static int confirmMessage(String mns, String title) {
        return JOptionPane.showConfirmDialog(null, mns, title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    }

}
