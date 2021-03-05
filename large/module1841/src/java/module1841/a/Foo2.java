package module1841.a;

import javax.annotation.processing.*;
import javax.lang.model.*;
import javax.management.*;

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
public abstract class Foo2<C> extends module1841.a.Foo0<C> implements module1841.a.IFoo2<C> {

	 java.sql.Array f0 = null;
	 java.util.logging.Filter f1 = null;
	 java.util.zip.Deflater f2 = null;

	 public C element;

	 public static Foo2 instance;

	 public static Foo2 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module1841.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module1841.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module1841.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public C get() {
	 	 return (C)module1841.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (C)element;
	 	 module1841.a.Foo0.getInstance().set(this.element);
	 }

	 public C call() throws Exception {
	 	 return (C)module1841.a.Foo0.getInstance().call();
	 }
}
