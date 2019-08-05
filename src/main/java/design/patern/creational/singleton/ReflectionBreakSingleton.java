/**
 * @author tien-dung
 *
 */
package design.patern.creational.singleton;

/**
 * Phﾃ｡ v盻｡ c蘯･u trﾃｺc Singleton Pattern b蘯ｱng Reflection Reflection cﾃｳ th盻� ﾄ柁ｰ盻｣c dﾃｹng
 * ﾄ黛ｻ� phﾃ｡ v盻｡ Pattern c盻ｧa Eager Initialization 盻� trﾃｪn. Do ﾄ妥ｳ, khi c蘯ｧn s盻ｭ d盻･ng
 * Eager Initialization chﾃｺng ta nﾃｪn implement theo Bill Pugh Singleton ﾄ黛ｻ� khﾃｴng
 * b盻� break b盻殃 Reflection vﾃ� cﾅｩng ﾄ黛ｺ｡t ﾄ柁ｰ盻｣c hi盻㎡ su蘯･t t盻奏 hﾆ｡n.
 */

public class ReflectionBreakSingleton {

//	public static void main(String[] args)
//			throws InstantiationException, IllegalAccessException, InvocationTargetException {
//
//		EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
//		EagerInitializedSingleton instanceTwo = null;
//
//		Constructor<?>[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
//		for (Constructor<?> constructor : constructors) {
//			constructor.setAccessible(true);
//			instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
//		}
//
//		System.out.println(instanceOne.hashCode());
//		System.out.println(instanceTwo.hashCode());
//	}
}