package module2202_public.a;

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
public abstract class Foo3<L> extends module2202_public.a.Foo2<L> implements module2202_public.a.IFoo3<L> {

	 javax.lang.model.AnnotatedConstruct f0 = null;
	 javax.management.Attribute f1 = null;
	 javax.naming.directory.DirContext f2 = null;

	 public L element;

	 public static Foo3 instance;

	 public static Foo3 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module2202_public.a.Foo2.create(input);
	 }

	 public String getName() {
	 	 return module2202_public.a.Foo2.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module2202_public.a.Foo2.getInstance().setName(getName());
	 	 return;
	 }

	 public L get() {
	 	 return (L)module2202_public.a.Foo2.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (L)element;
	 	 module2202_public.a.Foo2.getInstance().set(this.element);
	 }

	 public L call() throws Exception {
	 	 return (L)module2202_public.a.Foo2.getInstance().call();
	 }
}
