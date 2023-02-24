package hz2;
/**
* @invar | (0 <= getHour()&&  getHour() <= 23)
* @invar | (0 <= getMinutes() && getMinutes() <= 59)
* */
public class TimeOfDay {
		/**

		 * @invar | (0<=minutesSinceMidnight && minutesSinceMidnight<60*24) 
		 */

		private int minutesSinceMidnight;
		
		public int getHour(){
			return minutesSinceMidnight/60;
		}
		public int getMinutes(){
			return minutesSinceMidnight%60;
		}
		
		/**
		 * @throws IllegalArgumentException | (0 > uur || uur > 23)
		 * @mutates | this
		 * @post   | this.getHour() == uur
		 */
		public void setHour(int uur){
			if( 0 > uur || uur > 23) {
				throw new IllegalArgumentException("0<=uur <= 23");}
			this.minutesSinceMidnight = uur*60 + getMinutes();
		}
		/**
		 * @throws IllegalArgumentException |  0 > minuten || minuten > 59
		 * @mutates | this
		 * @post   | this.getMinutes() == minuten
		 */
		public void setMinutes(int minuten){
			if( 0 > minuten || minuten > 59) {
				throw new IllegalArgumentException("0<=minuten <= 59");}
			this.minutesSinceMidnight = getHour()*60 + minuten;
		}
		//constructor
		/**
		 * @throws IllegalArgumentException | 0 > uur || uur > 23
		 * @throws IllegalArgumentException | 0 > minuten || minuten > 59
		 * @post   | this.getHour() == uur && this.getMinutes() == minuten
		 */
		public TimeOfDay(int uur,int minuten){
			if(0 > uur || uur > 23) {
					throw new IllegalArgumentException("0<=uur <= 23");}
			if( 0 > minuten || minuten > 59) {
				throw new IllegalArgumentException("0<=minuten <= 59");}
			this.minutesSinceMidnight = uur*60 +minuten; 
		}
		
}
