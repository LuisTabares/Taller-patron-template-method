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

import co.unicauca.restaurant.commons.infra.Utilities;

/**
 * Fabrica que se encarga de instanciar DishServiceImplSockets o cualquier otro
 * que se cree en el futuro.
 *
 * @author Luis Tabares
 */
public class Factory {

    private static Factory instance;

    private Factory() {
    }

    /**
     * Clase singleton
     *
     * @return
     */
    public static Factory getInstance() {

        if (instance == null) {
            instance = new Factory();
        }
        return instance;

    }

    /**
     * Método que crea una instancia concreta de la jerarquia IDishService
     *
     * @return una clase hija de la abstracción IDishRepository
     */
    public IDishAccess getDishService() {

        IDishAccess result = null;
        String type = Utilities.loadProperty("dish.service");

        switch (type) {
            case "default":
                result = new DishAccessImplSockets();
                break;
        }

        return result;

    }
}
