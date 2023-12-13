package Armando.OnlineStore.Services;

import Armando.OnlineStore.Repositories.VendorRepository;
import Armando.OnlineStore.entities.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Optional;

@Service
public class VendorService {
    @Autowired
    private VendorRepository vendorRepository;

    //Create a new vendor
    public Vendor createVendor(Vendor vendor){

        OffsetDateTime now = Instant.now().atOffset(ZoneOffset.UTC);
        vendor.setCreatedDate(now);
        return vendorRepository.save(vendor);
    }

    //Get all Vendors
    public List<Vendor> getAllVendors(){
        return vendorRepository.findAll();
    }

    //Get vendor By ID
    public Optional<Vendor> getVendorById(Long id){
        return vendorRepository.findById(id);
    }

    //update vendor
    public Vendor updateVendor(Long id, Vendor vendorDetails){
        Optional<Vendor> vendor = vendorRepository.findById(id);
        if(vendor.isPresent()){
          vendor.get().setName(vendorDetails.getName());
          vendor.get().setDescription(vendorDetails.getDescription());
          vendor.get().setUpdatedDate(Instant.now().atOffset(ZoneOffset.UTC));
          return vendorRepository.save(vendor.get());
        }
        return null;
    }

    //Delete vendor by ID
    public void deleteVendorById(Long id){
        /*Optional<Vendor> vendor = vendorRepository.findById(id);
        if(vendor.isEmpty()){
            return "Vendor with id " + id + " does not exist.";
        }*/
        vendorRepository.deleteById(id);
    }


}
