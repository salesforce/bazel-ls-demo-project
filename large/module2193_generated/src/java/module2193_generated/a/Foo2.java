package module2193_generated.a;

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
public abstract class Foo2<W> extends module2193_generated.a.Foo0<W> implements module2193_generated.a.IFoo2<W> {

	 java.beans.beancontext.BeanContext f0 = null;
	 java.io.File f1 = null;
	 java.rmi.Remote f2 = null;

	 public W element;

	 public static Foo2 instance;

	 public static Foo2 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module2193_generated.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module2193_generated.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module2193_generated.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public W get() {
	 	 return (W)module2193_generated.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (W)element;
	 	 module2193_generated.a.Foo0.getInstance().set(this.element);
	 }

	 public W call() throws Exception {
	 	 return (W)module2193_generated.a.Foo0.getInstance().call();
	 }
}
