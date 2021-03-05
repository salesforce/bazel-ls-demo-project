package module0821_public_tests_more.a;

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
public abstract class Foo3<B> extends module0821_public_tests_more.a.Foo2<B> implements module0821_public_tests_more.a.IFoo3<B> {

	 javax.naming.directory.DirContext f0 = null;
	 javax.net.ssl.ExtendedSSLSession f1 = null;
	 javax.rmi.ssl.SslRMIClientSocketFactory f2 = null;

	 public B element;

	 public static Foo3 instance;

	 public static Foo3 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module0821_public_tests_more.a.Foo2.create(input);
	 }

	 public String getName() {
	 	 return module0821_public_tests_more.a.Foo2.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module0821_public_tests_more.a.Foo2.getInstance().setName(getName());
	 	 return;
	 }

	 public B get() {
	 	 return (B)module0821_public_tests_more.a.Foo2.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (B)element;
	 	 module0821_public_tests_more.a.Foo2.getInstance().set(this.element);
	 }

	 public B call() throws Exception {
	 	 return (B)module0821_public_tests_more.a.Foo2.getInstance().call();
	 }
}
