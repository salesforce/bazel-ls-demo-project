package external_module_0759.a;

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
public abstract class Foo1<T> extends external_module_0759.a.Foo0<T> implements external_module_0759.a.IFoo1<T> {

	 javax.rmi.ssl.SslRMIClientSocketFactory f0 = null;
	 java.awt.datatransfer.DataFlavor f1 = null;
	 java.beans.beancontext.BeanContext f2 = null;

	 public T element;

	 public static Foo1 instance;

	 public static Foo1 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return external_module_0759.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return external_module_0759.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 external_module_0759.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public T get() {
	 	 return (T)external_module_0759.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (T)element;
	 	 external_module_0759.a.Foo0.getInstance().set(this.element);
	 }

	 public T call() throws Exception {
	 	 return (T)external_module_0759.a.Foo0.getInstance().call();
	 }
}
