
package oprators;

import java.util.Scanner;

// Write a program related to restaurant order management.
public class operator_statements_Resturent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn = "";
double total_price=0;
		do {
			System.out.println("Enter category like veg/non-veg/starters/drinks:");
			String catg = sc.next();

			switch (catg) {

			case "veg" -> {
				String vyn = "";
				double veg_total_price = 0;

				do {
					System.out.println("Enter the Item:");
					String veg_item = sc.next();

					switch (veg_item) {

					case "pbm" -> {
						System.out.println("PBM Paneer Butter Masala - price is: 250/- Rs");
						double pbm_price = 250;
						veg_total_price += pbm_price;
					}

					case "pbc" -> {
						System.out.println("PBC Paneer Butter Curry - price is: 220/- Rs");
						double pbc_price = 220;
						veg_total_price += pbc_price;
					}

					case "mtr" -> {
						System.out.println("MTR Mixed Vegetable Curry - price is: 180/- Rs");
						double mtr_price = 180;
						veg_total_price += mtr_price;
					}

					case "dal" -> {
						System.out.println("DAL Dal Fry - price is: 150/- Rs");
						double dal_price = 150;
						veg_total_price += dal_price;
					}

					case "palak" -> {
						System.out.println("PALAK Palak Paneer - price is: 200/- Rs");
						double palak_price = 200;
						veg_total_price += palak_price;
					}

					case "chana" -> {
						System.out.println("CHANA Chana Masala - price is: 170/- Rs");
						double chana_price = 170;
						veg_total_price += chana_price;
					}

					case "kadai" -> {
						System.out.println("KADAI Kadai Paneer - price is: 230/- Rs");
						double kadai_price = 230;
						veg_total_price += kadai_price;
					}

					case "aloo" -> {
						System.out.println("ALOO Aloo Gobi Curry - price is: 160/- Rs");
						double aloo_price = 160;
						veg_total_price += aloo_price;
					}

					case "mushroom" -> {
						System.out.println("MUSHROOM Mushroom Masala - price is: 210/- Rs");
						double mushroom_price = 210;
						veg_total_price += mushroom_price;
					}

					case "vegkorma" -> {
						System.out.println("VEGKORMA Vegetable Korma - price is: 190/- Rs");
						double vegkorma_price = 190;
						veg_total_price += vegkorma_price;
					}

					default -> System.out.println("Entered item is not available");
					}

					System.out.println("Do you want to continue with veg items? Click Y for Yes, N for No.");
					vyn = sc.next();

				} while (vyn.equalsIgnoreCase("y"));

				
				System.out.println("Veg total price is: " + veg_total_price + "/- Rs");
				total_price+= veg_total_price;
			}

			case "non-veg" -> {
				String nyn = "";
				double non_veg_total_price = 0;
				do {
				System.out.println("Enter the Item:");
				String non_veg_item = sc.next();
				switch (non_veg_item)

				{
				case "mdb" -> {
					System.out.println("Mutton dum biryani- price is: 500/- Rs");
					double mdb_price = 500;
					non_veg_total_price += mdb_price;
				}

				case "chb" -> {
					System.out.println("Chicken Biryani - price is: 250/- Rs");
					double chb_price = 250;
					non_veg_total_price += chb_price;
				}

				case "mcb" -> {
					System.out.println("Mutton Curry - price is: 350/- Rs");
					double mcb_price = 350;
					non_veg_total_price += mcb_price;
				}

				case "ccb" -> {
					System.out.println("Chicken Curry - price is: 280/- Rs");
					double ccb_price = 280;
					non_veg_total_price += ccb_price;
				}

				case "ch65" -> {
					System.out.println("Chicken 65 - price is: 220/- Rs");
					double ch65_price = 220;
					non_veg_total_price += ch65_price;
				}

				case "tikka" -> {
					System.out.println("Chicken Tikka - price is: 300/- Rs");
					double tikka_price = 300;
					non_veg_total_price += tikka_price;
				}

				case "fishfry" -> {
					System.out.println("Fish Fry - price is: 250/- Rs");
					double fishfry_price = 250;
					non_veg_total_price += fishfry_price;
				}

				case "prawns" -> {
					System.out.println("Prawns Curry - price is: 400/- Rs");
					double prawns_price = 400;
					non_veg_total_price += prawns_price;
				}

				case "eggb" -> {
					System.out.println("Egg Biryani - price is: 180/- Rs");
					double eggb_price = 180;
					non_veg_total_price += eggb_price;
				}

				case "grill" -> {
					System.out.println("Grilled Chicken - price is: 450/- Rs");
					double grill_price = 450;
					non_veg_total_price += grill_price;
				}
				default -> System.out.println("Enter item is available:");
				}
				System.out.println("Do you want to continue with non_veg_items....?Click Y for Yes, N for No.");
				nyn = sc.next();
			}
				while(nyn.equalsIgnoreCase("y"));
				System.out.println("non_veg Total_price is:"+non_veg_total_price);
				total_price+=non_veg_total_price;
			}

			default -> System.out.println("Entered category is not available!!");
			}

			System.out.println("Do you want to continue with categories? Click Y for Yes, N for No.");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));
System.out.println("Total price:"+total_price);
	}
}
