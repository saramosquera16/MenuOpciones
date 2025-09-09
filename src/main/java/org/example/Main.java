package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Programa para crear un ciclo
        //y crear un menu de opciones
        Integer opcionesSeleccionada=0;
             while(opcionesSeleccionada !=5){
                 System.out.println("Menu de opciones");
                 System.out.println("****************");
                 System.out.println("Digita 1 para sumar +");
                 System.out.println("Digita 2 para restar -");
                 System.out.println("Digita 3 para multiplicar *");
                 System.out.println("Digita 4 para divdir /");
                 System.out.println("Digita 5 para SALIR DEL PROGRAMA");

                 Scanner LeerTeclado=new Scanner(System.in);
                 System.out.println("Seleccione una opcion:");
                 opcionesSeleccionada= LeerTeclado.nextInt();

                 //evaluando caminos segun la opcion del usuario:
                 if (opcionesSeleccionada==1){
                     System.out.println("SUMANDO....");
                 } else if (opcionesSeleccionada==2) {
                     System.out.println("RESTANDO...");
                 } else if (opcionesSeleccionada==3) {
                     System.out.println("MULTIPLICANDO...");
                 } else if (opcionesSeleccionada==4) {
                     System.out.println("DIVIDIENDO.....");
                 } else if (opcionesSeleccionada==5) {
                     System.out.println("OPCION INVALIDA...");
                 }

             }

    }
}