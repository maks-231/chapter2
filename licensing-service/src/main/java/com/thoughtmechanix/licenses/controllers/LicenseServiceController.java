package com.thoughtmechanix.licenses.controllers;

import com.thoughtmechanix.licenses.model.License;
import com.thoughtmechanix.licenses.services.LicenseService;
import lombok.extern.log4j.Log4j2;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * LicenseServiceController class contains endpoints
 */
@RestController
@RequestMapping(value="v1/organizations/{organizationId}/licenses")
@Log4j2
public class LicenseServiceController {
    // some comment
    @Resource
    private LicenseService licenseService;

    /**
     * todo: This function is not used, but in the future will be.
     * The function receives licenceId and saved it in to the database
     */
    @RequestMapping(value="{licenseId}",method = RequestMethod.POST)
    public String saveLicenses( @PathVariable("licenseId") String licenseId) {
        log.info("Saving licence function started");
        Assert.isNull(licenseId, "Object licenseId cannot be null");
        try{
            //someService.save(licenseId);
        } catch (Exception e){
            log.warn("licenseId was not saved");
        }
        log.info("Saving licence function ended");
        // todo: Deleting functionality should be added.
        return String.format("REST API POST");
    }

    /**
     * todo: This function is not used, but id the future will be.
     */
    @RequestMapping(value="{licenseId}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteLicenses( @PathVariable("licenseId") String licenseId) {
        // todo: Deleting functionality should be added.
        return String.format("REST API DELETE");
    }

    /**
     * The function generated nd returns License DTO
     * @param organizationId
     * @param licenseId
     * @return
     */
    @RequestMapping(value="/{licenseId}",method = RequestMethod.GET)
    public License getLicenses( @PathVariable("organizationId") String organizationId,
                                @PathVariable("licenseId") String licenseId) {

        return new License()
                .withId(licenseId)
                .withOrganizationId(organizationId)
                .withProductName("IPA")
                .withLicenseType("Beer");
    }

    /**
     * todo: This function is not used, but ib the future will be.
     */
    @RequestMapping(value="{licenseId}",method = RequestMethod.PUT)
    public String updateLicenses( @PathVariable("licenseId") String licenseId) {
        return String.format("REST API GET");
    }
}
