package module1593_internal.a;

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
public abstract class Foo3<T> extends module1593_internal.a.Foo2<T> implements module1593_internal.a.IFoo3<T> {

	 java.rmi.Remote f0 = null;
	 java.nio.file.FileStore f1 = null;
	 java.sql.Array f2 = null;

	 public T element;

	 public static Foo3 instance;

	 public static Foo3 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module1593_internal.a.Foo2.create(input);
	 }

	 public String getName() {
	 	 return module1593_internal.a.Foo2.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module1593_internal.a.Foo2.getInstance().setName(getName());
	 	 return;
	 }

	 public T get() {
	 	 return (T)module1593_internal.a.Foo2.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (T)element;
	 	 module1593_internal.a.Foo2.getInstance().set(this.element);
	 }

	 public T call() throws Exception {
	 	 return (T)module1593_internal.a.Foo2.getInstance().call();
	 }
}