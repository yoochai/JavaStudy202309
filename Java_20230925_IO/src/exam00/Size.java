package exam00;

public class Size {
	class Colortype{
		String A4;
		String A5;
		String Letter;
		String Legal;
		int Cost;
		
		public void Total(String Size, int Cost) {
			this.Size = Size;
			this.Cost = Cost;
		}
	
		public String getSize() {
			return Size;
		}
	
		public void setSize(String Size) {
			this.Size = Size;
		}
		
		public int getCost() {
			return Cost;
		}
	
		public void setCost(int Cost) {
			this.Cost = Cost;
		}
		
	}
}
