package module0170_public.a;

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
public abstract class Foo1<B> extends module0170_public.a.Foo0<B> implements module0170_public.a.IFoo1<B> {

	 javax.naming.directory.DirContext f0 = null;
	 javax.net.ssl.ExtendedSSLSession f1 = null;
	 javax.rmi.ssl.SslRMIClientSocketFactory f2 = null;

	 public B element;

	 public static Foo1 instance;

	 public static Foo1 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module0170_public.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module0170_public.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module0170_public.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public B get() {
	 	 return (B)module0170_public.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (B)element;
	 	 module0170_public.a.Foo0.getInstance().set(this.element);
	 }

	 public B call() throws Exception {
	 	 return (B)module0170_public.a.Foo0.getInstance().call();
	 }
}
