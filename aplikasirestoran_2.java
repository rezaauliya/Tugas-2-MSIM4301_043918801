package aplikasirestoran_2;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

class menu {
	
	String nama;
	double harga;
	String kategori;
	
	public menu(String nama, double harga, String kategori) {
		
		this.nama = nama;
		this.harga = harga;
		this.kategori = kategori;
		
		}

	public static ArrayList<menu> getmenuList() {
		ArrayList<menu>daftarmenu = new ArrayList<>();
		
		daftarmenu.add(new menu("Nasi Goreng	", 20000, "Makanan"));
		daftarmenu.add(new menu("Nasi Padang	", 25000, "Makanan"));
		daftarmenu.add(new menu("Nasi Uduk	", 15000, "Makanan"));
		daftarmenu.add(new menu("Nasi Bakar	", 23000, "Makanan"));
		daftarmenu.add(new menu("Nasi Rames	", 17000, "Makanan"));
		
		daftarmenu.add(new menu("Es Teh Manis	", 10000, "Minuman"));
		daftarmenu.add(new menu("Es Teh Lemon	", 12000, "Minuman"));
		daftarmenu.add(new menu("Es Jeruk	", 12000, "Minuman"));
		daftarmenu.add(new menu("Es Cappucinno", 18000, "Minuman"));
		daftarmenu.add(new menu("Air Mineral	", 6000, "Minuman"));

		return daftarmenu;
	}
}

public class aplikasirestoran_2 {
	
	private static ArrayList<menu> inimenu = menu.getmenuList();

