package external_module_0124.a;

import java.beans.beancontext.*;
import java.io.*;
import java.rmi.*;

/**
 * Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut 
 * labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. 
 * Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. 
 *
 * @see java.io.File
 * @see java.rmi.Remote
 * @see java.nio.file.FileStore
 */
@SuppressWarnings("all")
public abstract class Foo1<B> extends external_module_0124.a.Foo0<B> implements external_module_0124.a.IFoo1<B> {

	 java.sql.Array f0 = null;
	 java.util.logging.Filter f1 = null;
	 java.util.zip.Deflater f2 = null;

	 public B element;

	 public static Foo1 instance;

	 public static Foo1 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return external_module_0124.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return external_module_0124.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 external_module_0124.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public B get() {
	 	 return (B)external_module_0124.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (B)element;
	 	 external_module_0124.a.Foo0.getInstance().set(this.element);
	 }

	 public B call() throws Exception {
	 	 return (B)external_module_0124.a.Foo0.getInstance().call();
	 }
}
