package kodlama.io.rentACar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.dataAccess.concretes.InMemoryBrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;

@Service //Bu sınıf bir business nesnesidir
public class BrandManager implements BrandService {
	private BrandRepository brandRepository;
	
	@Autowired
	//Burdanda işimiz daha bitmediği için git seni implement edeni newle diyip 
	//brandRepository e gidiyoruz
	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}


	@Override
	public List<Brand> getAll() {
		//iş kuralları
		return brandRepository.getAll();
	}

}
