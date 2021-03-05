package module1895_public_tests_unittests.a;

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
public abstract class Foo3<N> extends module1895_public_tests_unittests.a.Foo2<N> implements module1895_public_tests_unittests.a.IFoo3<N> {

	 java.util.zip.Deflater f0 = null;
	 javax.annotation.processing.Completion f1 = null;
	 javax.lang.model.AnnotatedConstruct f2 = null;

	 public N element;

	 public static Foo3 instance;

	 public static Foo3 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module1895_public_tests_unittests.a.Foo2.create(input);
	 }

	 public String getName() {
	 	 return module1895_public_tests_unittests.a.Foo2.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module1895_public_tests_unittests.a.Foo2.getInstance().setName(getName());
	 	 return;
	 }

	 public N get() {
	 	 return (N)module1895_public_tests_unittests.a.Foo2.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (N)element;
	 	 module1895_public_tests_unittests.a.Foo2.getInstance().set(this.element);
	 }

	 public N call() throws Exception {
	 	 return (N)module1895_public_tests_unittests.a.Foo2.getInstance().call();
	 }
}
