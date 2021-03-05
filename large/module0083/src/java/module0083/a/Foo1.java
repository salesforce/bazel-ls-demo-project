package module0083.a;

import java.util.zip.*;
import javax.annotation.processing.*;
import javax.lang.model.*;

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
public abstract class Foo1<R> extends module0083.a.Foo0<R> implements module0083.a.IFoo1<R> {

	 java.rmi.Remote f0 = null;
	 java.nio.file.FileStore f1 = null;
	 java.sql.Array f2 = null;

	 public R element;

	 public static Foo1 instance;

	 public static Foo1 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module0083.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module0083.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module0083.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public R get() {
	 	 return (R)module0083.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (R)element;
	 	 module0083.a.Foo0.getInstance().set(this.element);
	 }

	 public R call() throws Exception {
	 	 return (R)module0083.a.Foo0.getInstance().call();
	 }
}
