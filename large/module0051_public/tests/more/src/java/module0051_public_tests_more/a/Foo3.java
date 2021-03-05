package module0051_public_tests_more.a;

import java.util.zip.*;
import javax.annotation.processing.*;
import javax.lang.model.*;

/**
 * Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut 
 * labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. 
 * Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. 
 *
 * @see java.awt.datatransfer.DataFlavor
 * @see java.beans.beancontext.BeanContext
 * @see java.io.File
 */
@SuppressWarnings("all")
public abstract class Foo3<X> extends module0051_public_tests_more.a.Foo2<X> implements module0051_public_tests_more.a.IFoo3<X> {

	 java.rmi.Remote f0 = null;
	 java.nio.file.FileStore f1 = null;
	 java.sql.Array f2 = null;

	 public X element;

	 public static Foo3 instance;

	 public static Foo3 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module0051_public_tests_more.a.Foo2.create(input);
	 }

	 public String getName() {
	 	 return module0051_public_tests_more.a.Foo2.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module0051_public_tests_more.a.Foo2.getInstance().setName(getName());
	 	 return;
	 }

	 public X get() {
	 	 return (X)module0051_public_tests_more.a.Foo2.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (X)element;
	 	 module0051_public_tests_more.a.Foo2.getInstance().set(this.element);
	 }

	 public X call() throws Exception {
	 	 return (X)module0051_public_tests_more.a.Foo2.getInstance().call();
	 }
}
