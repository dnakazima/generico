package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		String path = "C:\\javatexto\\in.txt"; //valores  5 10 7 14 8 depois csv

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}

			Product x = CalculationService.max(list);//encontra o maior elemento da lista
			System.out.println("Mais caro:");
			System.out.println(x);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
