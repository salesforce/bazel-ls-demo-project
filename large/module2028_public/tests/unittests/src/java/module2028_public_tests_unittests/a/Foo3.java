package module2028_public_tests_unittests.a;

import java.beans.beancontext.*;
import java.io.*;
import java.rmi.*;

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
public abstract class Foo3<P> extends module2028_public_tests_unittests.a.Foo2<P> implements module2028_public_tests_unittests.a.IFoo3<P> {

	 java.sql.Array f0 = null;
	 java.util.logging.Filter f1 = null;
	 java.util.zip.Deflater f2 = null;

	 public P element;

	 public static Foo3 instance;

	 public static Foo3 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module2028_public_tests_unittests.a.Foo2.create(input);
	 }

	 public String getName() {
	 	 return module2028_public_tests_unittests.a.Foo2.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module2028_public_tests_unittests.a.Foo2.getInstance().setName(getName());
	 	 return;
	 }

	 public P get() {
	 	 return (P)module2028_public_tests_unittests.a.Foo2.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (P)element;
	 	 module2028_public_tests_unittests.a.Foo2.getInstance().set(this.element);
	 }

	 public P call() throws Exception {
	 	 return (P)module2028_public_tests_unittests.a.Foo2.getInstance().call();
	 }
}
