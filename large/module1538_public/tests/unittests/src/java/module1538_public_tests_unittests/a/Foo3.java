package module1538_public_tests_unittests.a;

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
public abstract class Foo3<D> extends module1538_public_tests_unittests.a.Foo2<D> implements module1538_public_tests_unittests.a.IFoo3<D> {

	 javax.rmi.ssl.SslRMIClientSocketFactory f0 = null;
	 java.awt.datatransfer.DataFlavor f1 = null;
	 java.beans.beancontext.BeanContext f2 = null;

	 public D element;

	 public static Foo3 instance;

	 public static Foo3 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module1538_public_tests_unittests.a.Foo2.create(input);
	 }

	 public String getName() {
	 	 return module1538_public_tests_unittests.a.Foo2.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module1538_public_tests_unittests.a.Foo2.getInstance().setName(getName());
	 	 return;
	 }

	 public D get() {
	 	 return (D)module1538_public_tests_unittests.a.Foo2.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (D)element;
	 	 module1538_public_tests_unittests.a.Foo2.getInstance().set(this.element);
	 }

	 public D call() throws Exception {
	 	 return (D)module1538_public_tests_unittests.a.Foo2.getInstance().call();
	 }
}
