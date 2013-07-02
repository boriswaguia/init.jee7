package cm.adorsys.jee7.init.rest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cm.adorsys.jee7.api.Catalog;

/**
 * 
 * @author bwa
 *
 */
@Path("/catalog")
public class CatalogRestService implements Serializable {
	
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public Collection<Catalog> getCatalogs(){
		return generateCatalogs(5);
	}

	@Produces(MediaType.APPLICATION_JSON)
	@GET
	@Path("{id}")
	public Catalog getCatalog(@PathParam("id")int id){
		return generateCatalog(id);
	}
	
	private List<Catalog> generateCatalogs(int size){
		List<Catalog> catalogs = new ArrayList<Catalog>();
		if(size == 1){
			Catalog catalog = generateCatalog(size);
			catalogs.add(catalog);
			return catalogs;
		}
		for (int i = 0; i < size; i++) {

			Catalog catalog = generateCatalog(i);
			catalogs.add(catalog);
		}
		return catalogs;
	}

	private Catalog generateCatalog(int id) {
		Catalog catalog = new Catalog();
		catalog.setCreationDate(new Date());
		catalog.setId(new Long(1));
		catalog.setName("Catalog - 1");
		catalog.setSize(10);
		return catalog;
	}
}
