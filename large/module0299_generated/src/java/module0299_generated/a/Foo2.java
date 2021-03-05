package module0299_generated.a;

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
public abstract class Foo2<U> extends module0299_generated.a.Foo0<U> implements module0299_generated.a.IFoo2<U> {

	 java.sql.Array f0 = null;
	 java.util.logging.Filter f1 = null;
	 java.util.zip.Deflater f2 = null;

	 public U element;

	 public static Foo2 instance;

	 public static Foo2 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module0299_generated.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module0299_generated.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module0299_generated.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public U get() {
	 	 return (U)module0299_generated.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (U)element;
	 	 module0299_generated.a.Foo0.getInstance().set(this.element);
	 }

	 public U call() throws Exception {
	 	 return (U)module0299_generated.a.Foo0.getInstance().call();
	 }
}
