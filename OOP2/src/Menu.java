
public class Menu {

	public static void tambahBuah() {
	    boolean running = true;
	    while (running) {
	        // System.out.print("Nama Buah :");
	        // String inputNama = scanner.next();
	        // System.out.print("Berapa Harga : ");
	        // int inputHarga = scanner.nextInt();
	        // System.out.print("Berapa Stok : ");
	        // int inputStock = scanner.nextInt();
	        // Buah buah = new Buah(buah.getNama(), inputHarga,inputStock);
	        String inputNama = Console.readInputString("Nama buah : ");
	        int inputHarga = (int) Console.readInputNumber("Berapa Harga : ");
	        int inputStock = (int) Console.readInputNumber("Berapa stock : ");
	
	        Buah buah = new Buah(inputNama, inputHarga,inputStock);
	        // new Buah(inputNama, inputHarga,inputStock);
	        App.listBuah.add(buah);
	        System.out.println("Repeat ? (y/n)");
	
	        String option = App.scanner.next();
	        if (option.equalsIgnoreCase("n")){
	            running=false;
	        }
	    }
	}

	public static void tampilListBuah (){
	    System.out.println("== List Buah ==");
	    for (int i =0 ; i< App.listBuah.size(); i++){
	        System.out.println((i+1)+ ". " + App.listBuah.get(i).getNama() + " || " + App.listBuah.get(i).getHarga() + " || " + App.listBuah.get(i).getStock()+" pcs" );
	       }
	}
    
}