package sistemaHotel;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
	private List<Quarto> listaQuartos;
	private List<Reserva> listaReservas;

	public Hotel() {
		this.listaQuartos = new ArrayList<>();
		this.listaReservas = new ArrayList<>();
	}
	
	public void registrarQuarto(int nmQ, String tipoQ, float preco) {
		Quarto quarto = new Quarto(nmQ, tipoQ, preco);
		listaQuartos.add(quarto);
		 System.out.println("Quarto número: " + nmQ + " cadastrado com sucesso.");
	     System.out.println("Tipo: " + tipoQ+ ", Preço Diário: " + preco);
	}
	
	public void registrarReserva(String checkIn, String checkOut, int nmQrts, String nomeH, String tipoQrts) {
		Reserva reserva = new Reserva(checkIn, checkOut, nmQrts, nomeH, tipoQrts);
		listaReservas.add(reserva);
		 System.out.println("Reserva concluída!");
		aDisponibilidade(tipoQrts, false);
	}
	
	public void registrarCheckIn(int nm) {
		for(int i = 0; i < listaQuartos.size(); i++) {
			Quarto quarto = listaQuartos.get(i);
			if (quarto.getNmQ() == nm && quarto.isDisponibilidade()) {
                quarto.setDisponibilidade(false);
                System.out.println("Check-in realizado!" + nm);
                System.out.println("Quarto n°: " + nm);
                return;
            }
		}
        System.out.println("Quarto não encontrado.");
	}
	
	public void registrarCheckOut(int nm) {
		for(int i = 0; i < listaQuartos.size(); i++) {
			Quarto quarto = listaQuartos.get(i);
			if (quarto.getNmQ() == nm && !quarto.isDisponibilidade()) {
                quarto.setDisponibilidade(true);
                System.out.println("Check-out realizado!" + nm);
                System.out.println("Quarto n°: " + nm);
                return;
            }
		}
		System.out.println("Quarto não encontrado.");
	}
	
	public void aDisponibilidade(String tipoQ, boolean disponibilidade) {
		for(int i = 0; i < listaQuartos.size(); i++) {
			Quarto quarto = listaQuartos.get(i);
			if (quarto.getTipoQ().equals(tipoQ))  {
                quarto.setDisponibilidade(disponibilidade);
                break;
            }
		}
	}
	
	public void quartosOcupados() {
		 System.out.println("Quartos ocupados");
		 for(int i = 0; i < listaQuartos.size(); i++) {
			 Quarto quarto = listaQuartos.get(i);
			 System.out.println("Quarto " + ((Quarto) listaQuartos).getNmQ() + " - Tipo: " + ((Quarto) listaQuartos).getTipoQ());
			 if(quarto.isDisponibilidade()) {
				 System.out.println("Sim");
			 }else {
				 System.out.println("Não");
			 }
	     }
	}
	
	  public void gerarHistoricoReservas() {
	        System.out.println("Histórico de Reservas:");
	        for (Reserva reserva : listaReservas) {
	            Reserva reservar = new Reserva(null, null, 0, null, null);
				reservar.info();
	            System.out.println("-----------------------------");
	        }
	    }
}
