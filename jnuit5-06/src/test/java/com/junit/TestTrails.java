package com.junit;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTrails {

	@Test
	void test() {
		assertEquals(6,6,"Not match");
	}
	@Test
	void Array() {
		int[] actual= {1,2,3,4,5};
		int[] expected= {1,2,3,4,5};
		assertArrayEquals(actual,expected);
	}
}
