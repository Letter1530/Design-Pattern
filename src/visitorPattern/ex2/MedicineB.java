package visitorPattern.ex2;

//具体元素：
public class MedicineB extends Medicine {

	public MedicineB(String name, double price) {
		super(name, price);
	}

	public void accept(Visitor visitor) {
		visitor.visitor(this);
	}

}
