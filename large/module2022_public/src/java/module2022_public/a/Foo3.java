package module2022_public.a;

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
public abstract class Foo3<V> extends module2022_public.a.Foo2<V> implements module2022_public.a.IFoo3<V> {

	 java.beans.beancontext.BeanContext f0 = null;
	 java.io.File f1 = null;
	 java.rmi.Remote f2 = null;

	 public V element;

	 public static Foo3 instance;

	 public static Foo3 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module2022_public.a.Foo2.create(input);
	 }

	 public String getName() {
	 	 return module2022_public.a.Foo2.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module2022_public.a.Foo2.getInstance().setName(getName());
	 	 return;
	 }

	 public V get() {
	 	 return (V)module2022_public.a.Foo2.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (V)element;
	 	 module2022_public.a.Foo2.getInstance().set(this.element);
	 }

	 public V call() throws Exception {
	 	 return (V)module2022_public.a.Foo2.getInstance().call();
	 }
}
