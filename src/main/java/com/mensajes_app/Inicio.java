package com.mensajes_app;

import java.sql.Connection;

public class Inicio {
    public static void main(String[] args) {

        Connection conexion = new Conexion().get_connection();

        try (Connection cnx = conexion) {

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
