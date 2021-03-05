package module2179_public_tests_more.a;

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
public abstract class Foo3<X> extends module2179_public_tests_more.a.Foo2<X> implements module2179_public_tests_more.a.IFoo3<X> {

	 javax.naming.directory.DirContext f0 = null;
	 javax.net.ssl.ExtendedSSLSession f1 = null;
	 javax.rmi.ssl.SslRMIClientSocketFactory f2 = null;

	 public X element;

	 public static Foo3 instance;

	 public static Foo3 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module2179_public_tests_more.a.Foo2.create(input);
	 }

	 public String getName() {
	 	 return module2179_public_tests_more.a.Foo2.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module2179_public_tests_more.a.Foo2.getInstance().setName(getName());
	 	 return;
	 }

	 public X get() {
	 	 return (X)module2179_public_tests_more.a.Foo2.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (X)element;
	 	 module2179_public_tests_more.a.Foo2.getInstance().set(this.element);
	 }

	 public X call() throws Exception {
	 	 return (X)module2179_public_tests_more.a.Foo2.getInstance().call();
	 }
}
