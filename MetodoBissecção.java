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
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        int f=0;
        int grau=0;
        float pontoa;
        float pontob;
        float fda;
        float fdb;                                     
        float xk;
        float fdxk;
        boolean isGrauValido = false;
        boolean isExisteRaiz = false;
        String pontoaabrev;   //variaveis de teste de abreviação
        String fim;
        
        while (isGrauValido == false) {
        System.out.println("Digite o grau da equação ");
        grau = input.nextInt();
        
         switch (grau) {

        case 1: //primeiro grau
        
            System.out.println("Digite o valor de A da equação: ");
            a = input.nextInt();
            System.out.println("Digite o valor de B da equação: ");
            b = input.nextInt();
            isGrauValido = true;
            System.out.println("Equação:  " + a + "X " + b );

        break;

       case 2: // segundo grau
            
            System.out.println("Digite o valor de A da equação: ");
            a = input.nextInt();
            System.out.println("Digite o valor de B da equação: ");
            b = input.nextInt();
            System.out.println("Digite o valor de C da equação: ");
            c = input.nextInt();
            isGrauValido = true;
            System.out.println("Equação:  "  +  a + "X^2 " + b + "X " + c );
            
        break;

        case 3: // terceiro grau
            
            System.out.println("Digite o valor de A da equação: ");
            a = input.nextInt();
            System.out.println("Digite o valor de B da equação: ");
            b = input.nextInt();
            System.out.println("Digite o valor de C da equação: ");
            c = input.nextInt();
            System.out.println("Digite o valor de D da equação: ");
            d = input.nextInt();
            isGrauValido = true;
            System.out.println("Equação:  "  +  a + "X^3 " + b + "X^2 " + c + "X " + d );

        break;
        
        case 4:
            
            System.out.println("Digite o valor de A da equação: ");
            a = input.nextInt();
            System.out.println("Digite o valor de B da equação: ");
            b = input.nextInt();
            System.out.println("Digite o valor de C da equação: ");
            c = input.nextInt();
            System.out.println("Digite o valor de D da equação: ");
            d = input.nextInt();
            System.out.println("Digite o valor de E da equação: ");
            e = input.nextInt();
            isGrauValido = true;
            System.out.println("Equação:  "  +  a + "X^4 " + b + "X^3 " + c + "X^2 " + d + "X " + e );
            
            

        break;
        
        case 5:
            
            System.out.println("Digite o valor de A da equação: ");
            a = input.nextInt();
            System.out.println("Digite o valor de B da equação: ");
            b = input.nextInt();
            System.out.println("Digite o valor de C da equação: ");
            c = input.nextInt();
            System.out.println("Digite o valor de D da equação: ");
            d = input.nextInt();
            System.out.println("Digite o valor de E da equação: ");
            e = input.nextInt();
            System.out.println("Digite o valor de F da equação: ");
            f = input.nextInt();
            isGrauValido = true;
            System.out.println("Equação:  "  +  a + "X^5 " + b + "X^4 " + c + "X^3 " + d + "X^2 " + e + "X " + f);
            
        break;

        default:
            System.out.println("O número escolhido é inválido! Digite um número entre 1 e 5.");
            

        }
        
        }
        
        
        
       
        System.out.println("Digite o valor do ponto aprox A: ");
        pontoa = input.nextFloat();
        
       
        System.out.println("Digite o valor do ponto aprox B: ");
        pontob = input.nextFloat();
        
                                                     //Fórmula digitada
       fda = (float) ((a * Math.pow(pontoa,2)) + (b * pontoa) + c ) ;
       fdb = (float) ((a * Math.pow(pontob,2)) + (b * pontob) + c ) ;
       
        
                                                     
                                                    //Teorema de Bolzano 
       
                                                    
       while(isExisteRaiz == false){                                             
       if (fda * fdb < 0){
        
           System.out.println("Existe pelo menos 1 raiz neste intervalo.");
           System.out.println("F(a): " + fda + "F(b): " + fdb);
           isExisteRaiz = true;
        }else{
           
           System.out.println("Não existem raizes neste intervalo");
           System.out.println("F(a): " + fda + "F(b): " + fdb);
           isExisteRaiz = true;
       }
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
       
        }while(fdxk > 0.001 | fdxk < -0.001);
                              
    
    }
}
