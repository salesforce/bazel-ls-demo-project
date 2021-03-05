package module1177_public_tests_unittests.a;

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
public abstract class Foo3<X> extends module1177_public_tests_unittests.a.Foo2<X> implements module1177_public_tests_unittests.a.IFoo3<X> {

	 java.util.zip.Deflater f0 = null;
	 javax.annotation.processing.Completion f1 = null;
	 javax.lang.model.AnnotatedConstruct f2 = null;

	 public X element;

	 public static Foo3 instance;

	 public static Foo3 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module1177_public_tests_unittests.a.Foo2.create(input);
	 }

	 public String getName() {
	 	 return module1177_public_tests_unittests.a.Foo2.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module1177_public_tests_unittests.a.Foo2.getInstance().setName(getName());
	 	 return;
	 }

	 public X get() {
	 	 return (X)module1177_public_tests_unittests.a.Foo2.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (X)element;
	 	 module1177_public_tests_unittests.a.Foo2.getInstance().set(this.element);
	 }

	 public X call() throws Exception {
	 	 return (X)module1177_public_tests_unittests.a.Foo2.getInstance().call();
	 }
}