	public static void main(String[] args) {
		DecimalFormat kursIndonesia = (DecimalFormat)
				DecimalFormat.getCurrencyInstance();
				DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
		
		formatRp.setCurrencySymbol("Rp. ");
		
			formatRp.setMonetaryDecimalSeparator(',');
				formatRp.setGroupingSeparator('.');
				kursIndonesia.setDecimalFormatSymbols(formatRp);
		
		Scanner input = new Scanner(System.in);
		double totalbiaya = 0;
		double diskon = 0;
		boolean freeMinuman = false;
		boolean kelolamenu = false;
		double hargaBaru = 0;
		double x = 0.1;
		ArrayList<String> daftarpesanan = new ArrayList<>();
		ArrayList<Integer> qtypesanan = new ArrayList<>();
		
		
		while (true) {
			if (kelolamenu) {
				System.out.println("Pengelolaan Data Menu Makanan/Minuman");
				System.out.println("[1] Tambah menu makanan/minuman baru");
				System.out.println("[2] Ubah harga makanan/minuman");
				System.out.println("[3] Hapus menu makanan/minuman");
				System.out.println("[4] Melihat daftar menu");
				System.out.println("[0] Kembali ke Menu Utama");
				System.out.println();
				System.out.print("Masukkan kode menu kelola data yang Anda inginkan (0-4) : ");
				String pilihankelola = input.nextLine();
				
				switch (pilihankelola) {
				case "1" :
					System.out.println("========== Menu Makanan ==========");
					for (int i=0; i<inimenu.size(); i++) {
						menu menuu = inimenu.get(i);
						if (menuu.kategori.equals("Makanan")) {
							System.out.println((i+1) +". " +menuu.nama +" : " +kursIndonesia.format(menuu.harga));					
						}
					}
					System.out.println();
					System.out.println("========== Menu Minuman ==========");
					for (int i=0; i<inimenu.size(); i++) {
						menu menuu = inimenu.get(i);
						if (menuu.kategori.equals("Minuman")) {
							System.out.println((i+1) +". " +menuu.nama +" : " +kursIndonesia.format(menuu.harga));					
						}
					}
					System.out.println();
					System.out.print("Nama menu makanan/minuman baru : ");
					String namaBaru = input.nextLine();
					System.out.print("Harga menu makanan/minuman Baru : ");
					hargaBaru = Double.parseDouble(input.nextLine());
					System.out.print("Kategori menu baru (makanan/minuman) : ");
					String kategoriBaru = input.nextLine();
					menu menuBaru = new menu(namaBaru, hargaBaru, kategoriBaru);
					
					inimenu.add(menuBaru);
					System.out.println();
					System.out.println("Menu baru berhasil ditambahkan!");
					System.out.println();
					break;
				
				case "2" :
					System.out.println("========== Menu Makanan ==========");
					for (int i=0; i<inimenu.size(); i++) {
						menu menuu = inimenu.get(i);
						if (menuu.kategori.equals("Makanan")) {
							System.out.println((i+1) +". " +menuu.nama +" : " +kursIndonesia.format(menuu.harga));					
						}
					}
					System.out.println();
					System.out.println("========== Menu Minuman ==========");
					for (int i=0; i<inimenu.size(); i++) {
						menu menuu = inimenu.get(i);
						if (menuu.kategori.equals("Minuman")) {
							System.out.println((i+1) +". " +menuu.nama +" : " +kursIndonesia.format(menuu.harga));					
						}
					}
					System.out.println();
					System.out.print("Masukkan kode menu yang ingin diubah harganya : ");
					int menuIdx = Integer.parseInt(input.nextLine())-1;
					
					if(menuIdx>=0 && menuIdx<inimenu.size()) {
						System.out.print("Harga baru : ");
						hargaBaru = Double.parseDouble(input.nextLine());
						inimenu.get(menuIdx).harga = hargaBaru;
						System.out.println();
						System.out.println("Harga menu berhasil diubah!");
						System.out.println();
					} else {
						System.out.println("Kode menu tidak sesuai!");
					}
					break;
				
				case "3" :
					System.out.println("========== Menu Makanan ==========");
					for (int i=0; i<inimenu.size(); i++) {
						menu menuu = inimenu.get(i);
						if (menuu.kategori.equals("Makanan")) {
							System.out.println((i+1) +". " +menuu.nama +" : " +kursIndonesia.format(menuu.harga));					
						}
					}
					System.out.println();
					System.out.println("========== Menu Minuman ==========");
					for (int i=0; i<inimenu.size(); i++) {
						menu menuu = inimenu.get(i);
						if (menuu.kategori.equals("Minuman")) {
							System.out.println((i+1) +". " +menuu.nama +" : " +kursIndonesia.format(menuu.harga));					
						}
					}
					System.out.println();
					System.out.println("Daftar menu makanan/minuman : ");
					for (int i=0; i<inimenu.size(); i++) {
						System.out.println((i+1) +". " +inimenu.get(i).nama);
					}
					System.out.println();
					System.out.print("Masukkan kode menu yang ingin dihapus : ");
					int hapusIdx = Integer.parseInt(input.nextLine())-1;
					
					if(hapusIdx>=0 && hapusIdx<inimenu.size()) {
						System.out.print("Apakah Anda yakin ingin menghapus menu ini? (y/t) : ");
						String konfirmasi = input.nextLine().toLowerCase();
						switch (konfirmasi) {
						case "y" :
							inimenu.remove(hapusIdx);
							System.out.println();
							System.out.println("Menu berhasil dihapus!");
							System.out.println();
							break;
						case "t" :
							break;
						}
					} else {
						System.out.println("Kode menu tidak sesuai!");
					}
					break;
					
				case "4" :
					System.out.println("========== Menu Makanan ==========");
					for (int i=0; i<inimenu.size(); i++) {
						menu menuu = inimenu.get(i);
						if (menuu.kategori.equals("Makanan")) {
							System.out.println((i+1) +". " +menuu.nama +" : " +kursIndonesia.format(menuu.harga));					
						}
					}
					System.out.println();
					System.out.println("========== Menu Minuman ==========");
					for (int i=0; i<inimenu.size(); i++) {
						menu menuu = inimenu.get(i);
						if (menuu.kategori.equals("Minuman")) {
							System.out.println((i+1) +". " +menuu.nama +" : " +kursIndonesia.format(menuu.harga));					
						}
					} System.out.println();
				break;
				
			case "0" :
				kelolamenu=false;
				break;
					
			default :
				System.out.println("Kode menu yang Anda pilih salah!");
				break;
				}
				
			} else {
		System.out.println("================= Menu Utama =================");
		System.out.println("[1] Pesan Makanan/Minuman");
		System.out.println("[2] Kelola Data Menu Makanan/Minuman");
		System.out.println("[0] Keluar Aplikasi");
		System.out.println();
		System.out.print("Pilihlah kode menu yang Anda inginkan (0-2) : ");
		String menuutama = input.nextLine();

		switch (menuutama) {
		case "1" :
			System.out.println();
			System.out.println("========== Menu Makanan ==========");
			for (int i=0; i<inimenu.size(); i++) {
				menu menuu = inimenu.get(i);
				if (menuu.kategori.equals("Makanan")) {
					System.out.println((i+1) +". " +menuu.nama +" : " +kursIndonesia.format(menuu.harga));					
				}
			}
			System.out.println();
			System.out.println("========== Menu Minuman ==========");
			for (int i=0; i<inimenu.size(); i++) {
				menu menuu = inimenu.get(i);
				if (menuu.kategori.equals("Minuman")) {
					System.out.println((i+1) +". " +menuu.nama +" : " +kursIndonesia.format(menuu.harga));					
				}
			} 
			while (true) {
				System.out.println();
				System.out.println("Ketik 'x' untuk membatalkan semua pesanan dan keluar aplikasi");
				System.out.println("Ketik 'selesai' untuk menampilkan struk");
				System.out.println();
				System.out.print("Masukkan kode menu yang ingin dipesan : ");
				String pesanan = input.nextLine();
				
				switch (pesanan) {
				case "x" :
					System.out.println("Anda telah membatalkan semua pesanan dan keluar aplikasi!");
					System.out.println("Terima kasih atas kunjungan Anda...");
					return;
				} 
				
				if (pesanan.equalsIgnoreCase("selesai")) {
					struk(daftarpesanan, qtypesanan, totalbiaya, diskon);
					break;
				} else if (pesanan.equalsIgnoreCase("kelola")) {
					kelolamenu = true;
					break;
				} else {
					try {
						int menuIdx = Integer.parseInt(pesanan)-1;
						if (menuIdx >= 0 && menuIdx < inimenu.size()) {
							menu menudipilih = inimenu.get(menuIdx);
							System.out.print("Jumlah : ");
							int jum = Integer.parseInt(input.nextLine());
						
							System.out.println();
							System.out.println("Pesanan Anda berhasil ditambahkan!");
							System.out.println(menudipilih.nama + "= " + jum);
						
							totalbiaya += menudipilih.harga*jum;
							
							if (totalbiaya > 100000) {
								diskon = totalbiaya*x;
							}
							if (totalbiaya > 50000 && !freeMinuman&& menudipilih.kategori.equals("Minuman")) {
							
							freeMinuman = true;
							System.out.println("Selamat Anda mendapatkan promo gratis 1 Es Teh");
						}
						
						daftarpesanan.add(menudipilih.nama);
						qtypesanan.add(jum);
						} else {
							System.out.println("Kode menu yang Anda masukkan salah!");
						} 
					} catch (NumberFormatException e) {
						System.out.println("Kode menu yang Anda masukkan salah!");
					}
				}
			} break;
		
			
		case "2" :
			kelolamenu = true;
			break;

		case "0" :
			System.out.println("Anda telah keluar aplikasi...");
			return;
			
		default :
			System.out.println();
			System.out.println("Kode menu yang Anda masukkan salah!");
			break;
				}
		}
	}

}
		

public static void struk (ArrayList<String> item, ArrayList<Integer> qty, double totalbiaya, double diskon) {
	
			double x=0.1;
			double biayapelayanan = 20000;
			
			DecimalFormat kursIndonesia = (DecimalFormat)
					DecimalFormat.getCurrencyInstance();
				DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
	
				formatRp.setCurrencySymbol("Rp. ");
	
				formatRp.setMonetaryDecimalSeparator(',');
				formatRp.setGroupingSeparator('.');
				kursIndonesia.setDecimalFormatSymbols(formatRp);
			
			System.out.println();
			System.out.println("===================== STRUK PESANAN ANDA =====================");
			System.out.println();
			
			for (int i=0; i<item.size(); i++) {
				String itemm = item.get(i);
				int jum = qty.get(i);
				double harga = 0;
				
				for (menu menuu : inimenu) {
					if (menuu.nama.equals(itemm)) {
						harga = menuu.harga;
						break;
					}
				}
				
				double totalItem = harga*jum;
				System.out.println(itemm + "     " +kursIndonesia.format(harga) +" X " +jum +"   =   " +kursIndonesia.format(totalItem));
				
			}
			
			if (totalbiaya > 100000) {
				System.out.println();
				System.out.println("Total bayar awal : " +kursIndonesia.format(totalbiaya));
				
				diskon = totalbiaya*x;
				double total_akhirstlhdiskon = totalbiaya-diskon;
				System.out.println();
				System.out.println("Selamat! Anda mendapatkan diskon 10%");
				System.out.println("Total diskon 10% = "+kursIndonesia.format(diskon));
				System.out.println("Total bayar setelah mendapatkan diskon : "+kursIndonesia.format(total_akhirstlhdiskon));
				
				System.out.println();
				double pajak = totalbiaya*x;
				System.out.println("Berlaku pajak 10%");
				System.out.println("Total biaya pajak : "+kursIndonesia.format(pajak));
				
				System.out.println();
				System.out.println("Berlaku biaya pelayanan : "+kursIndonesia.format(biayapelayanan));
				
				double totalakhir2 = total_akhirstlhdiskon+pajak+biayapelayanan;
				System.out.println();
				System.out.println("Total bayar akhir = "+kursIndonesia.format(totalakhir2));
				System.out.println();
			} else {
					System.out.println();
					System.out.println("Total bayar awal : " +kursIndonesia.format(totalbiaya));
					
					double pajak = totalbiaya*x;
					System.out.println();
					System.out.println("Berlaku pajak 10%");
					System.out.println("Total biaya pajak : "+kursIndonesia.format(pajak));
					
					System.out.println();
					System.out.println("Berlaku biaya pelayanan : "+kursIndonesia.format(biayapelayanan));
					
					double totalakhir1 = totalbiaya+pajak+biayapelayanan;
					System.out.println();
					System.out.println("Total bayar akhir = "+kursIndonesia.format(totalakhir1));
					System.out.println();
				}
			 System.out.println("Terima kasih atas kunjungan Anda...");
			 System.out.println();
			 System.out.println("Masukkan kode menu '1' jika ingin menambah pesanan");
			 System.out.println();
	}

}




