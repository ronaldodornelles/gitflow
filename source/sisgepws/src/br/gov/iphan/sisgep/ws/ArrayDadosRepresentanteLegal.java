
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayDadosRepresentanteLegal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayDadosRepresentanteLegal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dadosRepresentanteLegal" type="{http://tipo.servico.wssiapenet}ArrayOfDadosRepresentanteLegal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayDadosRepresentanteLegal", propOrder = {
    "dadosRepresentanteLegal"
})
public class ArrayDadosRepresentanteLegal {

    @XmlElementRef(name = "dadosRepresentanteLegal", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDadosRepresentanteLegal> dadosRepresentanteLegal;

    /**
     * Gets the value of the dadosRepresentanteLegal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosRepresentanteLegal }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDadosRepresentanteLegal> getDadosRepresentanteLegal() {
        return dadosRepresentanteLegal;
    }

    /**
     * Sets the value of the dadosRepresentanteLegal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosRepresentanteLegal }{@code >}
     *     
     */
    public void setDadosRepresentanteLegal(JAXBElement<ArrayOfDadosRepresentanteLegal> value) {
        this.dadosRepresentanteLegal = ((JAXBElement<ArrayOfDadosRepresentanteLegal> ) value);
    }

}
