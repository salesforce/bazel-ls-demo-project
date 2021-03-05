package module1598.a;

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
public abstract class Foo2<M> extends module1598.a.Foo0<M> implements module1598.a.IFoo2<M> {

	 java.rmi.Remote f0 = null;
	 java.nio.file.FileStore f1 = null;
	 java.sql.Array f2 = null;

	 public M element;

	 public static Foo2 instance;

	 public static Foo2 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module1598.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module1598.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module1598.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public M get() {
	 	 return (M)module1598.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (M)element;
	 	 module1598.a.Foo0.getInstance().set(this.element);
	 }

	 public M call() throws Exception {
	 	 return (M)module1598.a.Foo0.getInstance().call();
	 }
}
