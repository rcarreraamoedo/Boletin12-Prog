/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12_1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Coches {

    private String matricula;
    private int tiempo;
    private float precio;
    private float dineroRecibido;
    private float dineroDevuelto;
    Scanner sc = new Scanner(System.in);

    public void calcularPrecio() {
        System.out.println("Introduce numero de horas: ");
        tiempo = sc.nextInt();
        if (tiempo <= 3) {
            precio = 1.50f;
        } else {
            int tiempo2 = tiempo - 3;
            precio = (tiempo2 * 0.2f) + 1.5f;
        }
        do {
            System.out.println("El precio es: " + precio + "\nIntroduce el dinero: ");
            dineroRecibido = sc.nextInt();
            dineroDevuelto = dineroRecibido - precio;
        } while (dineroRecibido < precio);
    }

    public void pedirDatos() {
        System.out.println("Introduce la matricula: ");
        matricula = sc.next();
        calcularPrecio();
    }

    public void amosar() {
        System.out.println("Factura:\n" + "Matricula: " + matricula + "\nTiempo: " + tiempo + "\nPrecio: "
                + precio + "\nDinero Recibido: " + dineroRecibido + "\nDineroDevuelto: " + dineroDevuelto);
    }
}
