//package com.salzz.crudweb.dao;
//
//import com.salzz.crudweb.model.Mahasiswa;
//import com.salzz.crudweb.service.MahasiswaService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class MahasiswaDao implements MahasiswaService {
//
//    private EntityManagerFactory emf;
//
//    @Autowired
//    public void setEmf(EntityManagerFactory emf) {
//        this.emf = emf;
//    }
//
//    @Override
//    public List<Mahasiswa> listmahasiswa() {
//        List<Mahasiswa> mhs = new ArrayList<>();
//
//
//        return em.createQuery("from mahasiswa",Mahasiswa.class).getResultList();
//    }
//}
