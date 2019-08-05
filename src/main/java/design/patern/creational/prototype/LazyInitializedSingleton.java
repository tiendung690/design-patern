/**
 * @author tien-dung
 *
 */
package design.patern.creational.prototype;

/**
 * Lazy Initialization Là một cách làm mang tính mở rộng hơn so với 2 cách làm
 * trên và hoạt động tốt trong môi trường đơn luồng (single-thread). Cách này
 * đã khắc phục được nhược điểm của cách Eager initialization, chỉ khi
 * nào getInstance() được gọi thì instance mới được khởi tạo. Tuy nhiên,
 * cách này chỉ sử dụng tốt trong trường hợp đơn luồng (single-thread),
 * trường hợp nếu có nhiều luồng (multi-thread) cùng chạy và cùng gọi
 * hàm getInstance() tại cùng một thời điểm thì có thể có nhiều hơn 1
 * thể hiện của instance. Để khắc phục nhược điểm này chúng ta sử dụng Thread
 * Safe Singleton.Một nhược điểm nữa của Lazy Initialization cần quan tâm là:
 * đối với thao tác create instance quá chậm thì người dùng có phải chờ lâu cho
 * lần sử dụng đầu tiên.
 */

public class LazyInitializedSingleton {

	private static LazyInitializedSingleton instance;

	private LazyInitializedSingleton() {
	}

	public static LazyInitializedSingleton getInstance() {
		if (instance == null) {
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}
}