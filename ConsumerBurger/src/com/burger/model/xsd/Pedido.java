/**
 * Pedido.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.burger.model.xsd;

public class Pedido  implements java.io.Serializable {
    private java.lang.Boolean estadoPedido;

    private java.lang.String fechaPedido;

    private java.lang.Integer idPedido;

    private java.lang.String nombreCliente;

    private java.lang.Double totalPedido;

    public Pedido() {
    }

    public Pedido(
           java.lang.Boolean estadoPedido,
           java.lang.String fechaPedido,
           java.lang.Integer idPedido,
           java.lang.String nombreCliente,
           java.lang.Double totalPedido) {
           this.estadoPedido = estadoPedido;
           this.fechaPedido = fechaPedido;
           this.idPedido = idPedido;
           this.nombreCliente = nombreCliente;
           this.totalPedido = totalPedido;
    }


    /**
     * Gets the estadoPedido value for this Pedido.
     * 
     * @return estadoPedido
     */
    public java.lang.Boolean getEstadoPedido() {
        return estadoPedido;
    }


    /**
     * Sets the estadoPedido value for this Pedido.
     * 
     * @param estadoPedido
     */
    public void setEstadoPedido(java.lang.Boolean estadoPedido) {
        this.estadoPedido = estadoPedido;
    }


    /**
     * Gets the fechaPedido value for this Pedido.
     * 
     * @return fechaPedido
     */
    public java.lang.String getFechaPedido() {
        return fechaPedido;
    }


    /**
     * Sets the fechaPedido value for this Pedido.
     * 
     * @param fechaPedido
     */
    public void setFechaPedido(java.lang.String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }


    /**
     * Gets the idPedido value for this Pedido.
     * 
     * @return idPedido
     */
    public java.lang.Integer getIdPedido() {
        return idPedido;
    }


    /**
     * Sets the idPedido value for this Pedido.
     * 
     * @param idPedido
     */
    public void setIdPedido(java.lang.Integer idPedido) {
        this.idPedido = idPedido;
    }


    /**
     * Gets the nombreCliente value for this Pedido.
     * 
     * @return nombreCliente
     */
    public java.lang.String getNombreCliente() {
        return nombreCliente;
    }


    /**
     * Sets the nombreCliente value for this Pedido.
     * 
     * @param nombreCliente
     */
    public void setNombreCliente(java.lang.String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }


    /**
     * Gets the totalPedido value for this Pedido.
     * 
     * @return totalPedido
     */
    public java.lang.Double getTotalPedido() {
        return totalPedido;
    }


    /**
     * Sets the totalPedido value for this Pedido.
     * 
     * @param totalPedido
     */
    public void setTotalPedido(java.lang.Double totalPedido) {
        this.totalPedido = totalPedido;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pedido)) return false;
        Pedido other = (Pedido) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.estadoPedido==null && other.getEstadoPedido()==null) || 
             (this.estadoPedido!=null &&
              this.estadoPedido.equals(other.getEstadoPedido()))) &&
            ((this.fechaPedido==null && other.getFechaPedido()==null) || 
             (this.fechaPedido!=null &&
              this.fechaPedido.equals(other.getFechaPedido()))) &&
            ((this.idPedido==null && other.getIdPedido()==null) || 
             (this.idPedido!=null &&
              this.idPedido.equals(other.getIdPedido()))) &&
            ((this.nombreCliente==null && other.getNombreCliente()==null) || 
             (this.nombreCliente!=null &&
              this.nombreCliente.equals(other.getNombreCliente()))) &&
            ((this.totalPedido==null && other.getTotalPedido()==null) || 
             (this.totalPedido!=null &&
              this.totalPedido.equals(other.getTotalPedido())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getEstadoPedido() != null) {
            _hashCode += getEstadoPedido().hashCode();
        }
        if (getFechaPedido() != null) {
            _hashCode += getFechaPedido().hashCode();
        }
        if (getIdPedido() != null) {
            _hashCode += getIdPedido().hashCode();
        }
        if (getNombreCliente() != null) {
            _hashCode += getNombreCliente().hashCode();
        }
        if (getTotalPedido() != null) {
            _hashCode += getTotalPedido().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Pedido.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.burger.com/xsd", "Pedido"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoPedido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.burger.com/xsd", "estadoPedido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaPedido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.burger.com/xsd", "fechaPedido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPedido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.burger.com/xsd", "idPedido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.burger.com/xsd", "nombreCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPedido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.burger.com/xsd", "totalPedido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
