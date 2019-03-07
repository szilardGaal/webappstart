package com.codecool.web.service;


import com.codecool.web.model.Address;

import java.util.ArrayList;
import java.util.List;

public final class AddressService {

    private List<Address> addresses = new ArrayList<>();

    public void addAddress(Address address) {
        addresses.add(address);
    }

    public List<Address> getAddresses() {
        return addresses;
    }
}
