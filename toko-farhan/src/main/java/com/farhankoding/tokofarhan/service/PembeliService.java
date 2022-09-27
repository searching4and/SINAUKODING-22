package com.farhankoding.tokofarhan.service;

import com.farhankoding.tokofarhan.entity.Pembeli;

import java.util.List;

public interface PembeliService {

    Pembeli save(Pembeli param);

    List<Pembeli> findAllData();

    Pembeli update(Pembeli param, Long id);

    Boolean delete(Long id);

    Pembeli findById(Long id);

}
