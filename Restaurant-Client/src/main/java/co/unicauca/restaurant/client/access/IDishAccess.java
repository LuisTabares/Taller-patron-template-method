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
package co.unicauca.restaurant.client.access;

import co.unicauca.restaurant.commons.domain.Dish;

/**
 *
 * @author Luis Tabares
 */
public interface IDishAccess {

    /**
     * Busca un Dish
     *
     * @param id identificador del plato
     * @return el plato
     * @throws Exception
     */
    public Dish findDish(String id) throws Exception;

    /**
     * Crea un Dish
     *
     * @param dish plato del restaurante
     * @return devuelve el id del plato creado
     * @throws Exception error crear el plato
     */
    public String createDish(Dish dish) throws Exception;
}
