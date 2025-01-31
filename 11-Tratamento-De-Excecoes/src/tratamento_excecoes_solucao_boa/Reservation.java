package tratamento_excecoes_solucao_boa;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
		if (!checkOut.after(checkIn)){
			throw new DomainException("Error in reservation: Check-out date must be after check-in date");
		}
		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime(); // devolve a quantidade de milissegundos daquela data
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); // converte os milissegundos para dias
	}
	
	public void updateDates(Date checkIn, Date checkOut) throws DomainException {
		
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {
		    throw new DomainException("Error in reservation: Reservation dates for update must be future dates");
		} 
		if (!checkOut.after(checkIn)){
			throw new DomainException("Error in reservation: Check-out date must be after check-in date");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Room "
				+ roomNumber
				+ ", check-in "
				+ sdf.format(checkIn)
				+ ", check-out "
				+ sdf.format(checkOut)
				+ ", "
				+ duration()
				+ " nights.";
	}
}
