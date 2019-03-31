package junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInfo;

//Repertの実験

class RepeatTest {

	@RepeatedTest(5)//テストを５回繰り返す
	@DisplayName("repeat1")
	void test1(TestInfo testInfo) {
		//@DisplayNameは取得できず、@RepeatedTest#nameが取得される。
		System.out.println(testInfo.getDisplayName());
	}
	
	@RepeatedTest(value = 5, name = "{displayName} {currentRepetition}/{totalRepetitions}")
	@DisplayName("repeat2")
	void test2(TestInfo testInfo) {
		System.out.println(testInfo.getDisplayName());
	}

}