package module0849.a;

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
public abstract class Foo1<B> extends module0849.a.Foo0<B> implements module0849.a.IFoo1<B> {

	 javax.rmi.ssl.SslRMIClientSocketFactory f0 = null;
	 java.awt.datatransfer.DataFlavor f1 = null;
	 java.beans.beancontext.BeanContext f2 = null;

	 public B element;

	 public static Foo1 instance;

	 public static Foo1 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module0849.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module0849.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module0849.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public B get() {
	 	 return (B)module0849.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (B)element;
	 	 module0849.a.Foo0.getInstance().set(this.element);
	 }

	 public B call() throws Exception {
	 	 return (B)module0849.a.Foo0.getInstance().call();
	 }
}