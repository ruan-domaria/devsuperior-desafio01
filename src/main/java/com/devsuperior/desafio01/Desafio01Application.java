package com.devsuperior.desafio01;

import com.devsuperior.desafio01.entities.Order;
import com.devsuperior.desafio01.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Digite o códido do pedido: ");
		int codigoPedido = scanner.nextInt();

		System.out.println("Digite o valor do pedido: ");
		double valorPedido = scanner.nextDouble();

		System.out.println("Digite o desconto do pedido: ");
		double descontoPedido = scanner.nextDouble();

		Order order = new Order(codigoPedido, valorPedido, descontoPedido);
		OrderService orderService = new OrderService();
		System.out.println("Pedido Código: " + codigoPedido);
		System.out.println("Valor Total: " + orderService.total(order));

	}

}
