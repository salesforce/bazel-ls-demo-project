package module1687_public_tests_more.a;

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
public abstract class Foo1<N> extends module1687_public_tests_more.a.Foo0<N> implements module1687_public_tests_more.a.IFoo1<N> {

	 java.util.zip.Deflater f0 = null;
	 javax.annotation.processing.Completion f1 = null;
	 javax.lang.model.AnnotatedConstruct f2 = null;

	 public N element;

	 public static Foo1 instance;

	 public static Foo1 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module1687_public_tests_more.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module1687_public_tests_more.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module1687_public_tests_more.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public N get() {
	 	 return (N)module1687_public_tests_more.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (N)element;
	 	 module1687_public_tests_more.a.Foo0.getInstance().set(this.element);
	 }

	 public N call() throws Exception {
	 	 return (N)module1687_public_tests_more.a.Foo0.getInstance().call();
	 }
}
