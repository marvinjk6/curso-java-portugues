package tratamento_excecoes_solucao_ruim;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Room Number: ");
		int number = sc.nextInt();
		System.out.println("Check-in date (DD/MM/YYYY): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("Check-out date (DD/MM/YYYY): ");
		Date checkOut = sdf.parse(sc.next());
		
		if(!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		} else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.println("Check-in date (DD/MM/YYYY): ");
			checkIn = sdf.parse(sc.next());
			System.out.println("Check-out date (DD/MM/YYYY): ");
			checkOut = sdf.parse(sc.next());
			
			String error = reservation.updateDates(checkIn, checkOut);
			if(error != null) {
				System.out.println(error);
			}
			else {
				System.out.println("Updated Reservation: " + reservation);
			}
			
		}
		
		sc.close();
	}

}
