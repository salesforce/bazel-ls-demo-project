package module1727_internal.a;

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
public abstract class Foo3<X> extends module1727_internal.a.Foo2<X> implements module1727_internal.a.IFoo3<X> {

	 javax.lang.model.AnnotatedConstruct f0 = null;
	 javax.management.Attribute f1 = null;
	 javax.naming.directory.DirContext f2 = null;

	 public X element;

	 public static Foo3 instance;

	 public static Foo3 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module1727_internal.a.Foo2.create(input);
	 }

	 public String getName() {
	 	 return module1727_internal.a.Foo2.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module1727_internal.a.Foo2.getInstance().setName(getName());
	 	 return;
	 }

	 public X get() {
	 	 return (X)module1727_internal.a.Foo2.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (X)element;
	 	 module1727_internal.a.Foo2.getInstance().set(this.element);
	 }

	 public X call() throws Exception {
	 	 return (X)module1727_internal.a.Foo2.getInstance().call();
	 }
}
