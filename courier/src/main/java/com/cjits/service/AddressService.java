
        package com.cjits.service;

import com.cjits.entity.Address;

import java.util.List;

    public interface AddressService {

        List<Address> getAllAddresses();

        Address getAddressById(Long id);

        Address createAddress(Address address);

        Address updateAddress(Long id, Address updatedAddress);

        void deleteAddress(Long id);
    }

