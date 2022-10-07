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
        int metodoEscolhido = 0;
        double pontoa=0;
        double pontob=0;
        double fda=0;
        double fdb=0;                                     
        double xk=0;
        double fdxk=0;
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
        
        while(metodoEscolhido != 1 && metodoEscolhido != 2 &&  metodoEscolhido != 3){
        System.out.println("Escolha o método desejado:");
        System.out.println("1 - Método da bissecção");
        System.out.println("2 - Método da falsa posição");
        System.out.println("3 - Método da Secante");
        metodoEscolhido = input.nextInt();
        
        if(metodoEscolhido != 1 && metodoEscolhido != 2 && metodoEscolhido != 3){
            System.out.println("Número inválido. Escolha um dos métodos disponíveis");
        }else{
        }
        }
        
        
        switch (metodoEscolhido) {  //bisecção
            
            case 1: //Biseccao
                System.out.println("Método escolhido: Bisecção!");
                while(isExisteRaiz == false){

            System.out.println("Digite o valor do ponto aprox A: ");
            pontoa = input.nextFloat();

            System.out.println("Digite o valor do ponto aprox B: ");
            pontob = input.nextFloat();

            switch (grau) {  //formula dinamica

            case 1: //primeiro grau

                fda = Math.round(((a * pontoa) + b ) * 10000.0) / 10000.0;
                fdb = Math.round(((a * pontob) + b ) * 10000.0) / 10000.0;
                xk = Math.round(((pontoa + pontob)/2) * 10000.0) / 10000.0;
                fdxk = Math.round(((a * xk) + b ) * 10000.0) / 10000.0;
            break;

            case 2: // segundo grau

                fda = Math.round(((a * Math.pow(pontoa,grau)) + (b * pontoa) + c ) * 10000.0) / 10000.0;
                fdb = Math.round(((a * Math.pow(pontob,grau)) + (b * pontob) + c ) * 10000.0) / 10000.0;
                xk = Math.round(((pontoa + pontob)/2) * 10000.0) / 10000.0;
                fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * xk) + c ) * 10000.0) / 10000.0;

            break;

            case 3: // terceiro grau

                fda = Math.round(((a * Math.pow(pontoa,grau)) + (b * Math.pow(pontoa,grau-1)) + c * pontoa + d ) * 10000.0) / 10000.0;
                fdb = Math.round(((a * Math.pow(pontob,grau)) + (b * Math.pow(pontob,grau-1)) + c * pontob + d ) * 10000.0) / 10000.0;
                xk = Math.round((pontoa + pontob)/2 * 10000.0) / 10000.0;
                fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * Math.pow(xk,grau-1)) + c * xk + d ) * 10000.0) / 10000.0;

            break;

            case 4: //quarto grau

                fda = Math.round(((a * Math.pow(pontoa,grau)) + (b * Math.pow(pontoa,grau-1)) + (c * Math.pow(pontoa,grau-2)) + pontoa * d + e ) * 10000.0) / 10000.0;
                fdb = Math.round(((a * Math.pow(pontob,grau)) + (b * Math.pow(pontob,grau-1)) + (c * Math.pow(pontob,grau-2)) + pontob * d + e ) * 10000.0) / 10000.0;
                xk = Math.round((pontoa + pontob)/2 * 10000.0) / 10000.0;
                fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * Math.pow(xk,grau-1)) + (c * Math.pow(xk,grau-2)) + xk * d + e ) * 10000.0) / 10000.0;

            break;

            case 5: // quinto grau

                fda = Math.round(((a * Math.pow(pontoa,grau)) + (b * Math.pow(pontoa,grau-1)) + (c * Math.pow(pontoa,grau-2)) + (d * Math.pow(pontoa,grau-3)) + pontoa * e + f) * 10000.0) / 10000.0;
                fdb = Math.round(((a * Math.pow(pontob,grau)) + (b * Math.pow(pontob,grau-1)) + (c * Math.pow(pontob,grau-2)) + (d * Math.pow(pontob,grau-3)) + pontob * e + f) * 10000.0) / 10000.0;
                xk = Math.round((pontoa + pontob)/2 * 10000.0) / 10000.0;
                fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * Math.pow(xk,grau-1)) + (c * Math.pow(xk,grau-2)) + (d * Math.pow(xk,grau-3)) + xk * e + f) * 10000.0) / 10000.0;

            break;

            default:

            }

           if (fda * fdb < 0){//Bolzano

               System.out.println("Existe pelo menos 1 raiz neste intervalo.");
               System.out.println("F(a): " + fda + "F(b): " + fdb);
               isExisteRaiz = true;
            }else{

               System.out.println("Não existem raizes neste intervalo. Por favor, selecione dois novos pontos.");
               System.out.println("F(a): " + fda + "F(b): " + fdb);

           }
           }


            System.out.println("Resultado para equação: ");       
            System.out.println("A = " + pontoa + " | " + "B = " + pontob + " | " + "F(a) = " + fda + " | " + "F(b) = " + fdb + " | " +
                               "Xk = " + xk + " | " + "F(xk) = " + fdxk);

            for(double i = fdxk; i > 0.01 | i < -0.01; i = fdxk){
            //while(fdxk > Math.pow(10, -3) | fdxk < (Math.pow(-10, -3)))

            if(fda * fdxk < 0){

                pontob = xk;
                fdb = fdxk;
                xk = Math.round((pontoa + pontob)/2 * 10000.0) / 10000.0;

                switch (grau) {  //formula dinamica

                case 1: //primeiro grau

                    fdxk = Math.round(((a * xk) + b) * 10000.0) / 10000.0;

                break;

                case 2: // segundo grau

                    fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * xk) + c ) * 10000.0) / 10000.0;

                break;

                case 3: // terceiro grau

                    fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * Math.pow(xk,grau-1)) + c * xk + d ) * 10000.0) / 10000.0;

                break;

                case 4: //quarto grau

                    fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * Math.pow(xk,grau-1)) + (c * Math.pow(xk,grau-2)) + xk * d + e ) * 10000.0) / 10000.0;

                break;

                case 5: // quinto grau

                    fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * Math.pow(xk,grau-1)) + (c * Math.pow(xk,grau-2)) + (d * Math.pow(xk,grau-3)) + xk * e + f) * 10000.0) / 10000.0;

                break;

                default:

                }
                System.out.println("A = " + pontoa + " | " + "B = " + pontob + " | " + "F(a) = " + fda + " | " + "F(b) = " + fdb + " | " +
                               "Xk = " + xk + " | " + "F(xk) = " + fdxk);

            }else{

                pontoa = xk;
                fda = fdxk;
                xk = Math.round((pontoa + pontob)/2 * 10000.0) / 10000.0;

                switch (grau) {  //formula dinamica

                case 1: //primeiro grau

                    fdxk = Math.round(((a * xk) + b ) * 10000.0) / 10000.0;

                break;

                case 2: // segundo grau

                    fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * xk) + c ) * 10000.0) / 10000.0;

                break;

                case 3: // terceiro grau

                    fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * Math.pow(xk,grau-1)) + c * xk + d ) * 10000.0) / 10000.0;

                break;

                case 4: //quarto grau

                    fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * Math.pow(xk,grau-1)) + (c * Math.pow(xk,grau-2)) + xk * d + e )* 10000.0) / 10000.0;

                break;

                case 5: // quinto grau

                    fdxk =  Math.round(((a * Math.pow(xk,grau)) + (b * Math.pow(xk,grau-1)) + (c * Math.pow(xk,grau-2)) + (d * Math.pow(xk,grau-3)) + xk * e + f) * 10000.0) / 10000.0;

                break;

                default:

                }

            System.out.println(String.format("A = " + pontoa + " | " + "B = " + pontob + " | " + "F(a) = " + fda + " | " + "F(b) = " + fdb + " | " +
                               "Xk = " + xk + " | " + "F(xk) = " + fdxk));

            }

            }


            break;//Fim método bisecção

            
            
            
            
            
            
            
            
            case 2: // Método da Falsa Posição
                System.out.println("Método escolhido: Falsa Posição!");
                while(isExisteRaiz == false){

                System.out.println("Digite o valor do ponto aprox A: ");
                pontoa = input.nextFloat();

                System.out.println("Digite o valor do ponto aprox B: ");
                pontob = input.nextFloat();

                switch (grau) {  //formula dinamica

                case 1: //primeiro grau

                    fda = Math.round(((a * pontoa) + b ) * 10000.0) / 10000.0;
                    fdb = Math.round(((a * pontob) + b ) * 10000.0) / 10000.0;
                    xk = Math.round((((pontoa * fdb) - (pontob * fda))/(fdb - fda)) * 10000.0) / 10000.0;
                    fdxk = Math.round(((a * xk) + b ) * 10000.0) / 10000.0;
                break;

                case 2: // segundo grau

                    fda = Math.round(((a * Math.pow(pontoa,grau)) + (b * pontoa) + c ) * 10000.0) / 10000.0;
                    fdb = Math.round(((a * Math.pow(pontob,grau)) + (b * pontob) + c ) * 10000.0) / 10000.0;
                    xk = Math.round((((pontoa * fdb) - (pontob * fda))/(fdb - fda)) * 10000.0) / 10000.0;
                    fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * xk) + c ) * 10000.0) / 10000.0;
                break;

                case 3: // terceiro grau

                    fda = Math.round(((a * Math.pow(pontoa,grau)) + (b * Math.pow(pontoa,grau-1)) + c * pontoa + d ) * 10000.0) / 10000.0;
                    fdb = Math.round(((a * Math.pow(pontob,grau)) + (b * Math.pow(pontob,grau-1)) + c * pontob + d ) * 10000.0) / 10000.0;
                    xk = Math.round((((pontoa * fdb) - (pontob * fda))/(fdb - fda)) * 10000.0) / 10000.0;
                    fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * Math.pow(xk,grau-1)) + c * xk + d )  * 10000.0) / 10000.0;
                break;

                case 4: //quarto grau

                    fda = Math.round(((a * Math.pow(pontoa,grau)) + (b * Math.pow(pontoa,grau-1)) + (c * Math.pow(pontoa,grau-2)) + pontoa * d + e ) * 10000.0) / 10000.0;
                    fdb = Math.round(((a * Math.pow(pontob,grau)) + (b * Math.pow(pontob,grau-1)) + (c * Math.pow(pontob,grau-2)) + pontob * d + e )  * 10000.0) / 10000.0;
                    xk = Math.round((((pontoa * fdb) - (pontob * fda))/(fdb - fda)) * 10000.0) / 10000.0;
                    fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * Math.pow(xk,grau-1)) + (c * Math.pow(xk,grau-2)) + xk * d + e ) * 10000.0) / 10000.0;
                break;

                case 5: // quinto grau

                    fda = Math.round(((a * Math.pow(pontoa,grau)) + (b * Math.pow(pontoa,grau-1)) + (c * Math.pow(pontoa,grau-2)) + (d * Math.pow(pontoa,grau-3)) + pontoa * e + f) * 10000.0) / 10000.0;
                    fdb = Math.round(((a * Math.pow(pontob,grau)) + (b * Math.pow(pontob,grau-1)) + (c * Math.pow(pontob,grau-2)) + (d * Math.pow(pontob,grau-3)) + pontob * e + f) * 10000.0) / 10000.0;
                    xk = Math.round((((pontoa * fdb) - (pontob * fda))/(fdb - fda)) * 10000.0) / 10000.0;
                    fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * Math.pow(xk,grau-1)) + (c * Math.pow(xk,grau-2)) + (d * Math.pow(xk,grau-3)) + xk * e + f) * 10000.0) / 10000.0;
                break;

                default:

                }

               if (fda * fdb < 0){//Bolzano

                   System.out.println("Existe pelo menos 1 raiz neste intervalo.");
                   System.out.println("F(a): " + fda + "F(b): " + fdb);
                   isExisteRaiz = true;
                }else{

                   System.out.println("Não existem raizes neste intervalo. Por favor, selecione dois novos pontos.");
                   System.out.println("F(a): " + fda + "F(b): " + fdb);

               }
               }

                System.out.println("Resultado para equação: ");       
                System.out.println("A = " + pontoa + " | " + "B = " + pontob + " | " + "F(a) = " + fda + " | " + "F(b) = " + fdb + " | " +
                                   "Xk = " + xk + " | " + "F(xk) = " + fdxk);

                //for(double i = fdxk; i < 1; i = fdxk){ //TROCAR ESSA CONDIÇÃO
                for(double i = fdxk; i > 0.01 | i < -0.01; i = fdxk){

                if(fda * fdxk < 0){

                    pontob = xk;
                    fdb = fdxk;
                    xk = Math.round((((pontoa * fdb) - (pontob * fda))/(fdb - fda)) * 10000.0) / 10000.0;

                    switch (grau) {  //formula dinamica

                    case 1: //primeiro grau

                        fdxk = Math.round(((a * xk) + b) * 10000.0) / 10000.0;

                    break;

                    case 2: // segundo grau

                        fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * xk) + c ) * 10000.0) / 10000.0;

                    break;

                    case 3: // terceiro grau

                        fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * Math.pow(xk,grau-1)) + c * xk + d ) * 10000.0) / 10000.0;

                    break;

                    case 4: //quarto grau

                        fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * Math.pow(xk,grau-1)) + (c * Math.pow(xk,grau-2)) + xk * d + e ) * 10000.0) / 10000.0;

                    break;

                    case 5: // quinto grau

                        fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * Math.pow(xk,grau-1)) + (c * Math.pow(xk,grau-2)) + (d * Math.pow(xk,grau-3)) + xk * e + f) * 10000.0) / 10000.0;

                    break;

                    default:

                    }
                    System.out.println("A = " + pontoa + " | " + "B = " + pontob + " | " + "F(a) = " + fda + " | " + "F(b) = " + fdb + " | " +
                                   "Xk = " + xk + " | " + "F(xk) = " + fdxk);

                }else{

                    pontoa = xk;
                    fda = fdxk;
                    xk = Math.round((((pontoa * fdb) - (pontob * fda))/(fdb - fda)) * 10000.0) / 10000.0;

                    switch (grau) {  //formula dinamica

                    case 1: //primeiro grau

                        fdxk = Math.round(((a * xk) + b ) * 10000.0) / 10000.0;

                    break;

                    case 2: // segundo grau

                        fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * xk) + c ) * 10000.0) / 10000.0;

                    break;

                    case 3: // terceiro grau

                        fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * Math.pow(xk,grau-1)) + c * xk + d ) * 10000.0) / 10000.0;

                    break;

                    case 4: //quarto grau

                        fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * Math.pow(xk,grau-1)) + (c * Math.pow(xk,grau-2)) + xk * d + e )* 10000.0) / 10000.0;

                    break;

                    case 5: // quinto grau

                        fdxk =  Math.round(((a * Math.pow(xk,grau)) + (b * Math.pow(xk,grau-1)) + (c * Math.pow(xk,grau-2)) + (d * Math.pow(xk,grau-3)) + xk * e + f) * 10000.0) / 10000.0;

                    break;

                    default:

                    }

                System.out.println(String.format("A = " + pontoa + " | " + "B = " + pontob + " | " + "F(a) = " + fda + " | " + "F(b) = " + fdb + " | " +
                                   "Xk = " + xk + " | " + "F(xk) = " + fdxk));

                }

                }

                break;//Fim do Método da Falsa Posição

            
            
            
            
            
            case 3: // Método da Secante
                System.out.println("Método escolhido: Secante!");
                while(isExisteRaiz == false){

                System.out.println("Digite o valor do ponto aprox A: ");
                pontoa = input.nextFloat();

                System.out.println("Digite o valor do ponto aprox B: ");
                pontob = input.nextFloat();

                switch (grau) {  //formula dinamica

                case 1: //primeiro grau

                    fda = Math.round(((a * pontoa) + b ) * 10000.0) / 10000.0;
                    fdb = Math.round(((a * pontob) + b ) * 10000.0) / 10000.0;
                    xk = Math.round((pontob - ((fdb * (pontob - pontoa)) / (fdb - fda))) * 10000.0) / 10000.0;
                    fdxk = Math.round(((a * xk) + b ) * 10000.0) / 10000.0;
                break;

                case 2: // segundo grau

                    fda = Math.round(((a * Math.pow(pontoa,grau)) + (b * pontoa) + c ) * 10000.0) / 10000.0;
                    fdb = Math.round(((a * Math.pow(pontob,grau)) + (b * pontob) + c ) * 10000.0) / 10000.0;
                    xk = Math.round((pontob - ((fdb * (pontob - pontoa)) / (fdb - fda))) * 10000.0) / 10000.0;
                    fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * xk) + c ) * 10000.0) / 10000.0;
                break;

                case 3: // terceiro grau

                    fda = Math.round(((a * Math.pow(pontoa,grau)) + (b * Math.pow(pontoa,grau-1)) + c * pontoa + d ) * 10000.0) / 10000.0;
                    fdb = Math.round(((a * Math.pow(pontob,grau)) + (b * Math.pow(pontob,grau-1)) + c * pontob + d ) * 10000.0) / 10000.0;
                    xk = Math.round((pontob - ((fdb * (pontob - pontoa)) / (fdb - fda))) * 10000.0) / 10000.0;
                    fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * Math.pow(xk,grau-1)) + c * xk + d ) * 10000.0) / 10000.0;
                break;

                case 4: //quarto grau

                    fda = Math.round(((a * Math.pow(pontoa,grau)) + (b * Math.pow(pontoa,grau-1)) + (c * Math.pow(pontoa,grau-2)) + pontoa * d + e ) * 10000.0) / 10000.0;
                    fdb = Math.round(((a * Math.pow(pontob,grau)) + (b * Math.pow(pontob,grau-1)) + (c * Math.pow(pontob,grau-2)) + pontob * d + e ) * 10000.0) / 10000.0;
                    xk = Math.round((pontob - ((fdb * (pontob - pontoa)) / (fdb - fda))) * 10000.0) / 10000.0;
                    fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * Math.pow(xk,grau-1)) + (c * Math.pow(xk,grau-2)) + xk * d + e ) * 10000.0) / 10000.0;
                break;

                case 5: // quinto grau

                    fda = Math.round(((a * Math.pow(pontoa,grau)) + (b * Math.pow(pontoa,grau-1)) + (c * Math.pow(pontoa,grau-2)) + (d * Math.pow(pontoa,grau-3)) + pontoa * e + f) * 10000.0) / 10000.0;
                    fdb = Math.round(((a * Math.pow(pontob,grau)) + (b * Math.pow(pontob,grau-1)) + (c * Math.pow(pontob,grau-2)) + (d * Math.pow(pontob,grau-3)) + pontob * e + f) * 10000.0) / 10000.0;
                    xk = Math.round((pontob - ((fdb * (pontob - pontoa)) / (fdb - fda))) * 10000.0) / 10000.0;
                    fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * Math.pow(xk,grau-1)) + (c * Math.pow(xk,grau-2)) + (d * Math.pow(xk,grau-3)) + xk * e + f) * 10000.0) / 10000.0;
                break;

                default:

                }

               if (fda * fdb < 0){//Bolzano

                   System.out.println("Existe pelo menos 1 raiz neste intervalo.");
                   System.out.println("F(a): " + fda + "F(b): " + fdb);
                   isExisteRaiz = true;
                }else{

                   System.out.println("Não existem raizes neste intervalo. Por favor, selecione dois novos pontos.");
                   System.out.println("F(a): " + fda + "F(b): " + fdb);

               }
               }

                System.out.println("Resultado para equação: ");       
                System.out.println("A = " + pontoa + " | " + "B = " + pontob + " | " + "F(a) = " + fda + " | " + "F(b) = " + fdb + " | " +
                                   "Xk = " + xk + " | " + "F(xk) = " + fdxk);

                break;
                default:

                }

            for(double i = fdxk; i > 0.1 | i < -0.1; i = fdxk){

                    pontoa = pontob;
                    fda = fdb;
                    pontob = xk;
                    fdb = fdxk;

                    switch (grau) {  //formula dinamica

                    case 1: //primeiro grau

                        xk = Math.round((pontob - ((fdb * (pontob - pontoa)) / (fdb - fda))) * 10000.0) / 10000.0;
                        fdxk = Math.round(((a * xk) + b) * 10000.0) / 10000.0;

                    break;

                    case 2: // segundo grau

                        xk = Math.round((pontob - ((fdb * (pontob - pontoa)) / (fdb - fda))) * 10000.0) / 10000.0;
                        fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * xk) + c ) * 10000.0) / 10000.0;

                    break;

                    case 3: // terceiro grau

                        xk = Math.round((pontob - ((fdb * (pontob - pontoa)) / (fdb - fda))) * 10000.0) / 10000.0;
                        fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * Math.pow(xk,grau-1)) + c * xk + d ) * 10000.0) / 10000.0;

                    break;

                    case 4: //quarto grau

                        xk = Math.round((pontob - ((fdb * (pontob - pontoa)) / (fdb - fda))) * 10000.0) / 10000.0;
                        fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * Math.pow(xk,grau-1)) + (c * Math.pow(xk,grau-2)) + xk * d + e ) * 10000.0) / 10000.0;

                    break;

                    case 5: // quinto grau

                        xk = Math.round((pontob - ((fdb * (pontob - pontoa)) / (fdb - fda))) * 10000.0) / 10000.0;
                        fdxk = Math.round(((a * Math.pow(xk,grau)) + (b * Math.pow(xk,grau-1)) + (c * Math.pow(xk,grau-2)) + (d * Math.pow(xk,grau-3)) + xk * e + f) * 10000.0) / 10000.0;

                    break;

                    default:

                    }

                    System.out.println(String.format("A = " + pontoa + " | " + "B = " + pontob + " | " + "F(a) = " + fda + " | " + "F(b) = " + fdb + " | " +
                                   "Xk = " + xk + " | " + "F(xk) = " + fdxk));

                }

                }

    }


    