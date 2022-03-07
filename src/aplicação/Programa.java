package aplicação;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Exceptions.DomainExceptions;
import entities.Reserva;

public class Programa {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      
      try {
      System.out.printf("Informe o numero do quarto: ");
      int numero_quarto = sc.nextInt();
      System.out.println("Informe a data de entrada(dd/MM/yyyy): ");
      Date data_entrada = sdf.parse(sc.next());
      System.out.println("Informe a data de saida(dd/MM/yyyy): ");
      Date data_saida = sdf.parse(sc.next());
      
      
       Reserva reserva = new Reserva(numero_quarto, data_entrada, data_saida);
       System.out.println("Reserva: " + reserva);
       
       System.out.println();
       System.out.println("Informe a data para atualizar a reserva: ");
       System.out.println("Informe a data de entrada(dd/MM/yyyy): ");
        data_entrada = sdf.parse(sc.next());
       System.out.println("Informe a data de saida(dd/MM/yyyy): ");
        data_saida = sdf.parse(sc.next());
        
        
       reserva.atualização_data(data_entrada, data_saida);
       System.out.println("Reserva " + reserva);
      }
    
      catch(ParseException e){
    	System.out.println("Formato de data invalido!");
      }
      catch(DomainExceptions e) {
    	  System.out.println("Erro na reserva!");
      }
      catch(RuntimeException e) {
    	  System.out.println("ERRO INESPERADO!");
      }
      
      
      
 sc.close();
}

}


