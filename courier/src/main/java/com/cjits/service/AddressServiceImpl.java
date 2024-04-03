
    package com.cjits.service;
import com.cjits.entity.Address;
import com.cjits.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

    @Service
    public class AddressServiceImpl implements AddressService {

        @Autowired
        private AddressRepository addressRepository;

        @Override
        public List<Address> getAllAddresses() {
            return addressRepository.findAll();
        }

        @Override
        public Address getAddressById(Long id) {
            Optional<Address> optionalAddress = addressRepository.findById(id);
            return optionalAddress.orElse(null);
        }

        @Override
        public Address createAddress(Address address) {
            return addressRepository.save(address);
        }

        @Override
        public Address updateAddress(Long id, Address updatedAddress) {
            if (addressRepository.existsById(id)) {
                updatedAddress.setId(id);
                return addressRepository.save(updatedAddress);
            }
            return null;
        }

        @Override
        public void deleteAddress(Long id) {
            addressRepository.deleteById(id);
        }
    }

