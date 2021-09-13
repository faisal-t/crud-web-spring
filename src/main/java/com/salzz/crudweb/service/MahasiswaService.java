package com.salzz.crudweb.service;

import com.salzz.crudweb.model.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

//public interface MahasiswaService {
//    List<Mahasiswa> listmahasiswa();
//}
@Repository
public interface MahasiswaService extends JpaRepository<Mahasiswa,Integer> {


}
