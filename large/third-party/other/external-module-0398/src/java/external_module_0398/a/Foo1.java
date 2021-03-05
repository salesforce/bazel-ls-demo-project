package external_module_0398.a;

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
public abstract class Foo1<F> extends external_module_0398.a.Foo0<F> implements external_module_0398.a.IFoo1<F> {

	 java.beans.beancontext.BeanContext f0 = null;
	 java.io.File f1 = null;
	 java.rmi.Remote f2 = null;

	 public F element;

	 public static Foo1 instance;

	 public static Foo1 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return external_module_0398.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return external_module_0398.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 external_module_0398.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public F get() {
	 	 return (F)external_module_0398.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (F)element;
	 	 external_module_0398.a.Foo0.getInstance().set(this.element);
	 }

	 public F call() throws Exception {
	 	 return (F)external_module_0398.a.Foo0.getInstance().call();
	 }
}
