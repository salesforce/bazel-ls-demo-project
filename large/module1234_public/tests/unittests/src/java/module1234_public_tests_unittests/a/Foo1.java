package module1234_public_tests_unittests.a;

import javax.lang.model.*;
import javax.management.*;
import javax.naming.directory.*;

/**
 * Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut 
 * labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. 
 * Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. 
 *
 * @see java.nio.file.FileStore
 * @see java.sql.Array
 * @see java.util.logging.Filter
 */
@SuppressWarnings("all")
public abstract class Foo1<V> extends module1234_public_tests_unittests.a.Foo0<V> implements module1234_public_tests_unittests.a.IFoo1<V> {

	 java.util.zip.Deflater f0 = null;
	 javax.annotation.processing.Completion f1 = null;
	 javax.lang.model.AnnotatedConstruct f2 = null;

	 public V element;

	 public static Foo1 instance;

	 public static Foo1 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module1234_public_tests_unittests.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module1234_public_tests_unittests.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module1234_public_tests_unittests.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public V get() {
	 	 return (V)module1234_public_tests_unittests.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (V)element;
	 	 module1234_public_tests_unittests.a.Foo0.getInstance().set(this.element);
	 }

	 public V call() throws Exception {
	 	 return (V)module1234_public_tests_unittests.a.Foo0.getInstance().call();
	 }
}
