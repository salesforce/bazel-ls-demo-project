package module0638_public_tests_unittests.a;

import java.sql.*;
import java.util.logging.*;
import java.util.zip.*;

/**
 * Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut 
 * labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. 
 * Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. 
 *
 * @see javax.management.Attribute
 * @see javax.naming.directory.DirContext
 * @see javax.net.ssl.ExtendedSSLSession
 */
@SuppressWarnings("all")
public abstract class Foo1<T> extends module0638_public_tests_unittests.a.Foo0<T> implements module0638_public_tests_unittests.a.IFoo1<T> {

	 javax.rmi.ssl.SslRMIClientSocketFactory f0 = null;
	 java.awt.datatransfer.DataFlavor f1 = null;
	 java.beans.beancontext.BeanContext f2 = null;

	 public T element;

	 public static Foo1 instance;

	 public static Foo1 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module0638_public_tests_unittests.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module0638_public_tests_unittests.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module0638_public_tests_unittests.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public T get() {
	 	 return (T)module0638_public_tests_unittests.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (T)element;
	 	 module0638_public_tests_unittests.a.Foo0.getInstance().set(this.element);
	 }

	 public T call() throws Exception {
	 	 return (T)module0638_public_tests_unittests.a.Foo0.getInstance().call();
	 }
}
