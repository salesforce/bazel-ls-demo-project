package module0496_internal.a;

import java.util.logging.*;
import java.util.zip.*;
import javax.annotation.processing.*;

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
public abstract class Foo2<K> extends module0496_internal.a.Foo0<K> implements module0496_internal.a.IFoo2<K> {

	 java.beans.beancontext.BeanContext f0 = null;
	 java.io.File f1 = null;
	 java.rmi.Remote f2 = null;

	 public K element;

	 public static Foo2 instance;

	 public static Foo2 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module0496_internal.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module0496_internal.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module0496_internal.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public K get() {
	 	 return (K)module0496_internal.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (K)element;
	 	 module0496_internal.a.Foo0.getInstance().set(this.element);
	 }

	 public K call() throws Exception {
	 	 return (K)module0496_internal.a.Foo0.getInstance().call();
	 }
}
