package module1672_public_tests_more.a;

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
public abstract class Foo3<R> extends module1672_public_tests_more.a.Foo2<R> implements module1672_public_tests_more.a.IFoo3<R> {

	 java.util.zip.Deflater f0 = null;
	 javax.annotation.processing.Completion f1 = null;
	 javax.lang.model.AnnotatedConstruct f2 = null;

	 public R element;

	 public static Foo3 instance;

	 public static Foo3 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module1672_public_tests_more.a.Foo2.create(input);
	 }

	 public String getName() {
	 	 return module1672_public_tests_more.a.Foo2.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module1672_public_tests_more.a.Foo2.getInstance().setName(getName());
	 	 return;
	 }

	 public R get() {
	 	 return (R)module1672_public_tests_more.a.Foo2.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (R)element;
	 	 module1672_public_tests_more.a.Foo2.getInstance().set(this.element);
	 }

	 public R call() throws Exception {
	 	 return (R)module1672_public_tests_more.a.Foo2.getInstance().call();
	 }
}
