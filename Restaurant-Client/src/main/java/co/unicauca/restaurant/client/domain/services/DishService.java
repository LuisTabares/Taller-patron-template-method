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
package co.unicauca.restaurant.client.domain.services;

import co.unicauca.restaurant.commons.domain.Dish;
import co.unicauca.restaurant.client.access.IDishAccess;

/**
 * Es una fachada para comunicar la presentación con el dominio
 *
 * @author Luis Tabares
 */
public class DishService {

    private final IDishAccess service;

    /**
     * Constructor privado que evita que otros objetos instancien
     *
     * @param service implementacion de tipo IDishService
     */
    public DishService(IDishAccess service) {
        this.service = service;
    }

    /**
     * Busca un plato en el servidor remoto
     *
     * @param id identificador del plato
     * @return Objeto tipo plato, null si no lo encuentra
     * @throws java.lang.Exception la excepcio se lanza cuando no logra conexión
     * con el servidor
     */
    public Dish findDish(String id) throws Exception {
        return service.findDish(id);

    }

    /**
     * Crea un plato en el servidor remoto
     *
     * @param dish objeto tipo plato
     * @return el identificador del plato guardado en el servidor remoto
     * @throws Exception si no se pudo guardar el plato
     */
    public String createDish(Dish dish) throws Exception {
        return service.createDish(dish);

    }

}
