package com.devsuperior.exercicio1;

import com.devsuperior.exercicio1.model.Order;
import com.devsuperior.exercicio1.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Exercicio1Application implements CommandLineRunner {

	@Autowired
	OrderService orderService;

	public static void main(String[] args) {

		SpringApplication.run(Exercicio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.messageOrder();
	}

	private void messageOrder(){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o código do pedido: ");
		Integer code = scanner.nextInt();

		System.out.print("Digite o valor básico: ");
		Double base = scanner.nextDouble();

		System.out.print("Digite o desconto: ");
		Double discount = scanner.nextDouble();

		Order order = new Order(code, base, discount);

		System.out.println("Pedido código: "+ order.getCode());
		System.out.println("Valor total: R$ "+ this.orderService.total(order));

	}
}
