package module1599_public_tests_more.a;

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
public abstract class Foo3<L> extends module1599_public_tests_more.a.Foo2<L> implements module1599_public_tests_more.a.IFoo3<L> {

	 java.sql.Array f0 = null;
	 java.util.logging.Filter f1 = null;
	 java.util.zip.Deflater f2 = null;

	 public L element;

	 public static Foo3 instance;

	 public static Foo3 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module1599_public_tests_more.a.Foo2.create(input);
	 }

	 public String getName() {
	 	 return module1599_public_tests_more.a.Foo2.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module1599_public_tests_more.a.Foo2.getInstance().setName(getName());
	 	 return;
	 }

	 public L get() {
	 	 return (L)module1599_public_tests_more.a.Foo2.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (L)element;
	 	 module1599_public_tests_more.a.Foo2.getInstance().set(this.element);
	 }

	 public L call() throws Exception {
	 	 return (L)module1599_public_tests_more.a.Foo2.getInstance().call();
	 }
}
