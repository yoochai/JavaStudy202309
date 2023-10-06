package exam00;
public class Color {
	class Colortype{
		String Colortype;
		String Grayscale;
		String Color;
		int Cost;
		
		
	
		public String getColortype() {
			return Colortype;
		}
	
		public String setColortype(String Colortype) {
			if(Colortype == Color) {
				return Color;
			}else {
				return Grayscale;
			}
		}
		
		public int getCost() {
			return Cost;
		}
	
		public int setCost(String Colortype) {
			if(Colortype == Color) {
				return 5;
			}else {
				return 15;
			}
		}
		
		public void Total(String Colortype, int Cost) {
			this.Colortype = Colortype;
			this.Cost = Cost;
		}
	}
}	