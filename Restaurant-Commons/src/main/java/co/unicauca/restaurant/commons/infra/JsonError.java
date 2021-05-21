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
package co.unicauca.restaurant.commons.infra;

/**
 * Representa un error
 *
 * @author Luis Tabares
 */
public class JsonError {

    /**
     * Ej. 404
     */
    private String code;
    /**
     * Ej. Not_found
     */
    private String error;
    /**
     * Ej. La cédula del cliente no existe
     */
    private String message;

    /**
     * Constructor por defecto
     */
    public JsonError() {
    }

    /**
     * Constructor parametrizado
     *
     * @param code
     * @param error
     * @param message
     */
    public JsonError(String code, String error, String message) {
        this.code = code;
        this.error = error;
        this.message = message;
    }

    /**
     * Metodo getter
     *
     * @return el codigo de error
     */
    public String getCode() {
        return code;
    }

    /**
     * Metodo setter
     *
     * @param code el codigo de error
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Metodo getter
     *
     * @return el nombre del error
     */
    public String getError() {
        return error;
    }

    /**
     * Metodo setter
     *
     * @param error el String que contiene el nombre del error
     */
    public void setError(String error) {
        this.error = error;
    }

    /**
     * Metodo getter
     *
     * @return el mensaje de error
     */
    public String getMessage() {
        return message;
    }

    /**
     * Metodo setter
     *
     * @param message el String que contiene el mensaje de error
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
