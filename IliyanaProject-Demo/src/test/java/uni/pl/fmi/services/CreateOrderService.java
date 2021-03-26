package uni.pl.fmi.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import uni.pl.fmi.Order;

public class CreateOrderService {
	static HashMap<String, String> listOne = new HashMap<String, String>();

	
	public static String createOrder(String bookName, String author) {
		final Order newOrder = new Order(bookName, author);
		List<Order> orders = getOrder();
		
		if(null == bookName || "".equals(bookName)) {
			return "�������� ����� �� �������";
		}
		if(null == author || "".equals(author)) {
			return "�������� ��� �� �����";
		}
		if(listOne.containsKey(bookName) && listOne.get(bookName).contains(author)) {
			return "������� � ���������";
		}
		
		listOne.put(bookName, author);
		orders.add(newOrder);
		return orders.contains(newOrder) ? "������� ��������� � ���������" : "���� ������� ���� �����";
	}


	private static List<Order> getOrder() {
		final List<Order> result = new ArrayList<>();
		final Order order = new Order("Harry Potter", "J. K. Rowling");
		result.add(order);
		return result;
	}

}
