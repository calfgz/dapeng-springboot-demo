 package com.dapeng.springboot.api.domain.serializer;
        import com.dapeng.springboot.api.domain.serializer.*;

        import com.github.dapeng.core.*;
        import com.github.dapeng.org.apache.thrift.*;
        import com.github.dapeng.org.apache.thrift.protocol.*;

        import java.util.Optional;
        import java.util.concurrent.CompletableFuture;
        import java.util.concurrent.Future;

        /**
        * Autogenerated by Dapeng-Code-Generator (2.2.0)
        *
        * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
        *
        **/
        public class UserSerializer implements BeanSerializer<com.dapeng.springboot.api.domain.User>{
        
      @Override
      public com.dapeng.springboot.api.domain.User read(TProtocol iprot) throws TException{

      com.dapeng.springboot.api.domain.User bean = new com.dapeng.springboot.api.domain.User();
      com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING){
              String elem0 = iprot.readString();
       bean.setId(Optional.of(elem0));
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 2:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING){
              String elem0 = iprot.readString();
       bean.setName(Optional.of(elem0));
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 3:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.I32){
               int elem0 = iprot.readI32();
       bean.setAge(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
          
            default:
            com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      validate(bean);
      return bean;
    }
    
      @Override
      public void write(com.dapeng.springboot.api.domain.User bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("User"));

      if(bean.getId().isPresent()){
              oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("id", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 1));
              String elem0 = bean.getId().get();
              oprot.writeString(elem0);
              
            }
            if(bean.getName().isPresent()){
              oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("name", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 2));
              String elem1 = bean.getName().get();
              oprot.writeString(elem1);
              
            }
            
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("age", com.github.dapeng.org.apache.thrift.protocol.TType.I32, (short) 3));
            Integer elem2 = bean.getAge();
            oprot.writeI32(elem2);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(com.dapeng.springboot.api.domain.User bean) throws TException{
      
    }
    
        @Override
        public String toString(com.dapeng.springboot.api.domain.User bean)
        {return bean == null ? "null" : bean.toString();}
      }
      

      