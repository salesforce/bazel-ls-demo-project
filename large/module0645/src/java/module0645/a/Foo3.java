package module0645.a;

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
public abstract class Foo3<J> extends module0645.a.Foo2<J> implements module0645.a.IFoo3<J> {

	 java.beans.beancontext.BeanContext f0 = null;
	 java.io.File f1 = null;
	 java.rmi.Remote f2 = null;

	 public J element;

	 public static Foo3 instance;

	 public static Foo3 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module0645.a.Foo2.create(input);
	 }

	 public String getName() {
	 	 return module0645.a.Foo2.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module0645.a.Foo2.getInstance().setName(getName());
	 	 return;
	 }

	 public J get() {
	 	 return (J)module0645.a.Foo2.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (J)element;
	 	 module0645.a.Foo2.getInstance().set(this.element);
	 }

	 public J call() throws Exception {
	 	 return (J)module0645.a.Foo2.getInstance().call();
	 }
}
