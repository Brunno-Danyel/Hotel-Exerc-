package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
    
	private Integer numero_quarto;
    private Date data_entrada;
    private Date data_saida;
	
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public Reserva(Integer numero_quarto, Date data_entrada, Date data_saida) {
		
		this.numero_quarto = numero_quarto;
		this.data_entrada = data_entrada;
		this.data_saida = data_saida;
	}
    
    public Reserva() {
    	
    }

	public Integer getNumero_quarto() {
		return numero_quarto;
	}

	public void setNumero_quarto(Integer numero_quarto) {
		this.numero_quarto = numero_quarto;
	}

	public Date getData_entrada() {
		return data_entrada;
	}

	
	public Date getData_saida() {
		return data_saida;
	}

	
    public long duracao() {
    	 long diferenca = data_saida.getTime() - data_entrada.getTime();
    	 return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
    }
   
    public void atualização_data(Date data_entrada, Date data_saida) {
        this.data_entrada = data_entrada;
        this.data_saida = data_saida;
    	
    }
    
    @Override
    public String toString() {
         return "Quarto "
        		+ numero_quarto
        		+ "- Data de entrada: "
        		+ sdf.format(data_entrada)
                + " // "
                + "Data de saida: "
                + sdf.format(data_saida)
                + ", "
                + duracao()
                + " noites";
    }
    
    
}
