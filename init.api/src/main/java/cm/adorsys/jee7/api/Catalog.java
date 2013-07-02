/**
 * 
 */
package cm.adorsys.jee7.api;

import java.util.Date;

/**
 * @author bwa
 *
 */
public class Catalog {
	private Long id;
	private String name;
	private int size;
	private Date creationDate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Catalog [id=" + id + ", name=" + name + ", size=" + size
				+ ", creationDate=" + creationDate + "]";
	}
	
}
