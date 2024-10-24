package sistemaHotel;

public class Quarto {
		private String tipoQ;
		private int nmQ;
		private float precoQ;
		private boolean disponibilidade = true;
		
		public Quarto(int nmQ, String tipoQ, float precoQ) {
			this.setDisponibilidade(true);
			this.nmQ = nmQ;
			this.precoQ = precoQ;
			this.tipoQ = tipoQ;
		}
		
		public void info() {
			System.out.println("Preencha as informações sobre o quarto!");
			System.out.println("Número do Quarto:"+ nmQ);
			if(disponibilidade) {
				System.out.println("Disponível: Sim");
			}else {
				System.out.println("Disponível: Não");
			}
			System.out.println("Preço diária:"+ precoQ);
			System.out.println("Tipo Quarto:"+ tipoQ);
		}

		public String getTipoQ() {
			return tipoQ;
		}

		public float getPrecoQ() {
			return precoQ;
		}

		public int getNmQ() {
			return nmQ;
		}

		public boolean isDisponibilidade() {
			return disponibilidade;
		}

		public void setDisponibilidade(boolean disponibilidade) {
			this.disponibilidade = disponibilidade;
		}

	}
