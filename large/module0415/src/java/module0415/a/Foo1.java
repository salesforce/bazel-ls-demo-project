package module0415.a;

import javax.naming.directory.*;
import javax.net.ssl.*;
import javax.rmi.ssl.*;

/**
 * Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut 
 * labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. 
 * Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. 
 *
 * @see javax.annotation.processing.Completion
 * @see javax.lang.model.AnnotatedConstruct
 * @see javax.management.Attribute
 */
@SuppressWarnings("all")
public abstract class Foo1<N> extends module0415.a.Foo0<N> implements module0415.a.IFoo1<N> {

	 javax.naming.directory.DirContext f0 = null;
	 javax.net.ssl.ExtendedSSLSession f1 = null;
	 javax.rmi.ssl.SslRMIClientSocketFactory f2 = null;

	 public N element;

	 public static Foo1 instance;

	 public static Foo1 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module0415.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module0415.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module0415.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public N get() {
	 	 return (N)module0415.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (N)element;
	 	 module0415.a.Foo0.getInstance().set(this.element);
	 }

	 public N call() throws Exception {
	 	 return (N)module0415.a.Foo0.getInstance().call();
	 }
}
