package org.example.db;

import java.util.List;

public interface Dao<E extends EntityBase> {

	public void save(E obj);
	public void delete(E obj);
	public void update(E obj);
	public List<E> getAll();
	public E get(int id);
}
