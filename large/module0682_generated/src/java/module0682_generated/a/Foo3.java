package module0682_generated.a;

import javax.lang.model.*;
import javax.management.*;
import javax.naming.directory.*;

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
public abstract class Foo3<F> extends module0682_generated.a.Foo2<F> implements module0682_generated.a.IFoo3<F> {

	 java.util.zip.Deflater f0 = null;
	 javax.annotation.processing.Completion f1 = null;
	 javax.lang.model.AnnotatedConstruct f2 = null;

	 public F element;

	 public static Foo3 instance;

	 public static Foo3 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module0682_generated.a.Foo2.create(input);
	 }

	 public String getName() {
	 	 return module0682_generated.a.Foo2.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module0682_generated.a.Foo2.getInstance().setName(getName());
	 	 return;
	 }

	 public F get() {
	 	 return (F)module0682_generated.a.Foo2.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (F)element;
	 	 module0682_generated.a.Foo2.getInstance().set(this.element);
	 }

	 public F call() throws Exception {
	 	 return (F)module0682_generated.a.Foo2.getInstance().call();
	 }
}
