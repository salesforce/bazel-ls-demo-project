package external_module_1001.a;

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
public abstract class Foo1<Z> extends external_module_1001.a.Foo0<Z> implements external_module_1001.a.IFoo1<Z> {

	 javax.naming.directory.DirContext f0 = null;
	 javax.net.ssl.ExtendedSSLSession f1 = null;
	 javax.rmi.ssl.SslRMIClientSocketFactory f2 = null;

	 public Z element;

	 public static Foo1 instance;

	 public static Foo1 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return external_module_1001.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return external_module_1001.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 external_module_1001.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public Z get() {
	 	 return (Z)external_module_1001.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (Z)element;
	 	 external_module_1001.a.Foo0.getInstance().set(this.element);
	 }

	 public Z call() throws Exception {
	 	 return (Z)external_module_1001.a.Foo0.getInstance().call();
	 }
}
