import org.junit.jupiter.api.*;

public class JUnitCycleTest {

    @BeforeAll //전체 테스트를 시작하기 전에 처음으로 한 번만 실행.
    static void beforeAll() { //한 번만 호출되어야하기 때문에 static 선언.
        System.out.println("@BeforeAll");
    }

    @BeforeEach //테스트 케이스를 시작하기 전에 매번 실행.
    public void beforeEach() {
        System.out.println("@BeforeEach");
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @Test
    public void test3() {
        System.out.println("test3");
    }

    @AfterAll //전체 테스트를 마치고 종료하기 전에 한 번만 실행
    static void afterAll(){ //한 번만 호출되어야 하므로 static 선언
        System.out.println("@AfterAll");
    }

    @AfterEach // 각 테스트 케이스를 종료하기 전 매번 실행.
    public void afterEach(){
        System.out.println("@AfterEach");
    }
}

