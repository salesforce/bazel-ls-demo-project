package module1120.a;

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
public abstract class Foo2<Y> extends module1120.a.Foo0<Y> implements module1120.a.IFoo2<Y> {

	 java.util.zip.Deflater f0 = null;
	 javax.annotation.processing.Completion f1 = null;
	 javax.lang.model.AnnotatedConstruct f2 = null;

	 public Y element;

	 public static Foo2 instance;

	 public static Foo2 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module1120.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module1120.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module1120.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public Y get() {
	 	 return (Y)module1120.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (Y)element;
	 	 module1120.a.Foo0.getInstance().set(this.element);
	 }

	 public Y call() throws Exception {
	 	 return (Y)module1120.a.Foo0.getInstance().call();
	 }
}
