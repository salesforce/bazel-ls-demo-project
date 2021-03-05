package module0817_generated.a;

import java.io.*;
import java.rmi.*;
import java.nio.file.*;

/**
 * Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut 
 * labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. 
 * Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. 
 *
 * @see java.nio.file.FileStore
 * @see java.sql.Array
 * @see java.util.logging.Filter
 */
@SuppressWarnings("all")
public abstract class Foo2<U> extends module0817_generated.a.Foo0<U> implements module0817_generated.a.IFoo2<U> {

	 java.util.zip.Deflater f0 = null;
	 javax.annotation.processing.Completion f1 = null;
	 javax.lang.model.AnnotatedConstruct f2 = null;

	 public U element;

	 public static Foo2 instance;

	 public static Foo2 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module0817_generated.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module0817_generated.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module0817_generated.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public U get() {
	 	 return (U)module0817_generated.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (U)element;
	 	 module0817_generated.a.Foo0.getInstance().set(this.element);
	 }

	 public U call() throws Exception {
	 	 return (U)module0817_generated.a.Foo0.getInstance().call();
	 }
}
