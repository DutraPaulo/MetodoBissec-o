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
        float pontoa=0;
        float pontob=0;
        float fda=0;
        float fdb=0;                                     
        float xk=0;
        float fdxk=0;
        boolean isGrauValido = false;
        boolean isExisteRaiz = false;
        
        
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
     
                                           
                                                    //Teorema de Bolzano 
       
                                                    
       while(isExisteRaiz == false){
           
        System.out.println("Digite o valor do ponto aprox A: ");
        pontoa = input.nextFloat();
       
        System.out.println("Digite o valor do ponto aprox B: ");
        pontob = input.nextFloat();
           
       if (fda * fdb < 0){
        
           System.out.println("Existe pelo menos 1 raiz neste intervalo.");
           System.out.println("F(a): " + fda + "F(b): " + fdb);
           isExisteRaiz = true;
        }else{
           
           System.out.println("Não existem raizes neste intervalo");
           System.out.println("F(a): " + fda + "F(b): " + fdb);
           
       }
       }
       
       switch (grau) {  //formula dinamica

        case 1: //primeiro grau
        
            fda = (float) ((a * pontoa) + b ) ;
            fdb = (float) ((a * pontob) + b ) ;
            xk = (pontoa + pontob)/2;
            fdxk = (float) ((a * xk) + b ) ;
        break;

       case 2: // segundo grau
            
            fda = (float) ((a * Math.pow(pontoa,grau)) + (b * pontoa) + c ) ;
            fdb = (float) ((a * Math.pow(pontob,grau)) + (b * pontob) + c ) ;
            xk = (pontoa + pontob)/2;
            fdxk = (float) ((a * Math.pow(xk,grau)) + (b * xk) + c ) ;
            
        break;

        case 3: // terceiro grau
            
            fda = (float) ((a * Math.pow(pontoa,grau)) + (b * Math.pow(pontoa,grau-1)) + c * pontoa + d ) ;
            fdb = (float) ((a * Math.pow(pontob,grau)) + (b * Math.pow(pontob,grau-1)) + c * pontob + d ) ;
            xk = (pontoa + pontob)/2;
            fdxk = (float) ((a * Math.pow(xk,grau)) + (b * Math.pow(xk,grau-1)) + c * xk + d ) ;
          

        break;
        
        case 4: //quarto grau
            
            fda = (float) ((a * Math.pow(pontoa,grau)) + (b * Math.pow(pontoa,grau-1)) + (c * Math.pow(pontoa,grau-2)) + pontoa * d + e ) ;
            fdb = (float) ((a * Math.pow(pontob,grau)) + (b * Math.pow(pontob,grau-1)) + (c * Math.pow(pontob,grau-2)) + pontob * d + e ) ;
            xk = (pontoa + pontob)/2;
            fdxk = (float) ((a * Math.pow(xk,grau)) + (b * Math.pow(xk,grau-1)) + (c * Math.pow(xk,grau-2)) + xk * d + e ) ;
            

        break;
        
        case 5: // quinto grau
            
            fda = (float) ((a * Math.pow(pontoa,grau)) + (b * Math.pow(pontoa,grau-1)) + (c * Math.pow(pontoa,grau-2)) + (d * Math.pow(pontoa,grau-3)) + pontoa * e + f);
            fdb = (float) ((a * Math.pow(pontob,grau)) + (b * Math.pow(pontob,grau-1)) + (c * Math.pow(pontob,grau-2)) + (d * Math.pow(pontob,grau-3)) + pontob * e + f);
            xk = (pontoa + pontob)/2;
            fdxk = (float) ((a * Math.pow(xk,grau)) + (b * Math.pow(xk,grau-1)) + (c * Math.pow(xk,grau-2)) + (d * Math.pow(xk,grau-3)) + xk * e + f);
            
        break;

        default:
 
        }
       
       
        System.out.println("Resultado para equação: ");       
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
