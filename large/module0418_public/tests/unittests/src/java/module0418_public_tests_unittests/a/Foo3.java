package module0418_public_tests_unittests.a;

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
public abstract class Foo3<V> extends module0418_public_tests_unittests.a.Foo2<V> implements module0418_public_tests_unittests.a.IFoo3<V> {

	 javax.lang.model.AnnotatedConstruct f0 = null;
	 javax.management.Attribute f1 = null;
	 javax.naming.directory.DirContext f2 = null;

	 public V element;

	 public static Foo3 instance;

	 public static Foo3 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module0418_public_tests_unittests.a.Foo2.create(input);
	 }

	 public String getName() {
	 	 return module0418_public_tests_unittests.a.Foo2.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module0418_public_tests_unittests.a.Foo2.getInstance().setName(getName());
	 	 return;
	 }

	 public V get() {
	 	 return (V)module0418_public_tests_unittests.a.Foo2.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (V)element;
	 	 module0418_public_tests_unittests.a.Foo2.getInstance().set(this.element);
	 }

	 public V call() throws Exception {
	 	 return (V)module0418_public_tests_unittests.a.Foo2.getInstance().call();
	 }
}
