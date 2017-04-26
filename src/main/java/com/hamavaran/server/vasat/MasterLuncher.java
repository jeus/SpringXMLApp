/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hamavaran.server.vasat;

import com.hamavaran.server.vasat.test.Luncher;
import com.hamavaran.server.vasat.test1.Luncher1;

/**
 *
 * @author jeus
 */
public class MasterLuncher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Thread thread = new Thread(new Luncher());
      Thread thread1 = new Thread(new Luncher1());
      
      thread.start();
      thread1.start();
      
    }
    
}
