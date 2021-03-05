package module0465_public_tests_unittests.a;

import javax.management.*;
import javax.naming.directory.*;
import javax.net.ssl.*;

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
public abstract class Foo2<S> extends module0465_public_tests_unittests.a.Foo0<S> implements module0465_public_tests_unittests.a.IFoo2<S> {

	 javax.lang.model.AnnotatedConstruct f0 = null;
	 javax.management.Attribute f1 = null;
	 javax.naming.directory.DirContext f2 = null;

	 public S element;

	 public static Foo2 instance;

	 public static Foo2 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module0465_public_tests_unittests.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module0465_public_tests_unittests.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module0465_public_tests_unittests.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public S get() {
	 	 return (S)module0465_public_tests_unittests.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (S)element;
	 	 module0465_public_tests_unittests.a.Foo0.getInstance().set(this.element);
	 }

	 public S call() throws Exception {
	 	 return (S)module0465_public_tests_unittests.a.Foo0.getInstance().call();
	 }
}
