package external_module_1211.a;

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
public abstract class Foo1<H> extends external_module_1211.a.Foo0<H> implements external_module_1211.a.IFoo1<H> {

	 javax.naming.directory.DirContext f0 = null;
	 javax.net.ssl.ExtendedSSLSession f1 = null;
	 javax.rmi.ssl.SslRMIClientSocketFactory f2 = null;

	 public H element;

	 public static Foo1 instance;

	 public static Foo1 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return external_module_1211.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return external_module_1211.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 external_module_1211.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public H get() {
	 	 return (H)external_module_1211.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (H)element;
	 	 external_module_1211.a.Foo0.getInstance().set(this.element);
	 }

	 public H call() throws Exception {
	 	 return (H)external_module_1211.a.Foo0.getInstance().call();
	 }
}
