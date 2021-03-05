package external_module_0619.a;

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
public abstract class Foo0<E> implements external_module_0619.a.IFoo0<E> {

	 java.util.zip.Deflater f0 = null;
	 javax.annotation.processing.Completion f1 = null;
	 javax.lang.model.AnnotatedConstruct f2 = null;

public E element;
public static Foo0 instance;

	 public static Foo0 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return null;
	 }

	 public String getName() {
	 	 return element.toString();
	 }

	 public void setName(String string) {
	 	 return;
	 }

	 public E get() {
	 	 return element;
	 }

	 public void set(Object element) {
	 	 this.element = (E)element;
	 }

	 public E call() throws Exception {
	 	 return (E)getInstance().call();
	 }
}
