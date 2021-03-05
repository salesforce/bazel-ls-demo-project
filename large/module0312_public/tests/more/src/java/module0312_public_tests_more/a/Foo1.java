package module0312_public_tests_more.a;

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
public abstract class Foo1<D> extends module0312_public_tests_more.a.Foo0<D> implements module0312_public_tests_more.a.IFoo1<D> {

	 javax.rmi.ssl.SslRMIClientSocketFactory f0 = null;
	 java.awt.datatransfer.DataFlavor f1 = null;
	 java.beans.beancontext.BeanContext f2 = null;

	 public D element;

	 public static Foo1 instance;

	 public static Foo1 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module0312_public_tests_more.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module0312_public_tests_more.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module0312_public_tests_more.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public D get() {
	 	 return (D)module0312_public_tests_more.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (D)element;
	 	 module0312_public_tests_more.a.Foo0.getInstance().set(this.element);
	 }

	 public D call() throws Exception {
	 	 return (D)module0312_public_tests_more.a.Foo0.getInstance().call();
	 }
}
