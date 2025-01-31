package enumeracao_composicao;

import java.util.Date;

public class Order {

	private Integer id;
	private Date moment;
	private OrderStatus status;
	

	public Order(Integer id, Date date, OrderStatus status) {
		super();
		this.id = id;
		this.moment = date;
		this.status = status;
	}
	
	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id = " + id + " moment = " + moment + ", status = " + status + "]";
	}
	
	
}
