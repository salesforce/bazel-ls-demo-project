package module1870_public_tests_more.a;

import java.awt.datatransfer.*;
import java.beans.beancontext.*;
import java.io.*;

/**
 * Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut 
 * labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. 
 * Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. 
 *
 * @see java.awt.datatransfer.DataFlavor
 * @see java.beans.beancontext.BeanContext
 * @see java.io.File
 */
@SuppressWarnings("all")
public abstract class Foo2<E> extends module1870_public_tests_more.a.Foo0<E> implements module1870_public_tests_more.a.IFoo2<E> {

	 java.rmi.Remote f0 = null;
	 java.nio.file.FileStore f1 = null;
	 java.sql.Array f2 = null;

	 public E element;

	 public static Foo2 instance;

	 public static Foo2 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module1870_public_tests_more.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module1870_public_tests_more.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module1870_public_tests_more.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public E get() {
	 	 return (E)module1870_public_tests_more.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (E)element;
	 	 module1870_public_tests_more.a.Foo0.getInstance().set(this.element);
	 }

	 public E call() throws Exception {
	 	 return (E)module1870_public_tests_more.a.Foo0.getInstance().call();
	 }
}
