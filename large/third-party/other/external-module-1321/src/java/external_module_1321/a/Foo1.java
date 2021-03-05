package external_module_1321.a;

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
public abstract class Foo1<F> extends external_module_1321.a.Foo0<F> implements external_module_1321.a.IFoo1<F> {

	 java.sql.Array f0 = null;
	 java.util.logging.Filter f1 = null;
	 java.util.zip.Deflater f2 = null;

	 public F element;

	 public static Foo1 instance;

	 public static Foo1 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return external_module_1321.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return external_module_1321.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 external_module_1321.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public F get() {
	 	 return (F)external_module_1321.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (F)element;
	 	 external_module_1321.a.Foo0.getInstance().set(this.element);
	 }

	 public F call() throws Exception {
	 	 return (F)external_module_1321.a.Foo0.getInstance().call();
	 }
}
