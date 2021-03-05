package module0051_public.a;

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
public abstract class Foo3<N> extends module0051_public.a.Foo2<N> implements module0051_public.a.IFoo3<N> {

	 javax.naming.directory.DirContext f0 = null;
	 javax.net.ssl.ExtendedSSLSession f1 = null;
	 javax.rmi.ssl.SslRMIClientSocketFactory f2 = null;

	 public N element;

	 public static Foo3 instance;

	 public static Foo3 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module0051_public.a.Foo2.create(input);
	 }

	 public String getName() {
	 	 return module0051_public.a.Foo2.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module0051_public.a.Foo2.getInstance().setName(getName());
	 	 return;
	 }

	 public N get() {
	 	 return (N)module0051_public.a.Foo2.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (N)element;
	 	 module0051_public.a.Foo2.getInstance().set(this.element);
	 }

	 public N call() throws Exception {
	 	 return (N)module0051_public.a.Foo2.getInstance().call();
	 }
}
