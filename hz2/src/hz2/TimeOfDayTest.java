package hz2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	@Test
	void test() {
		TimeOfDay hetuur = new TimeOfDay(5,3);
		assert hetuur.getHour() == 5;
		assert hetuur.getMinutes()  == 3;
		hetuur.setHour(15);
		hetuur.setMinutes(20);
		assert hetuur.getHour()  == 15;
		assert hetuur.getMinutes()  == 20;
		assertThrows(IllegalArgumentException.class, () -> hetuur.setHour(39));
		assertThrows(IllegalArgumentException.class, () -> hetuur.setHour(-10));
		assertThrows(IllegalArgumentException.class, () -> hetuur.setMinutes(39));
		assertThrows(IllegalArgumentException.class, () -> hetuur.setMinutes(-5));
		assertThrows(IllegalArgumentException.class, () -> new TimeOfDay(5,-5));
		assertThrows(IllegalArgumentException.class, () -> new TimeOfDay(5,25));
		assertThrows(IllegalArgumentException.class, () -> new TimeOfDay(-5,25));
		assertThrows(IllegalArgumentException.class, () -> new TimeOfDay(25,25));
	}

}
