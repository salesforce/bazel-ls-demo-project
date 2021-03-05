package module0355_public_tests_unittests.a;

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
public abstract class Foo1<P> extends module0355_public_tests_unittests.a.Foo0<P> implements module0355_public_tests_unittests.a.IFoo1<P> {

	 java.sql.Array f0 = null;
	 java.util.logging.Filter f1 = null;
	 java.util.zip.Deflater f2 = null;

	 public P element;

	 public static Foo1 instance;

	 public static Foo1 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module0355_public_tests_unittests.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module0355_public_tests_unittests.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module0355_public_tests_unittests.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public P get() {
	 	 return (P)module0355_public_tests_unittests.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (P)element;
	 	 module0355_public_tests_unittests.a.Foo0.getInstance().set(this.element);
	 }

	 public P call() throws Exception {
	 	 return (P)module0355_public_tests_unittests.a.Foo0.getInstance().call();
	 }
}
