package module2210.a;

import java.rmi.*;
import java.nio.file.*;
import java.sql.*;

/**
 * Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut 
 * labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. 
 * Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. 
 *
 * @see java.util.logging.Filter
 * @see java.util.zip.Deflater
 * @see javax.annotation.processing.Completion
 */
@SuppressWarnings("all")
public abstract class Foo1<T> extends module2210.a.Foo0<T> implements module2210.a.IFoo1<T> {

	 javax.lang.model.AnnotatedConstruct f0 = null;
	 javax.management.Attribute f1 = null;
	 javax.naming.directory.DirContext f2 = null;

	 public T element;

	 public static Foo1 instance;

	 public static Foo1 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module2210.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module2210.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module2210.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public T get() {
	 	 return (T)module2210.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (T)element;
	 	 module2210.a.Foo0.getInstance().set(this.element);
	 }

	 public T call() throws Exception {
	 	 return (T)module2210.a.Foo0.getInstance().call();
	 }
}
