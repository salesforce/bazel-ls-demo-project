package module0183_public_tests_unittests.a;

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
public abstract class Foo2<I> extends module0183_public_tests_unittests.a.Foo0<I> implements module0183_public_tests_unittests.a.IFoo2<I> {

	 java.util.zip.Deflater f0 = null;
	 javax.annotation.processing.Completion f1 = null;
	 javax.lang.model.AnnotatedConstruct f2 = null;

	 public I element;

	 public static Foo2 instance;

	 public static Foo2 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module0183_public_tests_unittests.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module0183_public_tests_unittests.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module0183_public_tests_unittests.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public I get() {
	 	 return (I)module0183_public_tests_unittests.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (I)element;
	 	 module0183_public_tests_unittests.a.Foo0.getInstance().set(this.element);
	 }

	 public I call() throws Exception {
	 	 return (I)module0183_public_tests_unittests.a.Foo0.getInstance().call();
	 }
}
