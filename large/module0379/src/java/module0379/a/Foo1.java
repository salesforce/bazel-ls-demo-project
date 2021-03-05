package module0379.a;

import javax.rmi.ssl.*;
import java.awt.datatransfer.*;
import java.beans.beancontext.*;

/**
 * Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut 
 * labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. 
 * Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. 
 *
 * @see javax.net.ssl.ExtendedSSLSession
 * @see javax.rmi.ssl.SslRMIClientSocketFactory
 * @see java.awt.datatransfer.DataFlavor
 */
@SuppressWarnings("all")
public abstract class Foo1<X> extends module0379.a.Foo0<X> implements module0379.a.IFoo1<X> {

	 java.beans.beancontext.BeanContext f0 = null;
	 java.io.File f1 = null;
	 java.rmi.Remote f2 = null;

	 public X element;

	 public static Foo1 instance;

	 public static Foo1 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module0379.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module0379.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module0379.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public X get() {
	 	 return (X)module0379.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (X)element;
	 	 module0379.a.Foo0.getInstance().set(this.element);
	 }

	 public X call() throws Exception {
	 	 return (X)module0379.a.Foo0.getInstance().call();
	 }
}
