package module0853.a;

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
public abstract class Foo1<H> extends module0853.a.Foo0<H> implements module0853.a.IFoo1<H> {

	 javax.naming.directory.DirContext f0 = null;
	 javax.net.ssl.ExtendedSSLSession f1 = null;
	 javax.rmi.ssl.SslRMIClientSocketFactory f2 = null;

	 public H element;

	 public static Foo1 instance;

	 public static Foo1 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module0853.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module0853.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module0853.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public H get() {
	 	 return (H)module0853.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (H)element;
	 	 module0853.a.Foo0.getInstance().set(this.element);
	 }

	 public H call() throws Exception {
	 	 return (H)module0853.a.Foo0.getInstance().call();
	 }
}
