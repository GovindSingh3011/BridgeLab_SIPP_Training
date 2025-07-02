class Order{
	int orderId;
	String orderDate;
}

class ShippedOrder extends Order{
	long trackingNumber;
}

class DeliveredOrder extends ShippedOrder{
	String deliveryDate ;
	void getOrderStatus(){
		System.out.println("Order ID. "+orderId+"\tOrder Date "+orderDate);
		System.out.println("Tracking Number "+trackingNumber+"\tDelivery Date "+deliveryDate);
	}
}

public class Online_Retail_Order_Management {
	public static void main(String[] agrs) {
		DeliveredOrder delivered=new DeliveredOrder();
		
		delivered.getOrderStatus();
	}
}
