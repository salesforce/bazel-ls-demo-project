package module2079_public_tests_more.a;

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
public abstract class Foo1<H> extends module2079_public_tests_more.a.Foo0<H> implements module2079_public_tests_more.a.IFoo1<H> {

	 javax.lang.model.AnnotatedConstruct f0 = null;
	 javax.management.Attribute f1 = null;
	 javax.naming.directory.DirContext f2 = null;

	 public H element;

	 public static Foo1 instance;

	 public static Foo1 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module2079_public_tests_more.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module2079_public_tests_more.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module2079_public_tests_more.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public H get() {
	 	 return (H)module2079_public_tests_more.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (H)element;
	 	 module2079_public_tests_more.a.Foo0.getInstance().set(this.element);
	 }

	 public H call() throws Exception {
	 	 return (H)module2079_public_tests_more.a.Foo0.getInstance().call();
	 }
}
