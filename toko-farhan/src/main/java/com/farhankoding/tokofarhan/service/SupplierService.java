package com.farhankoding.tokofarhan.service;

import com.farhankoding.tokofarhan.entity.Supplier;

import java.util.List;

public interface SupplierService {
    Supplier save(Supplier param);

    List<Supplier>findAllData();

    Supplier update(Supplier param, Long id);

    Boolean delete(Long id);

    Supplier findById(Long id);
}
