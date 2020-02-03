package Programa;

import java.util.Locale;
import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
              
                    
        System.out.println("Digite os nomes :");
        String Nome = sc.next();
        String nome1 = sc.next();
        
        System.out.println("Digite as idades :");
        int idade= sc.nextInt();
        int idade1= sc.nextInt();
        int soma = idade + idade1;
        System.out.println ( "A soma das idades é: " +soma);
        		
        
           sc.close();
               }
            }    
