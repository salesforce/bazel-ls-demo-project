package module0963_public_tests_unittests.a;

import java.io.*;
import java.rmi.*;
import java.nio.file.*;

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
public abstract class Foo2<S> extends module0963_public_tests_unittests.a.Foo0<S> implements module0963_public_tests_unittests.a.IFoo2<S> {

	 java.util.zip.Deflater f0 = null;
	 javax.annotation.processing.Completion f1 = null;
	 javax.lang.model.AnnotatedConstruct f2 = null;

	 public S element;

	 public static Foo2 instance;

	 public static Foo2 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module0963_public_tests_unittests.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module0963_public_tests_unittests.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module0963_public_tests_unittests.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public S get() {
	 	 return (S)module0963_public_tests_unittests.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (S)element;
	 	 module0963_public_tests_unittests.a.Foo0.getInstance().set(this.element);
	 }

	 public S call() throws Exception {
	 	 return (S)module0963_public_tests_unittests.a.Foo0.getInstance().call();
	 }
}
