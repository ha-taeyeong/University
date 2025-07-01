package com.example.myproject.service;

import com.example.myproject.dao.ContactDao;
import com.example.myproject.dto.Contact;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// ContactService.java
@Service
@RequiredArgsConstructor
public class ContactService {
    private final ContactDao contactDao;

    public void saveContact(Contact contact) {
        contactDao.save(contact);
    }
}
