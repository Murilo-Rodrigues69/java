import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the number of products:");
		int n = sc.nextInt();
		
		List <Product> list = new ArrayList<>();
		
		for (int i = 1; i<= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)?");
			char ch = sc.next().charAt(0);
			System.out.print("Name:");
			String name = sc.next();
			System.out.println("Price: ");
			double price = sc.nextDouble();
			if (ch=='i') {
				System.out.print("Customs fee:");
				double customsFee = sc.nextDouble();
				Product pro = new ImportedProduct(name,price,customsFee);
				pro.setPrice(price);
				list.add(pro);
			}
			else if (ch=='u') {
				System.out.println("Manufacture date (DD/MM/YYYY):");
				sc.nextLine();
				String manufactureDate = sc.nextLine();
				Product pro = new UsedProduct(name,price,manufactureDate);
				list.add(pro);
			}
			else {
				Product pro = new Product(name,price);
				list.add(pro);
			}
		}
			
			System.out.println("PRICE TAGS:");
			
			for(Product pro : list) {
				System.out.println(pro.priceTag());
			}
			
			sc.close();
			
		}
		
	

	}


