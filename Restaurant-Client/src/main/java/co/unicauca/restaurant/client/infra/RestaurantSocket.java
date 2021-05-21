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

import co.unicauca.restaurant.commons.infra.Utilities;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Representa el Socket de la aplicación cliente. Su función es enviar una
 * solicitud/respuesta entre el cliente y el servidor.
 *
 * @author Luis Tabares
 */
public class RestaurantSocket {

    /**
     * Socket de la aplicación cliente
     */
    private java.net.Socket socket = null;
    /**
     * Permite leer la recibir la respuesta del socket
     */
    private Scanner input;
    /**
     * Permite enviar una solicitud por el socket
     */
    private PrintStream output;
    /**
     * Ip del Server Socket
     */
    private final String IP_SERVER = Utilities.loadProperty("server.ip");
    /**
     * Puerto del server socket
     */
    private final int PORT = Integer.parseInt(Utilities.loadProperty("server.port"));

    /**
     * Envia una solicitud desde la aplicación cliente al servidor mediate el
     * socket
     *
     * @param requestJson solicitud en formato json
     * @return respuesta del scoket
     * @throws IOException error de entrada y salida
     */
    public String sendStream(String requestJson) throws IOException {
        String response = "";
        input = new Scanner(socket.getInputStream());
        output = new PrintStream(socket.getOutputStream());
        output.flush();

        // Enviar la solicitud
        output.println(requestJson);

        // Procesa la respuesta
        if (input.hasNextLine()) {
            response = input.nextLine();
        }
        return response;
    }

    /**
     * Cierra los flujos input y output
     */
    public void closeStream() {
        output.close();
        input.close();
    }

    /**
     * Desconectar el socket
     */
    public void disconnect() {
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(RestaurantSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Conectar o abrir un socket
     *
     * @throws IOException error de entrada y salida
     */
    public void connect() throws IOException {
        socket = new java.net.Socket(IP_SERVER, PORT);
        Logger.getLogger("SocketClient").log(Level.INFO, "Socket establecido");
    }

}
