package module2155_public_tests_unittests.a;

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
public abstract class Foo2<E> extends module2155_public_tests_unittests.a.Foo0<E> implements module2155_public_tests_unittests.a.IFoo2<E> {

	 java.beans.beancontext.BeanContext f0 = null;
	 java.io.File f1 = null;
	 java.rmi.Remote f2 = null;

	 public E element;

	 public static Foo2 instance;

	 public static Foo2 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module2155_public_tests_unittests.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module2155_public_tests_unittests.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module2155_public_tests_unittests.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public E get() {
	 	 return (E)module2155_public_tests_unittests.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (E)element;
	 	 module2155_public_tests_unittests.a.Foo0.getInstance().set(this.element);
	 }

	 public E call() throws Exception {
	 	 return (E)module2155_public_tests_unittests.a.Foo0.getInstance().call();
	 }
}
