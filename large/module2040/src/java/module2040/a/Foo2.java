package module2040.a;

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
public abstract class Foo2<O> extends module2040.a.Foo0<O> implements module2040.a.IFoo2<O> {

	 javax.lang.model.AnnotatedConstruct f0 = null;
	 javax.management.Attribute f1 = null;
	 javax.naming.directory.DirContext f2 = null;

	 public O element;

	 public static Foo2 instance;

	 public static Foo2 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module2040.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module2040.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module2040.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public O get() {
	 	 return (O)module2040.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (O)element;
	 	 module2040.a.Foo0.getInstance().set(this.element);
	 }

	 public O call() throws Exception {
	 	 return (O)module2040.a.Foo0.getInstance().call();
	 }
}
