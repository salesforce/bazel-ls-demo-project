package module1600_internal.a;

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
public abstract class Foo1<X> extends module1600_internal.a.Foo0<X> implements module1600_internal.a.IFoo1<X> {

	 javax.naming.directory.DirContext f0 = null;
	 javax.net.ssl.ExtendedSSLSession f1 = null;
	 javax.rmi.ssl.SslRMIClientSocketFactory f2 = null;

	 public X element;

	 public static Foo1 instance;

	 public static Foo1 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module1600_internal.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module1600_internal.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module1600_internal.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public X get() {
	 	 return (X)module1600_internal.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (X)element;
	 	 module1600_internal.a.Foo0.getInstance().set(this.element);
	 }

	 public X call() throws Exception {
	 	 return (X)module1600_internal.a.Foo0.getInstance().call();
	 }
}
