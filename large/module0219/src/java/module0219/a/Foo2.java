package module0219.a;

import java.awt.datatransfer.*;
import java.beans.beancontext.*;
import java.io.*;

/**
 * Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut 
 * labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. 
 * Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. 
 *
 * @see java.awt.datatransfer.DataFlavor
 * @see java.beans.beancontext.BeanContext
 * @see java.io.File
 */
@SuppressWarnings("all")
public abstract class Foo2<S> extends module0219.a.Foo0<S> implements module0219.a.IFoo2<S> {

	 java.rmi.Remote f0 = null;
	 java.nio.file.FileStore f1 = null;
	 java.sql.Array f2 = null;

	 public S element;

	 public static Foo2 instance;

	 public static Foo2 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module0219.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module0219.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module0219.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public S get() {
	 	 return (S)module0219.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (S)element;
	 	 module0219.a.Foo0.getInstance().set(this.element);
	 }

	 public S call() throws Exception {
	 	 return (S)module0219.a.Foo0.getInstance().call();
	 }
}
