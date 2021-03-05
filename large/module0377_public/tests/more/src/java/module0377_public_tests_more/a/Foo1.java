package module0377_public_tests_more.a;

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
public abstract class Foo1<R> extends module0377_public_tests_more.a.Foo0<R> implements module0377_public_tests_more.a.IFoo1<R> {

	 java.beans.beancontext.BeanContext f0 = null;
	 java.io.File f1 = null;
	 java.rmi.Remote f2 = null;

	 public R element;

	 public static Foo1 instance;

	 public static Foo1 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module0377_public_tests_more.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module0377_public_tests_more.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module0377_public_tests_more.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public R get() {
	 	 return (R)module0377_public_tests_more.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (R)element;
	 	 module0377_public_tests_more.a.Foo0.getInstance().set(this.element);
	 }

	 public R call() throws Exception {
	 	 return (R)module0377_public_tests_more.a.Foo0.getInstance().call();
	 }
}
