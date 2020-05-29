public class Menu {

	public static void MenuUtama(){
	    // Cicilan cicil2 = new Cicilan();
	    while (true) {
	        App.cicil2.setHargaAwal((int) View.readInputNumber("Harga Awal : "));
	        if (App.cicil2.getHargaAwal()>= 1_000_000 && App.cicil2.getHargaAwal() <= 100_000_000){
	            break;
	        }
	    }
	    while (true) {
	        App.cicil2.setDurasiCicilan((int) View.readInputNumber("Durasi Cicilan : "));
	        if (App.cicil2.getDurasiCicilan() >= 1) {
	            break;
	        }
	    }
	    while (true) {
	        App.cicil2.setBunga((int) View.readInputNumber("Bunga : "));
	        if (App.cicil2.getBunga() >= 0) {
	            break;
	        }
	    }
	}
    
}