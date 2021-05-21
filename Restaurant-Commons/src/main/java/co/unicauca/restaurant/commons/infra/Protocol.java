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

import java.util.ArrayList;
import java.util.List;

/**
 * Protocolo de comunicación entre la aplicación cliente y el servidor
 *
 * @author Luis Tabares
 */
public class Protocol {

    private String resource;
    private String action;
    private List<Parameter> parameters;

    /**
     * Constructor por defecto
     */
    public Protocol() {
        parameters = new ArrayList<>();
    }

    /**
     * Metodo getter
     *
     * @return el recurso
     */
    public String getResource() {
        return resource;
    }

    /**
     * Metodo setter
     *
     * @param resource el recurso
     */
    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * Metodo getter
     *
     * @return la accion
     */
    public String getAction() {
        return action;
    }

    /**
     * Metodo setter
     *
     * @param action la accion
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * Metodo getter
     *
     * @return la lista de parametros
     */
    public List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * Metodo setter
     *
     * @param parameters la lista de parametros
     */
    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    /**
     * Metodo que permite añadir parametros a la lista
     *
     * @param name nombre del parametro
     * @param value valor del parametro
     */
    public void addParameter(String name, String value) {
        parameters.add(new Parameter(name, value));
    }

}
