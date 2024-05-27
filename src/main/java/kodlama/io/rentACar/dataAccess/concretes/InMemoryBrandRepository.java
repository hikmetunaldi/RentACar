package kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

//InMemeory bellekten çalışcağımızı gösterir veritabanına gitmicez yani

@Repository //Bu sınıf bir DataAccess nesnesidir
public class InMemoryBrandRepository implements BrandRepository {

	List<Brand> brands;
	
	//Bunu yaparak birisi InMemoryBrandRepository'i çağırdığında çalışıcak
	//İçindekinden dolayıda elimizde boş bir arraylist var
	public InMemoryBrandRepository() {
		brands = new ArrayList<Brand>();
		brands.add(new Brand("BMW", 1));
		brands.add(new Brand("Mercedes", 2));
		brands.add(new Brand("Audi", 3));
		brands.add(new Brand("Fiat", 4));
		brands.add(new Brand("Renault", 5));
		;
	}

	@Override
	public List<Brand> getAll() {
		
		return brands;
	}

}
