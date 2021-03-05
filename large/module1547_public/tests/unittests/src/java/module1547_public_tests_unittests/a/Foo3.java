package module1547_public_tests_unittests.a;

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
public abstract class Foo3<H> extends module1547_public_tests_unittests.a.Foo2<H> implements module1547_public_tests_unittests.a.IFoo3<H> {

	 javax.rmi.ssl.SslRMIClientSocketFactory f0 = null;
	 java.awt.datatransfer.DataFlavor f1 = null;
	 java.beans.beancontext.BeanContext f2 = null;

	 public H element;

	 public static Foo3 instance;

	 public static Foo3 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module1547_public_tests_unittests.a.Foo2.create(input);
	 }

	 public String getName() {
	 	 return module1547_public_tests_unittests.a.Foo2.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module1547_public_tests_unittests.a.Foo2.getInstance().setName(getName());
	 	 return;
	 }

	 public H get() {
	 	 return (H)module1547_public_tests_unittests.a.Foo2.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (H)element;
	 	 module1547_public_tests_unittests.a.Foo2.getInstance().set(this.element);
	 }

	 public H call() throws Exception {
	 	 return (H)module1547_public_tests_unittests.a.Foo2.getInstance().call();
	 }
}
