@RunWith(Parameterized.class) // Напиши аннотацию для параметризованных тестов
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
      this.age = age;
      this.result = result;
      // Инициализируй поля класса в конструкторе
  }

  // Пометь метод аннотацией для параметров
  @Parameterized.Parameters
  public static Object[][] getTextData() {
	return new Object[][] {
		// Заполни массив тестовыми данными и ожидаемым результатом
        {18, true},
        {19, true},
        {17, false},
        {21, true},
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
	// Передай сюда возраст пользователя
    boolean isAdult = program.checkIsAdult(age);
	// Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
    assertEquals(" ", result, isAdult);
	}
}
