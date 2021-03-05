package module0874_public_tests_more.a;

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
public abstract class Foo2<C> extends module0874_public_tests_more.a.Foo0<C> implements module0874_public_tests_more.a.IFoo2<C> {

	 java.util.zip.Deflater f0 = null;
	 javax.annotation.processing.Completion f1 = null;
	 javax.lang.model.AnnotatedConstruct f2 = null;

	 public C element;

	 public static Foo2 instance;

	 public static Foo2 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module0874_public_tests_more.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module0874_public_tests_more.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module0874_public_tests_more.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public C get() {
	 	 return (C)module0874_public_tests_more.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (C)element;
	 	 module0874_public_tests_more.a.Foo0.getInstance().set(this.element);
	 }

	 public C call() throws Exception {
	 	 return (C)module0874_public_tests_more.a.Foo0.getInstance().call();
	 }
}
