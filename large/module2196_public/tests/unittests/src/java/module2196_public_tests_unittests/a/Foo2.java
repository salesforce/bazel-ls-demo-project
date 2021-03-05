package module2196_public_tests_unittests.a;

import javax.annotation.processing.*;
import javax.lang.model.*;
import javax.management.*;

/**
 * Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut 
 * labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. 
 * Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. 
 *
 * @see java.io.File
 * @see java.rmi.Remote
 * @see java.nio.file.FileStore
 */
@SuppressWarnings("all")
public abstract class Foo2<I> extends module2196_public_tests_unittests.a.Foo0<I> implements module2196_public_tests_unittests.a.IFoo2<I> {

	 java.sql.Array f0 = null;
	 java.util.logging.Filter f1 = null;
	 java.util.zip.Deflater f2 = null;

	 public I element;

	 public static Foo2 instance;

	 public static Foo2 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module2196_public_tests_unittests.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module2196_public_tests_unittests.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module2196_public_tests_unittests.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public I get() {
	 	 return (I)module2196_public_tests_unittests.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (I)element;
	 	 module2196_public_tests_unittests.a.Foo0.getInstance().set(this.element);
	 }

	 public I call() throws Exception {
	 	 return (I)module2196_public_tests_unittests.a.Foo0.getInstance().call();
	 }
}
