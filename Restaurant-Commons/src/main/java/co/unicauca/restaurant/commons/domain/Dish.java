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
package co.unicauca.restaurant.commons.domain;

/**
 *
 * @author Luis Tabares
 */
public class Dish {

    private String id;
    private String name;
    private String description;
    private String price;
    private String size;

    /**
     * Constructor por defecto
     */
    public Dish() {
    }

    /**
     * Constructor parametrizado
     *
     * @param id identificador del plato
     * @param name nombre del plato
     * @param description descripcion del plato
     * @param price precio del plato
     * @param size tamaño del plato
     */
    public Dish(String id, String name, String description, String price, String size) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.size = size;
    }

    /**
     * Metodo setter
     *
     * @param id identificador del plato
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Metodo setter
     *
     * @param name nombre del plato
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodo setter
     *
     * @param description descripcion del plato
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Metodo setter
     *
     * @param price precio del plato
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * Metodo setter
     *
     * @param size tamaño del plato
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Metodo getter
     *
     * @return el identificador del plato
     */
    public String getId() {
        return this.id;
    }

    /**
     * Metodo getter
     *
     * @return el nombre del plato
     */
    public String getName() {
        return this.name;
    }

    /**
     * Metodo getter
     *
     * @return la descripcion del plato
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Metodo getter
     *
     * @return el precio del plato
     */
    public String getPrice() {
        return this.price;
    }

    /**
     * Metodo getter
     *
     * @return el tamaño del plato
     */
    public String getSize() {
        return this.size;
    }
}
