package com.devsuperior.desafio1;

import com.devsuperior.desafio1.entities.Order;
import com.devsuperior.desafio1.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.devsuperior.desafio1"})
@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {
	@Autowired
	private OrderService orderService;
	public Desafio1Application (OrderService orderService){
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034,800.00,10.0);
		System.out.println("Pedido codigo :"+ order.getCode());
		System.out.println("Valor total :R$"+ orderService.total(order));


	}

}
