package com.eventstech.api.services;

import com.eventstech.api.domain.address.Address;
import com.eventstech.api.domain.event.Event;
import com.eventstech.api.domain.event.EventRequestDTO;
import com.eventstech.api.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address createAddress(EventRequestDTO data, Event event) {

        Address address = new Address();
        address.setCity(data.city());
        address.setUf(data.uf());
        address.setEvent(event);

        return this.addressRepository.save(address);
    }
}
