package module2133.a;

import java.awt.datatransfer.*;
import java.beans.beancontext.*;
import java.io.*;

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
public abstract class Foo0<A> implements module2133.a.IFoo0<A> {

	 java.rmi.Remote f0 = null;
	 java.nio.file.FileStore f1 = null;
	 java.sql.Array f2 = null;

public A element;
public static Foo0 instance;

	 public static Foo0 getInstance() {
	 	 return instance;
	 }

	 public static <T> T create(java.util.List<T> input) {
	 	 return null;
	 }

	 public String getName() {
	 	 return element.toString();
	 }

	 public void setName(String string) {
	 	 return;
	 }

	 public A get() {
	 	 return element;
	 }

	 public void set(Object element) {
	 	 this.element = (A)element;
	 }

	 public A call() throws Exception {
	 	 return (A)getInstance().call();
	 }
}
