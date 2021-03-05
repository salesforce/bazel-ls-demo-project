package module1964_public.a;

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
public abstract class Foo1<Z> extends module1964_public.a.Foo0<Z> implements module1964_public.a.IFoo1<Z> {

	 java.beans.beancontext.BeanContext f0 = null;
	 java.io.File f1 = null;
	 java.rmi.Remote f2 = null;

	 public Z element;

	 public static Foo1 instance;

	 public static Foo1 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module1964_public.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module1964_public.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module1964_public.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public Z get() {
	 	 return (Z)module1964_public.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (Z)element;
	 	 module1964_public.a.Foo0.getInstance().set(this.element);
	 }

	 public Z call() throws Exception {
	 	 return (Z)module1964_public.a.Foo0.getInstance().call();
	 }
}
