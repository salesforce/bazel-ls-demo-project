package module1220.a;

import java.beans.beancontext.*;
import java.io.*;
import java.rmi.*;

/**
 * Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut 
 * labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. 
 * Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. 
 *
 * @see java.io.File
 * @see java.rmi.Remote
 * @see java.nio.file.FileStore
 */
@SuppressWarnings("all")
public abstract class Foo3<Z> extends module1220.a.Foo2<Z> implements module1220.a.IFoo3<Z> {

	 java.sql.Array f0 = null;
	 java.util.logging.Filter f1 = null;
	 java.util.zip.Deflater f2 = null;

	 public Z element;

	 public static Foo3 instance;

	 public static Foo3 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module1220.a.Foo2.create(input);
	 }

	 public String getName() {
	 	 return module1220.a.Foo2.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module1220.a.Foo2.getInstance().setName(getName());
	 	 return;
	 }

	 public Z get() {
	 	 return (Z)module1220.a.Foo2.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (Z)element;
	 	 module1220.a.Foo2.getInstance().set(this.element);
	 }

	 public Z call() throws Exception {
	 	 return (Z)module1220.a.Foo2.getInstance().call();
	 }
}
