package junit5;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

//assertjを試しに使ってみる（gradleの設定）
class AssertJTest {

    @Test
    void succeedingTest() {
		assertThat("hoge").isEqualTo("hoge");
    }


}