
      package com.dapeng.springboot.api.service;

      import com.github.dapeng.core.Processor;
      import com.github.dapeng.core.Service;
      import com.github.dapeng.core.SoaGlobalTransactional;

      /**
       * Autogenerated by Dapeng-Code-Generator (2.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING

      * 
      **/
      
      @Service(name="com.dapeng.springboot.api.service.UserService",version = "1.0.0")
      @Processor(className = "com.dapeng.springboot.api.UserServiceCodec$Processor")
      public interface UserService {
      
          /**
          * 
          **/
          
          
            
            String sayHello( String name) throws com.github.dapeng.core.SoaException;
          
        
          /**
          * 
          **/
          
          
            
            com.dapeng.springboot.api.domain.User getUser( String id) throws com.github.dapeng.core.SoaException;
          
        
    }
    