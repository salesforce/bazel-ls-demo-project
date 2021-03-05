package module1615_public_tests_unittests.a;

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
public abstract class Foo1<L> extends module1615_public_tests_unittests.a.Foo0<L> implements module1615_public_tests_unittests.a.IFoo1<L> {

	 java.sql.Array f0 = null;
	 java.util.logging.Filter f1 = null;
	 java.util.zip.Deflater f2 = null;

	 public L element;

	 public static Foo1 instance;

	 public static Foo1 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module1615_public_tests_unittests.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module1615_public_tests_unittests.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module1615_public_tests_unittests.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public L get() {
	 	 return (L)module1615_public_tests_unittests.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (L)element;
	 	 module1615_public_tests_unittests.a.Foo0.getInstance().set(this.element);
	 }

	 public L call() throws Exception {
	 	 return (L)module1615_public_tests_unittests.a.Foo0.getInstance().call();
	 }
}
