package module1349_public.a;

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
public abstract class Foo3<J> extends module1349_public.a.Foo2<J> implements module1349_public.a.IFoo3<J> {

	 javax.lang.model.AnnotatedConstruct f0 = null;
	 javax.management.Attribute f1 = null;
	 javax.naming.directory.DirContext f2 = null;

	 public J element;

	 public static Foo3 instance;

	 public static Foo3 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module1349_public.a.Foo2.create(input);
	 }

	 public String getName() {
	 	 return module1349_public.a.Foo2.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module1349_public.a.Foo2.getInstance().setName(getName());
	 	 return;
	 }

	 public J get() {
	 	 return (J)module1349_public.a.Foo2.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (J)element;
	 	 module1349_public.a.Foo2.getInstance().set(this.element);
	 }

	 public J call() throws Exception {
	 	 return (J)module1349_public.a.Foo2.getInstance().call();
	 }
}
