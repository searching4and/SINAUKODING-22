package com.farhankoding.tokofarhan.service;

import com.farhankoding.tokofarhan.entity.Barang;

import java.util.List;

public interface BarangService {
    Barang save(Barang param);

    List<Barang> findAllData();

    Barang update(Barang param, Long id);

    Boolean delete(Long id);

    Barang findById(Long id);
}
