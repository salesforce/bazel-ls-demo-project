package module0647_public.a;

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
public abstract class Foo3<B> extends module0647_public.a.Foo2<B> implements module0647_public.a.IFoo3<B> {

	 java.rmi.Remote f0 = null;
	 java.nio.file.FileStore f1 = null;
	 java.sql.Array f2 = null;

	 public B element;

	 public static Foo3 instance;

	 public static Foo3 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return module0647_public.a.Foo2.create(input);
	 }

	 public String getName() {
	 	 return module0647_public.a.Foo2.getInstance().getName();
	 }

	 public void setName(String string) {
	 	 module0647_public.a.Foo2.getInstance().setName(getName());
	 	 return;
	 }

	 public B get() {
	 	 return (B)module0647_public.a.Foo2.getInstance().get();
	 }

	 public void set(Object element) {
	 	 this.element = (B)element;
	 	 module0647_public.a.Foo2.getInstance().set(this.element);
	 }

	 public B call() throws Exception {
	 	 return (B)module0647_public.a.Foo2.getInstance().call();
	 }
}
