package module2097_public_tests_more.a;

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
public abstract class Foo1<J> extends module2097_public_tests_more.a.Foo0<J> implements module2097_public_tests_more.a.IFoo1<J> {

	 java.rmi.Remote f0 = null;
	 java.nio.file.FileStore f1 = null;
	 java.sql.Array f2 = null;

	 public J element;

	 public static Foo1 instance;

	 public static Foo1 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module2097_public_tests_more.a.Foo0.create(input);
	 }

	 public String getName() {
	 	 return module2097_public_tests_more.a.Foo0.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module2097_public_tests_more.a.Foo0.getInstance().setName(getName());
	 	 return;
	 }

	 public J get() {
	 	 return (J)module2097_public_tests_more.a.Foo0.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (J)element;
	 	 module2097_public_tests_more.a.Foo0.getInstance().set(this.element);
	 }

	 public J call() throws Exception {
	 	 return (J)module2097_public_tests_more.a.Foo0.getInstance().call();
	 }
}
