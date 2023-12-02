package com.thoughtmechanix.licenses.services;

import com.thoughtmechanix.licenses.model.License;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LicenseService {
    public License getLicense(String licenseId){
        return new License()
                .withId(licenseId)
                .withOrganizationId( UUID.randomUUID().toString() )
                .withProductName("Test Product Name")
                .withLicenseType("PerSeat");
    }

    /**
     * todo: This function is not used, but ib the future will be.
     */
    public void saveLicense(License license){
        // an empty function
        // add some functionality
    }

    /**
     * todo: This function is not used, but ib the future will be.
     */
    public void updateLicense(License license){
        // an empty function
    }

    /**
     * todo: This function is not used, but ib the future will be.
     */
    public void deleteLicense(License license){
        // an empty function
    }
}
