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
import java.util.ArrayList;
import java.util.List;

/**
 * Implementación de IDishRepository. Utilliza arreglos en memoria
 *
 * @author Luis Tabares
 */
public final class DishRepositoryImplArrays implements IDishRepository {

    /**
     * Array List de platos
     */
    private static List<Dish> dishes;

    public DishRepositoryImplArrays() {
        if (dishes == null) {
            dishes = new ArrayList();
        }

        if (dishes.size() == 0) {
            inicializar();
        }
    }

    public void inicializar() {
        dishes.add(new Dish("2020001", "Arroz chino", "Arroz con camarones, pollo y raices chinas.", "15000", "HALF"));
        dishes.add(new Dish("2020002", "Ajiaco", "Sopa con pollo desmenusado, papa y crema de leche.", "16000", "ALL"));
        dishes.add(new Dish("2020003", "Bandeja paisa", "Plato con carne, chorizo, huevo frito y frijoles.", "18000", "HALF"));
        dishes.add(new Dish("2020004", "Picada", "Plato con varias carnes troceadas, carne de res, de cerdo, pollo y chorizo.", "24000", "HALF"));
        dishes.add(new Dish("2020005", "Tamal", "Porcion de arroz con pollo, carne, huevo y arvejas.", "6000", "ALL"));
    }

    /**
     * Busca un dish en el arreglo
     *
     * @param id identificador del plato
     * @return objeto Dish
     */
    @Override
    public Dish findDish(String id) {
        for (Dish dish : dishes) {
            if (dish.getId().equals(id)) {
                return dish;
            }
        }
        return null;
    }

    /**
     * Crea un plato en el arreglo
     *
     * @param dish el plato a agregar
     * @return el identificador del plato creado
     */
    @Override
    public String createDish(Dish dish) {
        dishes.add(dish);
        return dish.getId();
    }
}
