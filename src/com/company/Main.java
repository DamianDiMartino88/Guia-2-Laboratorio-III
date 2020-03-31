package com.company;

import com.Cuenta.Cuenta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion=0;
        Cuenta nuevaCuenta = new Cuenta();
       while(opcion!=6) {
           System.out.println("Bienvenido al sistema UTNRed, Q Operacion Desea Realizar");
           System.out.println("1. Crear cuenta vacía");
           System.out.println("2. Crear cuenta con saldo inicial");
           System.out.println("3. Ingresar dinero");
           System.out.println("4. Sacar dinero");
           System.out.println("5. Ver saldo");
           System.out.println("6. Salir");
           opcion = scan.nextInt();
           switch (opcion) {
               case 1: {
                   System.out.println("Ingrese su Nombre:");
                   String nombreTitular = scan.next();
                   nuevaCuenta.setNombreTitular(nombreTitular);
                   System.out.println("La Cuenta se ha Creado con exito");
                   System.out.println("Titula: " + nuevaCuenta.getNombreTitular());
                   System.out.println("Numero de Cuenta: " + nuevaCuenta.getNumeroDeCuenta());
                   System.out.println("El Saldo de Su cuenta es: $" + nuevaCuenta.getSaldo());
               }
               break;
               case 2: {
                   System.out.println("Ingrese su Nombre:");
                   String nombreTitular = scan.next();
                   nuevaCuenta.setNombreTitular(nombreTitular);
                   System.out.println("Ingrese  Saldo Inicial:");
                   float saldoInicial = (float) scan.nextDouble();
                   nuevaCuenta.setSaldo(saldoInicial);
                   System.out.println("La Cuenta se ha Creado con exito");
                   System.out.println("Titula: " + nuevaCuenta.getNombreTitular());
                   System.out.println("Numero de Cuenta: " + nuevaCuenta.getNumeroDeCuenta());
                   System.out.println("El Saldo de Su cuenta es: $" + nuevaCuenta.getSaldo());
               }
               break;
               case 3: {
                   System.out.println("Indique La Cantidad De Dinero a Ingresar:");
                   float ingresoSaldo = (float) scan.nextDouble();
                   nuevaCuenta.ingresarSaldo(ingresoSaldo);
               }
               break;
               case 4: {
                   System.out.println("Indique La Cantidad De Dinero a Extraer:");
                   float extraeSaldo = (float) scan.nextDouble();
                   nuevaCuenta.extraerSaldo(extraeSaldo);
               }
               break;
               case 5: {
                   System.out.println("El Saldo de Su cuenta es: $" + nuevaCuenta.getSaldo());
               }
               break;
               case 6: {
                   System.out.println("Gracias Por Usar Nuestros Servicios");
               }
               break;
               default: {
                   System.out.println("Esa Opcion es Incorrecta, por favor ingrese una Opcion Disponible");

               }

           }
           if(opcion!=6) {
               System.out.println("Presione una Tecla para Continuar");
               scan.next();
           }
       }
    }
}
