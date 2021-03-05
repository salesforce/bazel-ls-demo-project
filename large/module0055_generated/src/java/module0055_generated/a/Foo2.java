package module0055_generated.a;

import java.nio.file.*;
import java.sql.*;
import java.util.logging.*;

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
public abstract class Foo2<M> extends module0055_generated.a.Foo0<M> implements module0055_generated.a.IFoo2<M> {

	 javax.naming.directory.DirContext f0 = null;
	 javax.net.ssl.ExtendedSSLSession f1 = null;
	 javax.rmi.ssl.SslRMIClientSocketFactory f2 = null;

	 public M element;

	 public static Foo2 instance;

	 public static Foo2 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module0055_generated.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module0055_generated.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module0055_generated.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public M get() {
	 	 return (M)module0055_generated.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (M)element;
	 	 module0055_generated.a.Foo0.getInstance().set(this.element);
	 }

	 public M call() throws Exception {
	 	 return (M)module0055_generated.a.Foo0.getInstance().call();
	 }
}
