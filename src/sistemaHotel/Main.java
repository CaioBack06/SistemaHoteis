package sistemaHotel;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nde Gerenciamento de Hotel");
            System.out.println("1-Cadastrar Quarto");
            System.out.println("2-Cadastrar Reserva");
            System.out.println("3-Registrar Check-in");
            System.out.println("4-Registrar Check-out");
            System.out.println("5-Quartos Ocupados");
            System.out.println("6-Reservas Realizadas");
            System.out.println("0-Sair");
            System.out.print("Escolha uma opção acima: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Número do Quarto: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Tipo de Quarto(Solteiro ou Casal ou Família): ");
                    String tipo = scanner.nextLine();
                    System.out.print("Preço Diário: ");
                    float preco = scanner.nextFloat();
                    hotel.registrarQuarto(numero, tipo, preco);
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("Nome do Hóspede: ");
                    String nomeHospede = scanner.nextLine();
                    System.out.print("Data de Entrada (yyyy-mm-dd): ");
                    String dataCheckin = scanner.next();
                    System.out.print("Data de Saída (yyyy-mm-dd): ");
                    String dataCheckout = scanner.next();
                    System.out.print("Número de Quartos: ");
                    int numQuartos = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Tipo de Quarto: ");
                    String tipoQuarto = scanner.nextLine();
                    hotel.registrarReserva(nomeHospede, dataCheckin, numQuartos, dataCheckout, tipoQuarto);
                    break;
                case 3:
                    System.out.print("Número do Quarto para Check-in: ");
                    int numCheckin = scanner.nextInt();
                    hotel.registrarCheckIn(numCheckin);
                    break;
                case 4:
                    System.out.print("Número do Quarto para Check-out: ");
                    int numCheckout = scanner.nextInt();
                    hotel.registrarCheckOut(numCheckout);
                    break;
                case 5:
                    hotel.quartosOcupados();
                    break;
                case 6:
                    hotel.gerarHistoricoReservas();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}