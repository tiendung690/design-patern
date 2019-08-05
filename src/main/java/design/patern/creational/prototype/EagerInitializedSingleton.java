/**
 * Eager initialization 
 * Singleton Class được khởi tạo ngay khi được gọi đến. Đây là cách dễ nhất nhưng nó 
 * có một nhược điểm mặc dù instance đã được khởi tạo mà có thể sẽ không dùng tới.
 */
/**
 * @author tien-dung
 *
 */
package design.patern.creational.prototype;

public class EagerInitializedSingleton {

	private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();

	// Private constructor to avoid client applications to use constructor
	private EagerInitializedSingleton() {

	}

	public static EagerInitializedSingleton getInstance() {
		return INSTANCE;
	}
}