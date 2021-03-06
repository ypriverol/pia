//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.27 at 05:05:16 PM CEST 
//


package de.mpc.pia.modeller.execute.xmlparams;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="executableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="executablePath" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="cli" type="{}cliType" minOccurs="0"/>
 *         &lt;element name="logs" type="{}logCollectionType" minOccurs="0"/>
 *         &lt;element name="relocators" type="{}relocatorCollectionType" minOccurs="0"/>
 *         &lt;element name="PARAMETERS" type="{}PARAMETERSType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[A-Z][A-Za-z0-9]*"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="docurl" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "manual",
    "executableName",
    "executablePath",
    "cli",
    "logs",
    "relocators",
    "parameters"
})
@XmlRootElement(name = "tool")
public class CTDTool {

    private String description;
    private String manual;
    private String executableName;
    @XmlSchemaType(name = "anyURI")
    private String executablePath;
    private CliType cli;
    private LogCollectionType logs;
    private RelocatorCollectionType relocators;
    @XmlElement(name = "PARAMETERS", required = true)
    private PARAMETERSType parameters;
    @XmlAttribute(required = true)
    private String version;
    @XmlAttribute(required = true)
    private String name;
    @XmlAttribute
    @XmlSchemaType(name = "anyURI")
    private String docurl;
    @XmlAttribute
    private String category;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the manual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManual() {
        return manual;
    }

    /**
     * Sets the value of the manual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManual(String value) {
        this.manual = value;
    }

    /**
     * Gets the value of the executableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutableName() {
        return executableName;
    }

    /**
     * Sets the value of the executableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutableName(String value) {
        this.executableName = value;
    }

    /**
     * Gets the value of the executablePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutablePath() {
        return executablePath;
    }

    /**
     * Sets the value of the executablePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutablePath(String value) {
        this.executablePath = value;
    }

    /**
     * Gets the value of the cli property.
     * 
     * @return
     *     possible object is
     *     {@link CliType }
     *     
     */
    public CliType getCli() {
        return cli;
    }

    /**
     * Sets the value of the cli property.
     * 
     * @param value
     *     allowed object is
     *     {@link CliType }
     *     
     */
    public void setCli(CliType value) {
        this.cli = value;
    }

    /**
     * Gets the value of the logs property.
     * 
     * @return
     *     possible object is
     *     {@link LogCollectionType }
     *     
     */
    public LogCollectionType getLogs() {
        return logs;
    }

    /**
     * Sets the value of the logs property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogCollectionType }
     *     
     */
    public void setLogs(LogCollectionType value) {
        this.logs = value;
    }

    /**
     * Gets the value of the relocators property.
     * 
     * @return
     *     possible object is
     *     {@link RelocatorCollectionType }
     *     
     */
    public RelocatorCollectionType getRelocators() {
        return relocators;
    }

    /**
     * Sets the value of the relocators property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelocatorCollectionType }
     *     
     */
    public void setRelocators(RelocatorCollectionType value) {
        this.relocators = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link PARAMETERSType }
     *     
     */
    public PARAMETERSType getPARAMETERS() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARAMETERSType }
     *     
     */
    public void setPARAMETERS(PARAMETERSType value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the docurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocurl() {
        return docurl;
    }

    /**
     * Sets the value of the docurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocurl(String value) {
        this.docurl = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        if (category == null) {
            return "";
        } else {
            return category;
        }
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }
}
