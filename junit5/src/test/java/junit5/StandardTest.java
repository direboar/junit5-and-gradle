package junit5;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//普通の実装

class StandardTests {
    //junit4の@BeforeClassとおなじ
    @BeforeAll
    static void initAll() {
		System.out.println("initAll");
    }

	//junit4の@Beforeとおなじ
    @BeforeEach
    void init() {
		System.out.println("init");
    }

    //junit4の@Testとおなじ
    @Test
    void succeedingTest() {
		System.out.println("succeedingTest");
    }

    @Test
    void failingTest() {
//        fail("a failing test");
    }

    @Test
	//junit4の@Ignorとおなじ
    @Disabled("for demonstration purposes")
    void skippedTest() {
		System.out.println("skippedTest");
    }
	
	//junit4の@Afterとおなじ
    @AfterEach
    void tearDown() {
		System.out.println("tearDown");
    }

    //junit4の@AfterClassとおなじ
    @AfterAll
    static void tearDownAll() {
		System.out.println("tearDownAll");
    }

}