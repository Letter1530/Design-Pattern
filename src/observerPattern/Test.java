package observerPattern;

public class Test {

	public static void main(String[] args) {

		NewOffice office = new NewOffice(); // 建立一個新聞社(Subject)

		Reader john = new Reader("John"); // 建立一些讀者
		Reader mary = new Reader("Mary");
		Reader bill = new Reader("Bill");

		// 每個讀者訂閱新聞
		// Observer(Reader)訂閱Subject(NewOffice)
		office.registerObserver(john);
		office.registerObserver(mary); 
		office.registerObserver(bill); 
		
		// 發送新聞
		office.notifyObservers("New One...");
		
		System.out.println("----");
		office.removeObserver(john);
		office.notifyObservers("New Two...");

	}

}
