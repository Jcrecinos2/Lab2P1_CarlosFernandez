/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_carlosfernandez;

import java.util.Scanner;

/**
 *
 * @author cdfer
 */
public class Lab2P1_CarlosFernandez {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer= new Scanner(System.in);
         int eleccion=-1;// Lo comienzo en -1 para que entre en el while y dejar libre el 0
         
         while (eleccion !=0){
         System.out.println("\n----------MENU-------");
         System.out.println("1: Permutaciones");
         System.out.println("2: Valores Comunes en Multiplicacion:");
         System.out.println("3: Triangulos Huecos");
         System.out.println("4: Para Salir ingrese 0");
         
         System.out.print("Ingrese su eleccion:");
         
         eleccion=leer.nextInt();
         // Aqui creamos el menu de opciones para abrir o cerrar las opciones  
         switch (eleccion){
             case 1:
                 System.out.println("\n-----Usted selecciono Permutaciones----");
                 int n,r;
                 do{
                     System.out.print("Ingrese el valor de n:");
                     n=leer.nextInt();
                     
                     System.out.print("Ingrese el valor de r:");
                     r=leer.nextInt();
                     
                     if(n<r || n<=0 || r<=0){
                         System.out.println("n no puede ser menor que r, y ambos deben de ser numeros positivos");
                         // Este es el mensaje de error en caso de que los datos sean invalidos 
                     }
                     
                     } while (n < r || n <= 0 || r <= 0);
                 // Aqui es para que se ejecute siempre y cuando los datos sean ciertos 
                 
                 
                 
                 
                 
                 
                     
                             
                 
                 
                                                                   
                 break;
                
             case 2:
                 System.out.println("\n------Usted selecciono Valores Comunes en Multiplicacion------");
                 
                 
                 break;
             case 3:
                 System.out.println("\n----------Usted selecciono Triangulos Huecos-------");
                 
                 //Fue mala mia no pude hablar con la ingeniera ;( le voy a preguntar de hoy en adelante 
                 
                 break;
                 
             case 4:
                 
                 System.out.println("\n-------Usted selecciono Salir-------");
                 
                 break;
                 
             default: 
                 
                 System.out.println("Opcion Invalida porfavor seleccione una opcion valida");
             
         }
         
         }
         
         
        
        
        
    }
    
}
