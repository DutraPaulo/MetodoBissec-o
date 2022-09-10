/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodobissecção;

import java.util.Scanner;

/**
 *
 * @author Paulo Dutra
 */
public class MetodoBissecção {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
                                         //variaveis
        int a;
        int b;
        int c;
        float pontoa=0;
        float pontob;
        float fda;
        float fdb;                                     
        float xk;
        float fdxk;
        
        String pontoaabrev;   //variaveis de teste de abreviação
        String fim;
        
        System.out.println("Digite o valor de A da equação: ");
        a = input.nextInt();
        System.out.println("Digite o valor de B da equação: ");
        b = input.nextInt();
        System.out.println("Digite o valor de C da equação: ");
        c = input.nextInt();
        
        System.out.println("Equação:  "  +  a + "X^2" + b + "X" + c );
       
        System.out.println("Digite o valor do ponto aprox A: ");
        pontoa = input.nextFloat();
        
        pontoaabrev = String.valueOf(pontoa);    //teste abreviação
        fim = pontoaabrev.substring(0, 5);
        System.out.println(">>" + fim);
        
        System.out.println("Digite o valor do ponto aprox B: ");
        pontob = input.nextFloat();
        
                                                     //Fórmula digitada
       fda = (float) ((a * Math.pow(pontoa,2)) + (b * pontoa) + c ) ;
       fdb = (float) ((a * Math.pow(pontob,2)) + (b * pontob) + c ) ;
       
        
                                                     
                                                    //Teorema de Bolzano 
       if (fda * fdb < 0){
        
           System.out.println("Existe pelo menos 1 raiz neste intervalo.");
           System.out.println("F(a): " + fda + "F(b): " + fdb);
        }else{
           
           System.out.println("Não existem raizes neste intervalo");
           System.out.println("F(a): " + fda + "F(b): " + fdb);
       }
       
       xk = (pontoa + pontob)/2;
       
       fdxk = (float) ((a * Math.pow(xk,2)) + (b * xk) + c ) ;   //formula digitada
       
        System.out.println("Resultado para equação X^2-X-1: ");       
        System.out.println("A = " + pontoa + " | " + "B = " + pontob + " | " + "F(a) = " + fda + " | " + "F(b) = " + fdb + " | " +
                           "Xk = " + xk + " | " + "F(xk) = " + fdxk);
       
        
        do{
      
        if(fda * fdxk < 0){
           
            pontoa = pontoa;
            pontob = xk;
            xk = (pontoa + pontob)/2;
            fdb = fdxk;
            fdxk = (float) ((a * Math.pow(xk,2)) + (b * xk) + c ) ;
            
            
                  
        System.out.println("A = " + pontoa + " | " + "B = " + pontob + " | " + "F(a) = " + fda + " | " + "F(b) = " + fdb + " | " +
                           "Xk = " + xk + " | " + "F(xk) = " + fdxk);
            
            
        }else{     
            
            pontoa = xk;
            pontob = pontob;
            xk = (pontoa + pontob)/2;
            fda = fdxk;
            fdxk = (float) ((a * Math.pow(xk,2)) + (b * xk) + c ) ;
            
            
            
                 
        System.out.println(String.format("A = " + pontoa + " | " + "B = " + pontob + " | " + "F(a) = " + fda + " | " + "F(b) = " + fdb + " | " +
                           "Xk = " + xk + " | " + "F(xk) = " + fdxk));
                    
        }
       
        }while(fdxk > 0.01 | fdxk < -0.01);
                              
    
}
