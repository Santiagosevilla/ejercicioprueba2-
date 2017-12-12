/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author SANTIAGO27
 */
public class EjerciciosPruebaEnClases {
     private Integer arrayTemperaturas[];
    
    public void llenarArreglo(){
        arrayTemperaturas=new Integer[10];
        for(int i=0;i<arrayTemperaturas.length;i++){
            arrayTemperaturas[i]=(int)(Math.random()*10);
        }
    }
    
    public void imprimir(){
        String acu="";
        for (int i = 0; i < arrayTemperaturas.length; i++) {
            acu+=""+arrayTemperaturas[i];
        }
        JOptionPane.showMessageDialog(null,acu);
    }
    
    public void imprimir2(){
        JOptionPane.showMessageDialog(null,Arrays.toString(arrayTemperaturas));
    }
    
    public void ordenar(){
        Arrays.sort(arrayTemperaturas);
    }
    
    public void maximo(){
        List<Integer> arr=new ArrayList();
        arr=Arrays.asList(arrayTemperaturas);
        Integer max= Collections.max(arr);
        JOptionPane.showMessageDialog(null,max);
    }
    public void menu(){
        char op;
        do{
            op=JOptionPane.showInputDialog("a.- Llenar arreglo con 10 elementos randomicos\n"
               + "b.- Imprimir arreglo almacenando lo en un String\n"
               + "c.- Imprimir arreglo con JOptionPane y un toString\n"
               + "d.- Ordenar el arreglo en orden ascendente\n"
               + "e.- Retorna el maximo de un arreglo \n"
               + "f.- Salir").charAt(0);
            switch(op){
                case 'a':
                    llenarArreglo();
                    break;
                case 'b':
                    imprimir();
                    break;
                case 'c':
                    imprimir2();
                    break;
                case 'd':
                    ordenar();
                    break;
                case 'e':
                    maximo();
                    break;
                case 'f':
                    System.exit(0);
                    break;
            }
        }while (op!='f');
    }
}
