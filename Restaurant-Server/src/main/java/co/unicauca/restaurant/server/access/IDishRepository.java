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
package co.unicauca.restaurant.server.access;

import co.unicauca.restaurant.commons.domain.Dish;

/**
 *
 * @author Luis Tabares
 */
public interface IDishRepository {

    /**
     * Metodo abstracto que permite buscar un plato en el repositorio
     *
     * @param id el identificador del plato
     * @return objeto de tipo Dish
     */
    public Dish findDish(String id);

    /**
     * Metodo abstracto que permite guardar un plato en el repositorio
     *
     * @param dish objeto tipo Dish
     * @return el identificador del plato guardado
     */
    public String createDish(Dish dish);
}
