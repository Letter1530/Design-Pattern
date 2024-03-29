package nullObjectPattern;

/**
 * 2. 创建扩展了AbstractCustomer的实体类。
 */
public class NullCustomer extends AbstractCustomer {

	@Override
	public boolean isNil() {
		return true;
	}

	@Override
	public String getName() {
		return "Not Available in Customer Database";
	}

}
