package aplicação;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Reserva;

public class Programa {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      
      System.out.printf("Informe o numero do quarto: ");
      int numero_quarto = sc.nextInt();
      System.out.println("Informe a data de entrada(dd/MM/yyyy): ");
      Date data_entrada = sdf.parse(sc.next());
      System.out.println("Informe a data de saida(dd/MM/yyyy): ");
      Date data_saida = sdf.parse(sc.next());
      
      if(!data_saida.after(data_entrada)) {
    	  System.out.println("Erro na reserva: A data de saída deve ser após a data de entrada!");
      } else {
    	  Reserva reserva = new Reserva(numero_quarto, data_entrada, data_saida);
       System.out.println("Reserva: " + reserva);
       
       System.out.println();
       System.out.println("Informe a data para atualizar a reserva: ");
       System.out.println("Informe a data de entrada(dd/MM/yyyy): ");
        data_entrada = sdf.parse(sc.next());
       System.out.println("Informe a data de saida(dd/MM/yyyy): ");
        data_saida = sdf.parse(sc.next());
        
        Date agora = new Date();
        if(data_entrada.before(agora) || data_saida.before(agora)) {
        	System.out.println("Erro na reserva: o datador de reserva para atualização dever ser datas futuras!");
        } else if(!data_saida.after(data_entrada)){
        	 System.out.println("Erro na reserva: A data de saída deve ser após a data de entrada!");
       
        } else {	 
        reserva.atualização_data(data_entrada, data_saida);
        System.out.println("Reserva: " + reserva);
        
      }
      
      
      }    
      
      
      
  sc.close();
	}

}
