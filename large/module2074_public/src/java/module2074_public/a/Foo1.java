package module2074_public.a;

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
public abstract class Foo1<R> extends module2074_public.a.Foo0<R> implements module2074_public.a.IFoo1<R> {

	 javax.lang.model.AnnotatedConstruct f0 = null;
	 javax.management.Attribute f1 = null;
	 javax.naming.directory.DirContext f2 = null;

	 public R element;

	 public static Foo1 instance;

	 public static Foo1 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module2074_public.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module2074_public.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module2074_public.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public R get() {
	 	 return (R)module2074_public.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (R)element;
	 	 module2074_public.a.Foo0.getInstance().set(this.element);
	 }

	 public R call() throws Exception {
	 	 return (R)module2074_public.a.Foo0.getInstance().call();
	 }
}
