package module2115.a;

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
public abstract class Foo1<V> extends module2115.a.Foo0<V> implements module2115.a.IFoo1<V> {

	 javax.naming.directory.DirContext f0 = null;
	 javax.net.ssl.ExtendedSSLSession f1 = null;
	 javax.rmi.ssl.SslRMIClientSocketFactory f2 = null;

	 public V element;

	 public static Foo1 instance;

	 public static Foo1 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module2115.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module2115.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module2115.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public V get() {
	 	 return (V)module2115.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (V)element;
	 	 module2115.a.Foo0.getInstance().set(this.element);
	 }

	 public V call() throws Exception {
	 	 return (V)module2115.a.Foo0.getInstance().call();
	 }
}
