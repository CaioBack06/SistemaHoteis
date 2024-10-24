package sistemaHotel;

public class Reserva {
	private String checkIn;
	private String checkOut;
	private int nmQrts;
	private String nomeH;
	private String tipoQrts;

	public Reserva(String checkIn, String checkOut, int nmQrts, String nomeH, String tipoQrts) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.nmQrts = nmQrts;
		this.nomeH = nomeH;
		this.tipoQrts = tipoQrts;
	}

	public void info() {
		 System.out.println("Informações do Hóspede:");
		 System.out.println("Nome: "+ nomeH);
		 System.out.println("Data do Check In: "+ checkIn);
		 System.out.println("Data do Check Out: "+ checkOut);
		 System.out.println("Tipo do Quarto: "+ tipoQrts);
		 System.out.println("Número de Quartos disponíveis: "+ nmQrts);
	}
	
	public String getCheckIn(){
		return checkIn;
	}
	
	public String getCheckOut(){
		return checkOut;
	}
	
	public int getNmQrts(){
		return nmQrts;
	}
	
	public String getNomeH(){
		return nomeH;
	}
	
	public String getTipoQrts(){
		return tipoQrts;
	}
} 
