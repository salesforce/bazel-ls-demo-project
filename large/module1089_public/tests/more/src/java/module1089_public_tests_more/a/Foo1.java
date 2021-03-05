package module1089_public_tests_more.a;

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
public abstract class Foo1<H> extends module1089_public_tests_more.a.Foo0<H> implements module1089_public_tests_more.a.IFoo1<H> {

	 java.util.zip.Deflater f0 = null;
	 javax.annotation.processing.Completion f1 = null;
	 javax.lang.model.AnnotatedConstruct f2 = null;

	 public H element;

	 public static Foo1 instance;

	 public static Foo1 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module1089_public_tests_more.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module1089_public_tests_more.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module1089_public_tests_more.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public H get() {
	 	 return (H)module1089_public_tests_more.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (H)element;
	 	 module1089_public_tests_more.a.Foo0.getInstance().set(this.element);
	 }

	 public H call() throws Exception {
	 	 return (H)module1089_public_tests_more.a.Foo0.getInstance().call();
	 }
}
