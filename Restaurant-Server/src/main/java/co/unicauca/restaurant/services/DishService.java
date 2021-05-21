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
package co.unicauca.restaurant.services;

import co.unicauca.restaurant.commons.domain.Dish;
import co.unicauca.restaurant.commons.infra.JsonError;
import co.unicauca.restaurant.commons.infra.Utilities;
import co.unicauca.restaurant.server.access.IDishRepository;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 * Servicio de clientes. Da acceso a la lógica de negocio
 *
 * @author Luis Tabares
 */
public class DishService {

    /**
     * Repositorio de platos
     */
    IDishRepository repo;

    /**
     * Constructor parametrizado. Hace inyeccion de dependencias
     *
     * @param repo repositorio de tipo IDishRepository
     */
    public DishService(IDishRepository repo) {
        this.repo = repo;
    }

    /**
     * Buscar un plato
     *
     * @param id identificador del plato
     * @return objeto tipo Dish
     */
    public Dish findDish(String id) {
        return repo.findDish(id);
    }

    /**
     * Crea un nuevo dish, Aplica validaciones de negocio
     *
     * @param dish el plato a ser guardado
     * @return devuelve el identificador del plato creado
     */
    public String createDish(Dish dish) {
        List<JsonError> errors = new ArrayList<>();

        // Validaciones y reglas de negocio
        if (dish.getId().isEmpty() || dish.getName().isEmpty()
                || dish.getDescription().isEmpty() || dish.getPrice().isEmpty()
                || dish.getSize().isEmpty()) {
            errors.add(new JsonError("400", "BAD_REQUEST", "id, nombre, descripcion, precio y tamaño son obligatorios. "));
        }

        if (dish.getSize().equals("ALL") || dish.getSize().equals("HALF")) {
            errors.add(new JsonError("400", "BAD_REQUEST", "Tamaño debe ser ALL o HALF"));
        }

        // Que no esté repetido
        Dish dishSearched = this.findDish(dish.getId());
        if (dishSearched != null) {
            errors.add(new JsonError("400", "BAD_REQUEST", "El id ya existe. "));
        }

        if (!errors.isEmpty()) {
            Gson gson = new Gson();
            String errorsJson = gson.toJson(errors);
            return errorsJson;
        }
        return repo.createDish(dish);
    }
}
