package junit5;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import static org.assertj.core.api.Assertions.*;
import java.util.stream.*;

//@ParameterizedTestの実験。

public class ParameterTest{
	@ParameterizedTest
	//文字列配列を指定して、各値を入力としてテストする
	@ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
	void palindromes(String candidate) throws Exception {
		System.out.println(Thread.currentThread().getContextClassLoader().getResource("two-column.csv"));
		System.out.println(candidate);
		assertThat(candidate).isNotNull();
	}
	
	@ParameterizedTest
	//テストデータを提供するメソッド名を指定する。 //他にもEnumを指定したりいろいろバリエーションがある。
	@MethodSource("stringProvider")
	void testWithSimpleMethodSource(String argument) {
		System.out.println(argument);
		assertThat(argument).isNotNull();
	}

	static Stream<String> stringProvider() {
		return Stream.of("foo", "bar");
	}

	@ParameterizedTest
	@CsvFileSource(resources = "/two-column.csv", numLinesToSkip = 1)// /がいるのに注意。
	void testWithCsvFileSource(String first, int second) {
		System.out.println(first);
		System.out.println(second);
		assertThat(second).isNotNull().isNotEqualTo(0);
	}	
}


