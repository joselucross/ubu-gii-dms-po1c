package controller;
import java.util.*;

public interface Controller<E> {
	
	Collection<E> getList();
	E getElement(int index);

}
