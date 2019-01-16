/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensat.service;

import com.ensat.dao.UserDao;
import com.ensat.model.Utilisateur;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author admin
 */

@Service

public class UtilisateurServiceImp implements Services{

   
 private UserDao d;

    public UserDao getD() {
        return d;
    }

    public void setD(UserDao d) {
        this.d = d;
    }
    
    //public List<Utilisateur> all() {
      //  return d.getAllelements();
    //}

    @Override
    @Transactional
    public void adduser(Utilisateur obj) {
     
        d.addUser(obj);
    }
   
}
