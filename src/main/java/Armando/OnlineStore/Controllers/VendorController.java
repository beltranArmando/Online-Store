package Armando.OnlineStore.Controllers;

import Armando.OnlineStore.Services.VendorService;
import Armando.OnlineStore.entities.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static Armando.OnlineStore.Utils.Constants.*;

@RestController
@RequestMapping(value = VER_API + "vendor")
public class VendorController {
    @Autowired
    private VendorService vendorService;

    @PostMapping(value = "/create")
    public Vendor createVendor(@RequestBody Vendor vendor){
        return vendorService.createVendor(vendor);
    }

    // Get all vendors
    @GetMapping(value = "/get_all")
    public List<Vendor> getAllVendors() {
        return vendorService.getAllVendors();
    }

    // Get vendor by ID
    @GetMapping("/get_by_id/{id}")
    public Optional<Vendor> getVendorsById(@PathVariable Long id) {
        return vendorService.getVendorById(id);
    }

    // Update user by ID
    @PutMapping("/update/{id}")
    public Vendor updateVendor(@PathVariable Long id, @RequestBody Vendor vendorDetails) {
        return vendorService.updateVendor(id, vendorDetails);
    }

    // Delete all vendors
    /*@DeleteMapping
    public String deleteAllUsers() {
        userService.deleteAllUsers();
        return "All users have been deleted successfully.";
    }*/

    // Delete vendor by ID
    @DeleteMapping("/delete/{id}")
    public void deleteVendor(@PathVariable Long id) {
        vendorService.deleteVendorById(id);
    }
}
