package module1081_generated.a;

import javax.net.ssl.*;
import javax.rmi.ssl.*;
import java.awt.datatransfer.*;

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
public abstract class Foo2<I> extends module1081_generated.a.Foo0<I> implements module1081_generated.a.IFoo2<I> {

	 javax.rmi.ssl.SslRMIClientSocketFactory f0 = null;
	 java.awt.datatransfer.DataFlavor f1 = null;
	 java.beans.beancontext.BeanContext f2 = null;

	 public I element;

	 public static Foo2 instance;

	 public static Foo2 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module1081_generated.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module1081_generated.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module1081_generated.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public I get() {
	 	 return (I)module1081_generated.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (I)element;
	 	 module1081_generated.a.Foo0.getInstance().set(this.element);
	 }

	 public I call() throws Exception {
	 	 return (I)module1081_generated.a.Foo0.getInstance().call();
	 }
}
