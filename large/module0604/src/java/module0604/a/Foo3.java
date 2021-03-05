package module0604.a;

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
public abstract class Foo3<B> extends module0604.a.Foo2<B> implements module0604.a.IFoo3<B> {

	 javax.rmi.ssl.SslRMIClientSocketFactory f0 = null;
	 java.awt.datatransfer.DataFlavor f1 = null;
	 java.beans.beancontext.BeanContext f2 = null;

	 public B element;

	 public static Foo3 instance;

	 public static Foo3 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module0604.a.Foo2.create(input);
	 }

	 public String getName() {
	 	 return module0604.a.Foo2.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module0604.a.Foo2.getInstance().setName(getName());
	 	 return;
	 }

	 public B get() {
	 	 return (B)module0604.a.Foo2.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (B)element;
	 	 module0604.a.Foo2.getInstance().set(this.element);
	 }

	 public B call() throws Exception {
	 	 return (B)module0604.a.Foo2.getInstance().call();
	 }
}
