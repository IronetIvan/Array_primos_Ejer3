/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_primos_ejer3;
import java.util.*;
/**
 *
 * @author Usuario DAM 1
 */
public class Array_primos_Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int aux = 0;
        int j = 0;
        int suma = 0;
         int[][] numero = {{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {20, 5, 7, 4, 32, 9, 2, 14, 11, 6}};
        for (int i = 1; i <= numero.length; i++) {
        for (int[] numero1 : numero) {
             if (numero1[i] > numero1[j]) {
                                aux = numero1[i];
                                numero1[i] = numero1[j];
                                numero1[j] = aux;
                            }
            System.out.println(Arrays.toString(numero1));
        
        }
        }
            }
    }
       

