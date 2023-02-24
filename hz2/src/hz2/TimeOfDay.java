package hz2;

public class TimeOfDay {
		/**
		 * @invar | (0 <= uur && uur <= 23)
		 * @invar | (0 <= minuten && minuten <= 23)
		 */
		private int uur;
		private int minuten;
		
		int getHour(){
			return uur;
		}
		int getMinutes(){
			return minuten;
		}
		
		/**
		 * @throws | !(0 <= uur && uur <= 23)
		 * @post   | this.getHour() == uur
		 */
		void setHour(int uur){
			if(!(0 <= uur && uur <= 23)) {
				throw new IllegalArgumentException("0<=uur <= 23");}
			this.uur = uur;
		}
		/**
		 * @throws | !(0 <= minuten && minuten <= 23)
		 * @post   | this.getMinutes() == minuten
		 */
		void setMinutes(int minuten){
			if(!(0 <= minuten && minuten <= 23)) {
				throw new IllegalArgumentException("0<=minuten <= 23");}
			this.minuten = minuten;
		}
		//constructor
		/**
		 * @throws | !(0 <= uur && uur <= 23)
		 * @throws | !(0 <= minuten && minuten <= 23)
		 * @post   | this.getHour() == uur && this.getMinutes() == minuten
		 */
		TimeOfDay(int uur,int minuten){
			if(!(0 <= uur && uur <= 23)) {
					throw new IllegalArgumentException("0<=uur <= 23");}
			if(!(0 <= minuten && minuten <= 23)) {
				throw new IllegalArgumentException("0<=minuten <= 23");}
			this.uur = uur;
			this.minuten = minuten;
		}
		
}
