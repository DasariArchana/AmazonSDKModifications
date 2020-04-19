
package com.amazonservices.mws.products.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * <p>
 * Java class for ItemAttributesType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ItemAttributesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Actor" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Artist" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AspectRatio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AudienceRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Author" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BackFinding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BandMaterialType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Binding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BlurayRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CEROAgeRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChainType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaspType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CPUManufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CPUSpeed" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}DecimalWithUnits" minOccurs="0"/>
 *         &lt;element name="CPUType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Creator" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}CreatorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Director" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DisplaySize" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}DecimalWithUnits" minOccurs="0"/>
 *         &lt;element name="Edition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EpisodeSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESRBAgeRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Feature" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Flavor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Format" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GemType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Genre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GolfClubFlex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GolfClubLoft" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}DecimalWithUnits" minOccurs="0"/>
 *         &lt;element name="HandOrientation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HardDiskInterface" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HardDiskSize" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}DecimalWithUnits" minOccurs="0"/>
 *         &lt;element name="HardwarePlatform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HazardousMaterialType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemDimensions" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}DimensionType" minOccurs="0"/>
 *         &lt;element name="IsAdultProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsAutographed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsEligibleForTradeIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMemorabilia" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IssuesPerYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Languages" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}LanguageType" minOccurs="0"/>
 *         &lt;element name="LegalDisclaimer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListPrice" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}Price" minOccurs="0"/>
 *         &lt;element name="Manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManufacturerMaximumAge" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}DecimalWithUnits" minOccurs="0"/>
 *         &lt;element name="ManufacturerMinimumAge" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}DecimalWithUnits" minOccurs="0"/>
 *         &lt;element name="ManufacturerPartsWarrantyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaterialType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaximumResolution" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}DecimalWithUnits" minOccurs="0"/>
 *         &lt;element name="MediaType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MetalStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MetalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfDiscs" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfIssues" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfItems" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfPages" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfTracks" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="OperatingSystem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OpticalZoom" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}DecimalWithUnits" minOccurs="0"/>
 *         &lt;element name="PackageDimensions" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}DimensionType" minOccurs="0"/>
 *         &lt;element name="PackageQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PegiRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Platform" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProcessorCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="ProductGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductTypeSubcategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublicationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Publisher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReleaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RingSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RunningTime" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}DecimalWithUnits" minOccurs="0"/>
 *         &lt;element name="ShaftMaterial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Scent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SeasonSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SeikodoProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SizePerPearl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SmallImage" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}Image" minOccurs="0"/>
 *         &lt;element name="Studio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubscriptionLength" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}NonNegativeIntegerWithUnits" minOccurs="0"/>
 *         &lt;element name="SystemMemorySize" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}DecimalWithUnits" minOccurs="0"/>
 *         &lt;element name="SystemMemoryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TheatricalReleaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalDiamondWeight" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}DecimalWithUnits" minOccurs="0"/>
 *         &lt;element name="TotalGemWeight" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}DecimalWithUnits" minOccurs="0"/>
 *         &lt;element name="Warranty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEEETaxValue" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}Price" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemAttributesType", propOrder = { "ns2:actor", "ns2:artist", "ns2:aspectRatio", "ns2:audienceRating", "ns2:author",
		"ns2:backFinding", "ns2:bandMaterialType", "ns2:binding", "ns2:blurayRegion", "ns2:brand", "ns2:ceroAgeRating", "ns2:chainType",
		"ns2:claspType", "color", "cpuManufacturer", "cpuSpeed", "cpuType", "creator", "department", "director",
		"displaySize", "edition", "episodeSequence", "esrbAgeRating", "feature", "flavor", "format", "gemType", "genre",
		"golfClubFlex", "golfClubLoft", "handOrientation", "hardDiskInterface", "hardDiskSize", "hardwarePlatform",
		"hazardousMaterialType", "itemDimensions", "isAdultProduct", "isAutographed", "isEligibleForTradeIn",
		"isMemorabilia", "issuesPerYear", "itemPartNumber", "label", "languages", "legalDisclaimer", "listPrice",
		"manufacturer", "manufacturerMaximumAge", "manufacturerMinimumAge", "manufacturerPartsWarrantyDescription",
		"materialType", "maximumResolution", "mediaType", "metalStamp", "metalType", "model", "numberOfDiscs",
		"numberOfIssues", "numberOfItems", "numberOfPages", "numberOfTracks", "operatingSystem", "opticalZoom",
		"packageDimensions", "packageQuantity", "partNumber", "pegiRating", "platform", "processorCount",
		"productGroup", "productTypeName", "productTypeSubcategory", "publicationDate", "publisher", "regionCode",
		"releaseDate", "ringSize", "runningTime", "shaftMaterial", "scent", "seasonSequence", "seikodoProductCode",
		"size", "sizePerPearl", "smallImage", "studio", "subscriptionLength", "systemMemorySize", "systemMemoryType",
		"theatricalReleaseDate", "title", "totalDiamondWeight", "totalGemWeight", "warranty", "weeeTaxValue" })
@XmlRootElement(name = "ns2:ItemAttributesType")
public class ItemAttributesType extends AbstractMwsObject {

	public ItemAttributesType() {
		super();
	}
	
	@XmlElement(name = "Actor")
	private List<String> actor;
	@XmlElement(name = "Artist")
	private List<String> artist;
	@XmlElement(name = "AspectRatio")
	private String aspectRatio;
	@XmlElement(name = "AudienceRating")
	private String audienceRating;
	@XmlElement(name = "ns2:Author")
	private List<String> author;
	@XmlElement(name = "BackFinding")
	private String backFinding;
	@XmlElement(name = "BandMaterialType")
	private String bandMaterialType;
	@XmlElement(name = "Binding")
	private String binding;
	@XmlElement(name = "BlurayRegion")
	private String blurayRegion;
	@XmlElement(name = "Brand")
	private String brand;
	@XmlElement(name = "CEROAgeRating")
	private String ceroAgeRating;
	@XmlElement(name = "ChainType")
	private String chainType;
	@XmlElement(name = "ClaspType")
	private String claspType;
	@XmlElement(name = "Color")
	private String color;
	@XmlElement(name = "CPUManufacturer")
	private String cpuManufacturer;
	@XmlElement(name = "CPUSpeed")
	private DecimalWithUnits cpuSpeed;
	@XmlElement(name = "CPUType")
	private String cpuType;
	@XmlElement(name = "Creator")
	private List<CreatorType> creator;
	@XmlElement(name = "Department")
	private String department;
	@XmlElement(name = "Director")
	private List<String> director;
	@XmlElement(name = "DisplaySize")
	private DecimalWithUnits displaySize;
	@XmlElement(name = "Edition")
	private String edition;
	@XmlElement(name = "EpisodeSequence")
	private String episodeSequence;
	@XmlElement(name = "ESRBAgeRating")
	private String esrbAgeRating;
	@XmlElement(name = "Feature")
	private List<String> feature;
	@XmlElement(name = "Flavor")
	private String flavor;
	@XmlElement(name = "Format")
	private List<String> format;
	@XmlElement(name = "GemType")
	private List<String> gemType;
	@XmlElement(name = "Genre")
	private String genre;
	@XmlElement(name = "GolfClubFlex")
	private String golfClubFlex;
	@XmlElement(name = "GolfClubLoft")
	private DecimalWithUnits golfClubLoft;
	@XmlElement(name = "HandOrientation")
	private String handOrientation;
	@XmlElement(name = "HardDiskInterface")
	private String hardDiskInterface;
	@XmlElement(name = "HardDiskSize")
	private DecimalWithUnits hardDiskSize;
	@XmlElement(name = "HardwarePlatform")
	private String hardwarePlatform;
	@XmlElement(name = "HazardousMaterialType")
	private String hazardousMaterialType;
	@XmlElement(name = "ItemDimensions")
	private DimensionType itemDimensions;
	@XmlElement(name = "IsAdultProduct")
	private Boolean isAdultProduct;
	@XmlElement(name = "IsAutographed")
	private Boolean isAutographed;
	@XmlElement(name = "IsEligibleForTradeIn")
	private Boolean isEligibleForTradeIn;
	@XmlElement(name = "IsMemorabilia")
	private Boolean isMemorabilia;
	@XmlElement(name = "IssuesPerYear")
	private String issuesPerYear;
	@XmlElement(name = "ItemPartNumber")
	private String itemPartNumber;
	@XmlElement(name = "Label")
	private String label;
	@XmlElement(name = "Languages")
	private LanguageType languages;
	@XmlElement(name = "LegalDisclaimer")
	private String legalDisclaimer;
	@XmlElement(name = "ListPrice")
	private Price listPrice;
	@XmlElement(name = "Manufacturer")
	private String manufacturer;
	@XmlElement(name = "ManufacturerMaximumAge")
	private DecimalWithUnits manufacturerMaximumAge;
	@XmlElement(name = "ManufacturerMinimumAge")
	private DecimalWithUnits manufacturerMinimumAge;
	@XmlElement(name = "ManufacturerPartsWarrantyDescription")
	private String manufacturerPartsWarrantyDescription;
	@XmlElement(name = "MaterialType")
	private List<String> materialType;
	@XmlElement(name = "MaximumResolution")
	private DecimalWithUnits maximumResolution;
	@XmlElement(name = "MediaType")
	private List<String> mediaType;
	@XmlElement(name = "MetalStamp")
	private String metalStamp;
	@XmlElement(name = "MetalType")
	private String metalType;
	@XmlElement(name = "Model")
	private String model;
	@XmlElement(name = "NumberOfDiscs")
	@XmlSchemaType(name = "nonNegativeInteger")
	private Integer numberOfDiscs;
	@XmlElement(name = "NumberOfIssues")
	@XmlSchemaType(name = "nonNegativeInteger")
	private Integer numberOfIssues;
	@XmlElement(name = "NumberOfItems")
	@XmlSchemaType(name = "nonNegativeInteger")
	private Integer numberOfItems;
	@XmlElement(name = "NumberOfPages")
	@XmlSchemaType(name = "nonNegativeInteger")
	private Integer numberOfPages;
	@XmlElement(name = "NumberOfTracks")
	@XmlSchemaType(name = "nonNegativeInteger")
	private Integer numberOfTracks;
	@XmlElement(name = "OperatingSystem")
	private List<String> operatingSystem;
	@XmlElement(name = "OpticalZoom")
	private DecimalWithUnits opticalZoom;
	@XmlElement(name = "PackageDimensions")
	private DimensionType packageDimensions;
	@XmlElement(name = "PackageQuantity")
	@XmlSchemaType(name = "nonNegativeInteger")
	private Integer packageQuantity;
	@XmlElement(name = "PartNumber")
	private String partNumber;
	@XmlElement(name = "PegiRating")
	private String pegiRating;
	@XmlElement(name = "Platform")
	private List<String> platform;
	@XmlElement(name = "ProcessorCount")
	@XmlSchemaType(name = "nonNegativeInteger")
	private Integer processorCount;
	@XmlElement(name = "ProductGroup")
	private String productGroup;
	@XmlElement(name = "ProductTypeName")
	private String productTypeName;
	@XmlElement(name = "ProductTypeSubcategory")
	private String productTypeSubcategory;
	@XmlElement(name = "PublicationDate")
	private String publicationDate;
	@XmlElement(name = "Publisher")
	private String publisher;
	@XmlElement(name = "RegionCode")
	private String regionCode;
	@XmlElement(name = "ReleaseDate")
	private String releaseDate;
	@XmlElement(name = "RingSize")
	private String ringSize;
	@XmlElement(name = "RunningTime")
	private DecimalWithUnits runningTime;
	@XmlElement(name = "ShaftMaterial")
	private String shaftMaterial;
	@XmlElement(name = "Scent")
	private String scent;
	@XmlElement(name = "SeasonSequence")
	private String seasonSequence;
	@XmlElement(name = "SeikodoProductCode")
	private String seikodoProductCode;
	@XmlElement(name = "Size")
	private String size;
	@XmlElement(name = "SizePerPearl")
	private String sizePerPearl;
	@XmlElement(name = "SmallImage")
	private Image smallImage;
	@XmlElement(name = "Studio")
	private String studio;
	@XmlElement(name = "SubscriptionLength")
	private NonNegativeIntegerWithUnits subscriptionLength;
	@XmlElement(name = "SystemMemorySize")
	private DecimalWithUnits systemMemorySize;
	@XmlElement(name = "SystemMemoryType")
	private String systemMemoryType;
	@XmlElement(name = "TheatricalReleaseDate")
	private String theatricalReleaseDate;
	@XmlElement(name = "Title")
	private String title;
	@XmlElement(name = "TotalDiamondWeight")
	private DecimalWithUnits totalDiamondWeight;
	@XmlElement(name = "TotalGemWeight")
	private DecimalWithUnits totalGemWeight;
	@XmlElement(name = "Warranty")
	private String warranty;
	@XmlElement(name = "WEEETaxValue")
	private Price weeeTaxValue;
	@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
	private String lang;

	/**
	 * Gets the value of the actor property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the actor property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getActor().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getActor() {
		if (actor == null) {
			actor = new ArrayList<String>();
		}
		return this.actor;
	}

	/**
	 * Gets the value of the artist property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the artist property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getArtist().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getArtist() {
		if (artist == null) {
			artist = new ArrayList<String>();
		}
		return this.artist;
	}

	/**
	 * Gets the value of the aspectRatio property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAspectRatio() {
		return aspectRatio;
	}

	/**
	 * Sets the value of the aspectRatio property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAspectRatio(String value) {
		this.aspectRatio = value;
	}

	/**
	 * Gets the value of the audienceRating property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAudienceRating() {
		return audienceRating;
	}

	/**
	 * Sets the value of the audienceRating property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAudienceRating(String value) {
		this.audienceRating = value;
	}

	/**
	 * Gets the value of the author property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the author property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAuthor().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getAuthor() {
		if (author == null) {
			author = new ArrayList<String>();
		}
		return this.author;
	}

	/**
	 * Gets the value of the backFinding property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBackFinding() {
		return backFinding;
	}

	/**
	 * Sets the value of the backFinding property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setBackFinding(String value) {
		this.backFinding = value;
	}

	/**
	 * Gets the value of the bandMaterialType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBandMaterialType() {
		return bandMaterialType;
	}

	/**
	 * Sets the value of the bandMaterialType property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setBandMaterialType(String value) {
		this.bandMaterialType = value;
	}

	/**
	 * Gets the value of the binding property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBinding() {
		return binding;
	}

	/**
	 * Sets the value of the binding property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setBinding(String value) {
		this.binding = value;
	}

	/**
	 * Gets the value of the blurayRegion property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBlurayRegion() {
		return blurayRegion;
	}

	/**
	 * Sets the value of the blurayRegion property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setBlurayRegion(String value) {
		this.blurayRegion = value;
	}

	/**
	 * Gets the value of the brand property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * Sets the value of the brand property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setBrand(String value) {
		this.brand = value;
	}

	/**
	 * Gets the value of the ceroAgeRating property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCEROAgeRating() {
		return ceroAgeRating;
	}

	/**
	 * Sets the value of the ceroAgeRating property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCEROAgeRating(String value) {
		this.ceroAgeRating = value;
	}

	/**
	 * Gets the value of the chainType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getChainType() {
		return chainType;
	}

	/**
	 * Sets the value of the chainType property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setChainType(String value) {
		this.chainType = value;
	}

	/**
	 * Gets the value of the claspType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getClaspType() {
		return claspType;
	}

	/**
	 * Sets the value of the claspType property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setClaspType(String value) {
		this.claspType = value;
	}

	/**
	 * Gets the value of the color property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Sets the value of the color property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setColor(String value) {
		this.color = value;
	}

	/**
	 * Gets the value of the cpuManufacturer property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCPUManufacturer() {
		return cpuManufacturer;
	}

	/**
	 * Sets the value of the cpuManufacturer property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCPUManufacturer(String value) {
		this.cpuManufacturer = value;
	}

	/**
	 * Gets the value of the cpuSpeed property.
	 * 
	 * @return possible object is {@link DecimalWithUnits }
	 * 
	 */
	public DecimalWithUnits getCPUSpeed() {
		return cpuSpeed;
	}

	/**
	 * Sets the value of the cpuSpeed property.
	 * 
	 * @param value allowed object is {@link DecimalWithUnits }
	 * 
	 */
	public void setCPUSpeed(DecimalWithUnits value) {
		this.cpuSpeed = value;
	}

	/**
	 * Gets the value of the cpuType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCPUType() {
		return cpuType;
	}

	/**
	 * Sets the value of the cpuType property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCPUType(String value) {
		this.cpuType = value;
	}

	/**
	 * Gets the value of the creator property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the creator property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getCreator().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link CreatorType }
	 * 
	 * 
	 */
	public List<CreatorType> getCreator() {
		if (creator == null) {
			creator = new ArrayList<CreatorType>();
		}
		return this.creator;
	}

	/**
	 * Gets the value of the department property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * Sets the value of the department property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDepartment(String value) {
		this.department = value;
	}

	/**
	 * Gets the value of the director property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the director property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDirector().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getDirector() {
		if (director == null) {
			director = new ArrayList<String>();
		}
		return this.director;
	}

	/**
	 * Gets the value of the displaySize property.
	 * 
	 * @return possible object is {@link DecimalWithUnits }
	 * 
	 */
	public DecimalWithUnits getDisplaySize() {
		return displaySize;
	}

	/**
	 * Sets the value of the displaySize property.
	 * 
	 * @param value allowed object is {@link DecimalWithUnits }
	 * 
	 */
	public void setDisplaySize(DecimalWithUnits value) {
		this.displaySize = value;
	}

	/**
	 * Gets the value of the edition property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEdition() {
		return edition;
	}

	/**
	 * Sets the value of the edition property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEdition(String value) {
		this.edition = value;
	}

	/**
	 * Gets the value of the episodeSequence property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEpisodeSequence() {
		return episodeSequence;
	}

	/**
	 * Sets the value of the episodeSequence property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEpisodeSequence(String value) {
		this.episodeSequence = value;
	}

	/**
	 * Gets the value of the esrbAgeRating property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getESRBAgeRating() {
		return esrbAgeRating;
	}

	/**
	 * Sets the value of the esrbAgeRating property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setESRBAgeRating(String value) {
		this.esrbAgeRating = value;
	}

	/**
	 * Gets the value of the feature property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the feature property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getFeature().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getFeature() {
		if (feature == null) {
			feature = new ArrayList<String>();
		}
		return this.feature;
	}

	/**
	 * Gets the value of the flavor property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFlavor() {
		return flavor;
	}

	/**
	 * Sets the value of the flavor property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setFlavor(String value) {
		this.flavor = value;
	}

	/**
	 * Gets the value of the format property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the format property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getFormat().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getFormat() {
		if (format == null) {
			format = new ArrayList<String>();
		}
		return this.format;
	}

	/**
	 * Gets the value of the gemType property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the gemType property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getGemType().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getGemType() {
		if (gemType == null) {
			gemType = new ArrayList<String>();
		}
		return this.gemType;
	}

	/**
	 * Gets the value of the genre property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * Sets the value of the genre property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setGenre(String value) {
		this.genre = value;
	}

	/**
	 * Gets the value of the golfClubFlex property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGolfClubFlex() {
		return golfClubFlex;
	}

	/**
	 * Sets the value of the golfClubFlex property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setGolfClubFlex(String value) {
		this.golfClubFlex = value;
	}

	/**
	 * Gets the value of the golfClubLoft property.
	 * 
	 * @return possible object is {@link DecimalWithUnits }
	 * 
	 */
	public DecimalWithUnits getGolfClubLoft() {
		return golfClubLoft;
	}

	/**
	 * Sets the value of the golfClubLoft property.
	 * 
	 * @param value allowed object is {@link DecimalWithUnits }
	 * 
	 */
	public void setGolfClubLoft(DecimalWithUnits value) {
		this.golfClubLoft = value;
	}

	/**
	 * Gets the value of the handOrientation property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHandOrientation() {
		return handOrientation;
	}

	/**
	 * Sets the value of the handOrientation property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setHandOrientation(String value) {
		this.handOrientation = value;
	}

	/**
	 * Gets the value of the hardDiskInterface property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHardDiskInterface() {
		return hardDiskInterface;
	}

	/**
	 * Sets the value of the hardDiskInterface property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setHardDiskInterface(String value) {
		this.hardDiskInterface = value;
	}

	/**
	 * Gets the value of the hardDiskSize property.
	 * 
	 * @return possible object is {@link DecimalWithUnits }
	 * 
	 */
	public DecimalWithUnits getHardDiskSize() {
		return hardDiskSize;
	}

	/**
	 * Sets the value of the hardDiskSize property.
	 * 
	 * @param value allowed object is {@link DecimalWithUnits }
	 * 
	 */
	public void setHardDiskSize(DecimalWithUnits value) {
		this.hardDiskSize = value;
	}

	/**
	 * Gets the value of the hardwarePlatform property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHardwarePlatform() {
		return hardwarePlatform;
	}

	/**
	 * Sets the value of the hardwarePlatform property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setHardwarePlatform(String value) {
		this.hardwarePlatform = value;
	}

	/**
	 * Gets the value of the hazardousMaterialType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHazardousMaterialType() {
		return hazardousMaterialType;
	}

	/**
	 * Sets the value of the hazardousMaterialType property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setHazardousMaterialType(String value) {
		this.hazardousMaterialType = value;
	}

	/**
	 * Gets the value of the itemDimensions property.
	 * 
	 * @return possible object is {@link DimensionType }
	 * 
	 */
	public DimensionType getItemDimensions() {
		return itemDimensions;
	}

	/**
	 * Sets the value of the itemDimensions property.
	 * 
	 * @param value allowed object is {@link DimensionType }
	 * 
	 */
	public void setItemDimensions(DimensionType value) {
		this.itemDimensions = value;
	}

	/**
	 * Gets the value of the isAdultProduct property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isIsAdultProduct() {
		return isAdultProduct;
	}

	/**
	 * Sets the value of the isAdultProduct property.
	 * 
	 * @param value allowed object is {@link Boolean }
	 * 
	 */
	public void setIsAdultProduct(Boolean value) {
		this.isAdultProduct = value;
	}

	/**
	 * Gets the value of the isAutographed property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isIsAutographed() {
		return isAutographed;
	}

	/**
	 * Sets the value of the isAutographed property.
	 * 
	 * @param value allowed object is {@link Boolean }
	 * 
	 */
	public void setIsAutographed(Boolean value) {
		this.isAutographed = value;
	}

	/**
	 * Gets the value of the isEligibleForTradeIn property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isIsEligibleForTradeIn() {
		return isEligibleForTradeIn;
	}

	/**
	 * Sets the value of the isEligibleForTradeIn property.
	 * 
	 * @param value allowed object is {@link Boolean }
	 * 
	 */
	public void setIsEligibleForTradeIn(Boolean value) {
		this.isEligibleForTradeIn = value;
	}

	/**
	 * Gets the value of the isMemorabilia property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isIsMemorabilia() {
		return isMemorabilia;
	}

	/**
	 * Sets the value of the isMemorabilia property.
	 * 
	 * @param value allowed object is {@link Boolean }
	 * 
	 */
	public void setIsMemorabilia(Boolean value) {
		this.isMemorabilia = value;
	}

	/**
	 * Gets the value of the issuesPerYear property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIssuesPerYear() {
		return issuesPerYear;
	}

	/**
	 * Sets the value of the issuesPerYear property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setIssuesPerYear(String value) {
		this.issuesPerYear = value;
	}

	/**
	 * Gets the value of the itemPartNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getItemPartNumber() {
		return itemPartNumber;
	}

	/**
	 * Sets the value of the itemPartNumber property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setItemPartNumber(String value) {
		this.itemPartNumber = value;
	}

	/**
	 * Gets the value of the label property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * Sets the value of the label property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLabel(String value) {
		this.label = value;
	}

	/**
	 * Gets the value of the languages property.
	 * 
	 * @return possible object is {@link LanguageType }
	 * 
	 */
	public LanguageType getLanguages() {
		return languages;
	}

	/**
	 * Sets the value of the languages property.
	 * 
	 * @param value allowed object is {@link LanguageType }
	 * 
	 */
	public void setLanguages(LanguageType value) {
		this.languages = value;
	}

	/**
	 * Gets the value of the legalDisclaimer property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLegalDisclaimer() {
		return legalDisclaimer;
	}

	/**
	 * Sets the value of the legalDisclaimer property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLegalDisclaimer(String value) {
		this.legalDisclaimer = value;
	}

	/**
	 * Gets the value of the listPrice property.
	 * 
	 * @return possible object is {@link Price }
	 * 
	 */
	public Price getListPrice() {
		return listPrice;
	}

	/**
	 * Sets the value of the listPrice property.
	 * 
	 * @param value allowed object is {@link Price }
	 * 
	 */
	public void setListPrice(Price value) {
		this.listPrice = value;
	}

	/**
	 * Gets the value of the manufacturer property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * Sets the value of the manufacturer property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setManufacturer(String value) {
		this.manufacturer = value;
	}

	/**
	 * Gets the value of the manufacturerMaximumAge property.
	 * 
	 * @return possible object is {@link DecimalWithUnits }
	 * 
	 */
	public DecimalWithUnits getManufacturerMaximumAge() {
		return manufacturerMaximumAge;
	}

	/**
	 * Sets the value of the manufacturerMaximumAge property.
	 * 
	 * @param value allowed object is {@link DecimalWithUnits }
	 * 
	 */
	public void setManufacturerMaximumAge(DecimalWithUnits value) {
		this.manufacturerMaximumAge = value;
	}

	/**
	 * Gets the value of the manufacturerMinimumAge property.
	 * 
	 * @return possible object is {@link DecimalWithUnits }
	 * 
	 */
	public DecimalWithUnits getManufacturerMinimumAge() {
		return manufacturerMinimumAge;
	}

	/**
	 * Sets the value of the manufacturerMinimumAge property.
	 * 
	 * @param value allowed object is {@link DecimalWithUnits }
	 * 
	 */
	public void setManufacturerMinimumAge(DecimalWithUnits value) {
		this.manufacturerMinimumAge = value;
	}

	/**
	 * Gets the value of the manufacturerPartsWarrantyDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getManufacturerPartsWarrantyDescription() {
		return manufacturerPartsWarrantyDescription;
	}

	/**
	 * Sets the value of the manufacturerPartsWarrantyDescription property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setManufacturerPartsWarrantyDescription(String value) {
		this.manufacturerPartsWarrantyDescription = value;
	}

	/**
	 * Gets the value of the materialType property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the materialType property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getMaterialType().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getMaterialType() {
		if (materialType == null) {
			materialType = new ArrayList<String>();
		}
		return this.materialType;
	}

	/**
	 * Gets the value of the maximumResolution property.
	 * 
	 * @return possible object is {@link DecimalWithUnits }
	 * 
	 */
	public DecimalWithUnits getMaximumResolution() {
		return maximumResolution;
	}

	/**
	 * Sets the value of the maximumResolution property.
	 * 
	 * @param value allowed object is {@link DecimalWithUnits }
	 * 
	 */
	public void setMaximumResolution(DecimalWithUnits value) {
		this.maximumResolution = value;
	}

	/**
	 * Gets the value of the mediaType property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the mediaType property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getMediaType().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getMediaType() {
		if (mediaType == null) {
			mediaType = new ArrayList<String>();
		}
		return this.mediaType;
	}

	/**
	 * Gets the value of the metalStamp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMetalStamp() {
		return metalStamp;
	}

	/**
	 * Sets the value of the metalStamp property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setMetalStamp(String value) {
		this.metalStamp = value;
	}

	/**
	 * Gets the value of the metalType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMetalType() {
		return metalType;
	}

	/**
	 * Sets the value of the metalType property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setMetalType(String value) {
		this.metalType = value;
	}

	/**
	 * Gets the value of the model property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Sets the value of the model property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setModel(String value) {
		this.model = value;
	}

	/**
	 * Gets the value of the numberOfDiscs property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getNumberOfDiscs() {
		return numberOfDiscs;
	}

	/**
	 * Sets the value of the numberOfDiscs property.
	 * 
	 * @param value allowed object is {@link Integer }
	 * 
	 */
	public void setNumberOfDiscs(Integer value) {
		this.numberOfDiscs = value;
	}

	/**
	 * Gets the value of the numberOfIssues property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getNumberOfIssues() {
		return numberOfIssues;
	}

	/**
	 * Sets the value of the numberOfIssues property.
	 * 
	 * @param value allowed object is {@link Integer }
	 * 
	 */
	public void setNumberOfIssues(Integer value) {
		this.numberOfIssues = value;
	}

	/**
	 * Gets the value of the numberOfItems property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getNumberOfItems() {
		return numberOfItems;
	}

	/**
	 * Sets the value of the numberOfItems property.
	 * 
	 * @param value allowed object is {@link Integer }
	 * 
	 */
	public void setNumberOfItems(Integer value) {
		this.numberOfItems = value;
	}

	/**
	 * Gets the value of the numberOfPages property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getNumberOfPages() {
		return numberOfPages;
	}

	/**
	 * Sets the value of the numberOfPages property.
	 * 
	 * @param value allowed object is {@link Integer }
	 * 
	 */
	public void setNumberOfPages(Integer value) {
		this.numberOfPages = value;
	}

	/**
	 * Gets the value of the numberOfTracks property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getNumberOfTracks() {
		return numberOfTracks;
	}

	/**
	 * Sets the value of the numberOfTracks property.
	 * 
	 * @param value allowed object is {@link Integer }
	 * 
	 */
	public void setNumberOfTracks(Integer value) {
		this.numberOfTracks = value;
	}

	/**
	 * Gets the value of the operatingSystem property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the operatingSystem property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getOperatingSystem().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getOperatingSystem() {
		if (operatingSystem == null) {
			operatingSystem = new ArrayList<String>();
		}
		return this.operatingSystem;
	}

	/**
	 * Gets the value of the opticalZoom property.
	 * 
	 * @return possible object is {@link DecimalWithUnits }
	 * 
	 */
	public DecimalWithUnits getOpticalZoom() {
		return opticalZoom;
	}

	/**
	 * Sets the value of the opticalZoom property.
	 * 
	 * @param value allowed object is {@link DecimalWithUnits }
	 * 
	 */
	public void setOpticalZoom(DecimalWithUnits value) {
		this.opticalZoom = value;
	}

	/**
	 * Gets the value of the packageDimensions property.
	 * 
	 * @return possible object is {@link DimensionType }
	 * 
	 */
	public DimensionType getPackageDimensions() {
		return packageDimensions;
	}

	/**
	 * Sets the value of the packageDimensions property.
	 * 
	 * @param value allowed object is {@link DimensionType }
	 * 
	 */
	public void setPackageDimensions(DimensionType value) {
		this.packageDimensions = value;
	}

	/**
	 * Gets the value of the packageQuantity property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getPackageQuantity() {
		return packageQuantity;
	}

	/**
	 * Sets the value of the packageQuantity property.
	 * 
	 * @param value allowed object is {@link Integer }
	 * 
	 */
	public void setPackageQuantity(Integer value) {
		this.packageQuantity = value;
	}

	/**
	 * Gets the value of the partNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPartNumber() {
		return partNumber;
	}

	/**
	 * Sets the value of the partNumber property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPartNumber(String value) {
		this.partNumber = value;
	}

	/**
	 * Gets the value of the pegiRating property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPegiRating() {
		return pegiRating;
	}

	/**
	 * Sets the value of the pegiRating property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPegiRating(String value) {
		this.pegiRating = value;
	}

	/**
	 * Gets the value of the platform property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the platform property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPlatform().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getPlatform() {
		if (platform == null) {
			platform = new ArrayList<String>();
		}
		return this.platform;
	}

	/**
	 * Gets the value of the processorCount property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getProcessorCount() {
		return processorCount;
	}

	/**
	 * Sets the value of the processorCount property.
	 * 
	 * @param value allowed object is {@link Integer }
	 * 
	 */
	public void setProcessorCount(Integer value) {
		this.processorCount = value;
	}

	/**
	 * Gets the value of the productGroup property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProductGroup() {
		return productGroup;
	}

	/**
	 * Sets the value of the productGroup property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setProductGroup(String value) {
		this.productGroup = value;
	}

	/**
	 * Gets the value of the productTypeName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProductTypeName() {
		return productTypeName;
	}

	/**
	 * Sets the value of the productTypeName property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setProductTypeName(String value) {
		this.productTypeName = value;
	}

	/**
	 * Gets the value of the productTypeSubcategory property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProductTypeSubcategory() {
		return productTypeSubcategory;
	}

	/**
	 * Sets the value of the productTypeSubcategory property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setProductTypeSubcategory(String value) {
		this.productTypeSubcategory = value;
	}

	/**
	 * Gets the value of the publicationDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPublicationDate() {
		return publicationDate;
	}

	/**
	 * Sets the value of the publicationDate property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPublicationDate(String value) {
		this.publicationDate = value;
	}

	/**
	 * Gets the value of the publisher property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * Sets the value of the publisher property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPublisher(String value) {
		this.publisher = value;
	}

	/**
	 * Gets the value of the regionCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRegionCode() {
		return regionCode;
	}

	/**
	 * Sets the value of the regionCode property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setRegionCode(String value) {
		this.regionCode = value;
	}

	/**
	 * Gets the value of the releaseDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReleaseDate() {
		return releaseDate;
	}

	/**
	 * Sets the value of the releaseDate property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setReleaseDate(String value) {
		this.releaseDate = value;
	}

	/**
	 * Gets the value of the ringSize property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRingSize() {
		return ringSize;
	}

	/**
	 * Sets the value of the ringSize property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setRingSize(String value) {
		this.ringSize = value;
	}

	/**
	 * Gets the value of the runningTime property.
	 * 
	 * @return possible object is {@link DecimalWithUnits }
	 * 
	 */
	public DecimalWithUnits getRunningTime() {
		return runningTime;
	}

	/**
	 * Sets the value of the runningTime property.
	 * 
	 * @param value allowed object is {@link DecimalWithUnits }
	 * 
	 */
	public void setRunningTime(DecimalWithUnits value) {
		this.runningTime = value;
	}

	/**
	 * Gets the value of the shaftMaterial property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getShaftMaterial() {
		return shaftMaterial;
	}

	/**
	 * Sets the value of the shaftMaterial property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setShaftMaterial(String value) {
		this.shaftMaterial = value;
	}

	/**
	 * Gets the value of the scent property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getScent() {
		return scent;
	}

	/**
	 * Sets the value of the scent property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setScent(String value) {
		this.scent = value;
	}

	/**
	 * Gets the value of the seasonSequence property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSeasonSequence() {
		return seasonSequence;
	}

	/**
	 * Sets the value of the seasonSequence property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSeasonSequence(String value) {
		this.seasonSequence = value;
	}

	/**
	 * Gets the value of the seikodoProductCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSeikodoProductCode() {
		return seikodoProductCode;
	}

	/**
	 * Sets the value of the seikodoProductCode property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSeikodoProductCode(String value) {
		this.seikodoProductCode = value;
	}

	/**
	 * Gets the value of the size property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSize() {
		return size;
	}

	/**
	 * Sets the value of the size property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSize(String value) {
		this.size = value;
	}

	/**
	 * Gets the value of the sizePerPearl property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSizePerPearl() {
		return sizePerPearl;
	}

	/**
	 * Sets the value of the sizePerPearl property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSizePerPearl(String value) {
		this.sizePerPearl = value;
	}

	/**
	 * Gets the value of the smallImage property.
	 * 
	 * @return possible object is {@link Image }
	 * 
	 */
	public Image getSmallImage() {
		return smallImage;
	}

	/**
	 * Sets the value of the smallImage property.
	 * 
	 * @param value allowed object is {@link Image }
	 * 
	 */
	public void setSmallImage(Image value) {
		this.smallImage = value;
	}

	/**
	 * Gets the value of the studio property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStudio() {
		return studio;
	}

	/**
	 * Sets the value of the studio property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setStudio(String value) {
		this.studio = value;
	}

	/**
	 * Gets the value of the subscriptionLength property.
	 * 
	 * @return possible object is {@link NonNegativeIntegerWithUnits }
	 * 
	 */
	public NonNegativeIntegerWithUnits getSubscriptionLength() {
		return subscriptionLength;
	}

	/**
	 * Sets the value of the subscriptionLength property.
	 * 
	 * @param value allowed object is {@link NonNegativeIntegerWithUnits }
	 * 
	 */
	public void setSubscriptionLength(NonNegativeIntegerWithUnits value) {
		this.subscriptionLength = value;
	}

	/**
	 * Gets the value of the systemMemorySize property.
	 * 
	 * @return possible object is {@link DecimalWithUnits }
	 * 
	 */
	public DecimalWithUnits getSystemMemorySize() {
		return systemMemorySize;
	}

	/**
	 * Sets the value of the systemMemorySize property.
	 * 
	 * @param value allowed object is {@link DecimalWithUnits }
	 * 
	 */
	public void setSystemMemorySize(DecimalWithUnits value) {
		this.systemMemorySize = value;
	}

	/**
	 * Gets the value of the systemMemoryType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSystemMemoryType() {
		return systemMemoryType;
	}

	/**
	 * Sets the value of the systemMemoryType property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSystemMemoryType(String value) {
		this.systemMemoryType = value;
	}

	/**
	 * Gets the value of the theatricalReleaseDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTheatricalReleaseDate() {
		return theatricalReleaseDate;
	}

	/**
	 * Sets the value of the theatricalReleaseDate property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setTheatricalReleaseDate(String value) {
		this.theatricalReleaseDate = value;
	}

	/**
	 * Gets the value of the title property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the value of the title property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setTitle(String value) {
		this.title = value;
	}

	/**
	 * Gets the value of the totalDiamondWeight property.
	 * 
	 * @return possible object is {@link DecimalWithUnits }
	 * 
	 */
	public DecimalWithUnits getTotalDiamondWeight() {
		return totalDiamondWeight;
	}

	/**
	 * Sets the value of the totalDiamondWeight property.
	 * 
	 * @param value allowed object is {@link DecimalWithUnits }
	 * 
	 */
	public void setTotalDiamondWeight(DecimalWithUnits value) {
		this.totalDiamondWeight = value;
	}

	/**
	 * Gets the value of the totalGemWeight property.
	 * 
	 * @return possible object is {@link DecimalWithUnits }
	 * 
	 */
	public DecimalWithUnits getTotalGemWeight() {
		return totalGemWeight;
	}

	/**
	 * Sets the value of the totalGemWeight property.
	 * 
	 * @param value allowed object is {@link DecimalWithUnits }
	 * 
	 */
	public void setTotalGemWeight(DecimalWithUnits value) {
		this.totalGemWeight = value;
	}

	/**
	 * Gets the value of the warranty property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWarranty() {
		return warranty;
	}

	/**
	 * Sets the value of the warranty property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setWarranty(String value) {
		this.warranty = value;
	}

	/**
	 * Gets the value of the weeeTaxValue property.
	 * 
	 * @return possible object is {@link Price }
	 * 
	 */
	public Price getWEEETaxValue() {
		return weeeTaxValue;
	}

	/**
	 * Sets the value of the weeeTaxValue property.
	 * 
	 * @param value allowed object is {@link Price }
	 * 
	 */
	public void setWEEETaxValue(Price value) {
		this.weeeTaxValue = value;
	}

	/**
	 * Gets the value of the lang property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * Sets the value of the lang property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLang(String value) {
		this.lang = value;
	}

	@Override
	public void readFragmentFrom(MwsReader r) {
		actor = r.readList("ns2:Actor", String.class);
		artist = r.readList("ns2:Artist", String.class);
		aspectRatio = r.read("ns2:AspectRatio", String.class);
		audienceRating = r.read("ns2:AudienceRating", String.class);
		author = r.readList("ns2:Author", String.class);
		backFinding = r.read("ns2:BackFinding", String.class);
		bandMaterialType = r.read("ns2:BandMaterialType", String.class);
		binding = r.read("ns2:Binding", String.class);
		blurayRegion = r.read("ns2:BlurayRegion", String.class);
		brand = r.read("ns2:Brand", String.class);
		ceroAgeRating = r.read("ns2:CEROAgeRating", String.class);
		chainType = r.read("ns2:ChainType", String.class);
		claspType = r.read("ns2:ClaspType", String.class);
		color = r.read("ns2:Color", String.class);
		cpuManufacturer = r.read("ns2:CPUManufacturer", String.class);

		cpuSpeed = r.read("ns2:CPUSpeed", DecimalWithUnits.class);
		cpuType = r.read("ns2:CPUType", String.class);
		creator = r.readList("ns2:Creator", CreatorType.class);
		department = r.read("ns2:Department", String.class);
		director = r.readList("ns2:Director", String.class);
		displaySize = r.read("ns2:DisplaySize", DecimalWithUnits.class);
		edition = r.read("ns2:Edition", String.class);
		episodeSequence = r.read("ns2:EpisodeSequence", String.class);
		esrbAgeRating = r.read("ns2:ESRBAgeRating", String.class);
		feature = r.readList("ns2:Feature", String.class);
		flavor = r.read("ns2:Flavor", String.class);
		format = r.readList("ns2:Format", String.class);
		gemType = r.readList("ns2:GemType", String.class);
		genre = r.read("ns2:Genre", String.class);
		golfClubFlex = r.read("ns2:GolfClubFlex", String.class);
		golfClubLoft = r.read("ns2:GolfClubLoft", DecimalWithUnits.class);

		handOrientation = r.read("ns2:HandOrientation", String.class);
		hardDiskInterface = r.read("ns2:HardDiskInterface", String.class);
		hardDiskSize = r.read("ns2:HardDiskSize", DecimalWithUnits.class);
		hardwarePlatform = r.read("ns2:HardwarePlatform", String.class);
		hazardousMaterialType = r.read("ns2:HazardousMaterialType", String.class);
		itemDimensions = r.read("ns2:ItemDimensions", DimensionType.class);
		isAdultProduct = r.read("ns2:IsAdultProduct", Boolean.class);
		isAutographed = r.read("ns2:IsAutographed", Boolean.class);
		isEligibleForTradeIn = r.read("ns2:IsEligibleForTradeIn", Boolean.class);
		isMemorabilia = r.read("ns2:IsMemorabilia", Boolean.class);
		issuesPerYear = r.read("ns2:IssuesPerYear", String.class);
		itemPartNumber = r.read("ns2:ItemPartNumber", String.class);
		label = r.read("ns2:Label", String.class);
		languages = r.read("ns2:Languages", LanguageType.class);
		legalDisclaimer = r.read("ns2:LegalDisclaimer", String.class);
		listPrice = r.read("ns2:ListPrice", Price.class);
		manufacturer = r.read("ns2:Manufacturer", String.class);
		manufacturerMaximumAge = r.read("ns2:ManufacturerMaximumAge", DecimalWithUnits.class);
		manufacturerMinimumAge = r.read("ns2:ManufacturerMinimumAge", DecimalWithUnits.class);
		manufacturerPartsWarrantyDescription = r.read("ns2:ManufacturerPartsWarrantyDescription", String.class);
		materialType = r.readList("ns2:MaterialType", String.class);
		maximumResolution = r.read("ns2:MaximumResolution", DecimalWithUnits.class);
		mediaType = r.readList("ns2:MediaType", String.class);
		metalStamp = r.read("ns2:MetalStamp", String.class);
		metalType = r.read("ns2:MetalType", String.class);
		model = r.read("ns2:Model", String.class);
		numberOfDiscs = r.read("ns2:NumberOfDiscs", Integer.class);
		numberOfIssues = r.read("ns2:NumberOfIssues", Integer.class);
		numberOfItems = r.read("ns2:NumberOfItems", Integer.class);
		numberOfPages = r.read("ns2:NumberOfPages", Integer.class);
		numberOfTracks = r.read("ns2:NumberOfTracks", Integer.class);
		operatingSystem = r.readList("ns2:OperatingSystem", String.class);
		opticalZoom = r.read("ns2:OpticalZoom", DecimalWithUnits.class);
		packageDimensions = r.read("ns2:PackageDimensions", DimensionType.class);
		packageQuantity = r.read("ns2:PackageQuantity", Integer.class);
		partNumber = r.read("ns2:PartNumber", String.class);
		pegiRating = r.read("ns2:PegiRating", String.class);
		platform = r.readList("ns2:Platform", String.class);
		processorCount = r.read("ns2:ProcessorCount", Integer.class);
		productGroup = r.read("ns2:ProductGroup", String.class);
		productTypeName = r.read("ns2:ProductTypeName", String.class);
		productTypeSubcategory = r.read("ns2:ProductTypeSubcategory", String.class);
		publicationDate = r.read("ns2:PublicationDate", String.class);
		publisher = r.read("ns2:Publisher", String.class);
		regionCode = r.read("ns2:RegionCode", String.class);
		releaseDate = r.read("ns2:ReleaseDate", String.class);
		ringSize = r.read("ns2:RingSize", String.class);
		runningTime = r.read("ns2:RunningTime", DecimalWithUnits.class);

		shaftMaterial = r.read("ns2:ShaftMaterial", String.class);
		scent = r.read("ns2:Scent", String.class);
		seasonSequence = r.read("ns2:SeasonSequence", String.class);
		seikodoProductCode = r.read("ns2:SeikodoProductCode", String.class);
		size = r.read("ns2:Size", String.class);
		sizePerPearl = r.read("ns2:SizePerPearl", String.class);
		smallImage = r.read("ns2:SmallImage", Image.class);
		studio = r.read("ns2:Studio", String.class);
		subscriptionLength = r.read("ns2:SubscriptionLength", NonNegativeIntegerWithUnits.class);
		systemMemorySize = r.read("ns2:SystemMemorySize", DecimalWithUnits.class);
		systemMemoryType = r.read("ns2:SystemMemoryType", String.class);
		theatricalReleaseDate = r.read("ns2:TheatricalReleaseDate", String.class);
		title = r.read("ns2:Title", String.class);
		totalDiamondWeight = r.read("ns2:TotalDiamondWeight", DecimalWithUnits.class);
		totalGemWeight = r.read("ns2:TotalGemWeight", DecimalWithUnits.class);
		warranty = r.read("ns2:Warranty", String.class);
		weeeTaxValue = r.read("ns2:WEEETaxValue", Price.class);
		lang = r.read("ns2:lang", String.class);
	}

	@Override
	public void writeFragmentTo(MwsWriter w) {
		if(actor !=null && !actor.isEmpty()) w.writeList("Actor", actor);
		if(artist !=null && !artist.isEmpty()) w.writeList("Artist", artist);
		if(aspectRatio !=null ) w.write("AspectRatio", aspectRatio);
		if(audienceRating !=null ) w.write("AudienceRating", audienceRating);
		if(author !=null && !author.isEmpty()) w.writeList("Author", author);
		if(backFinding !=null ) w.write("BackFinding", backFinding);
		if(bandMaterialType !=null ) w.write("BandMaterialType", bandMaterialType);
		if(binding !=null ) w.write("Binding", binding);
		if(blurayRegion !=null ) w.write("BlurayRegion", blurayRegion);
		if(brand !=null ) w.write("Brand", brand);
		if(ceroAgeRating !=null ) w.write("CEROAgeRating", ceroAgeRating);
		if(chainType !=null ) w.write("ChainType", chainType);
		if(claspType !=null ) w.write("ClaspType", claspType);
		if(color !=null ) w.write("Color", color);
		if(cpuManufacturer !=null ) w.write("CPUManufacturer", cpuManufacturer);

		if(cpuSpeed !=null ) w.write("CPUSpeed", cpuSpeed);
		if(cpuType !=null ) w.write("CPUType", cpuType);
		if(creator !=null && !creator.isEmpty()) w.writeList("Creator", creator);
		if(department !=null ) w.write("Department", department);
		if(director !=null && !director.isEmpty()) w.writeList("Director", director);
		if(displaySize !=null ) w.write("DisplaySize", displaySize);
		if(edition !=null ) w.write("Edition", edition);
		if(episodeSequence !=null ) w.write("EpisodeSequence", episodeSequence);
		if(esrbAgeRating !=null ) w.write("ESRBAgeRating", esrbAgeRating);
		if(feature !=null && !feature.isEmpty()) w.writeList("Feature", feature);
		if(flavor !=null ) w.write("Flavor", flavor);
		if(format !=null && !format.isEmpty()) w.writeList("Format", format);
		if(gemType !=null && !gemType.isEmpty()) w.writeList("GemType", gemType);
		if(genre !=null ) w.write("Genre", genre);
		if(golfClubFlex !=null ) w.write("GolfClubFlex", golfClubFlex);
		if(golfClubLoft !=null ) w.write("GolfClubLoft", golfClubLoft);

		if(handOrientation !=null ) w.write("HandOrientation", handOrientation);
		if(hardDiskInterface !=null ) w.write("HardDiskInterface", hardDiskInterface);
		if(hardDiskSize !=null ) w.write("HardDiskSize", hardDiskSize);
		if(hardwarePlatform !=null ) w.write("HardwarePlatform", hardwarePlatform);
		if(hazardousMaterialType !=null ) w.write("HazardousMaterialType", hazardousMaterialType);
		if(itemDimensions !=null ) w.write("ItemDimensions", itemDimensions);
		if(isAdultProduct !=null ) w.write("IsAdultProduct", isAdultProduct);
		if(isAutographed !=null ) w.write("IsAutographed", isAutographed);
		if(isEligibleForTradeIn !=null ) w.write("IsEligibleForTradeIn", isEligibleForTradeIn);
		if(isMemorabilia !=null ) w.write("IsMemorabilia", isMemorabilia);
		if(issuesPerYear !=null ) w.write("IssuesPerYear", issuesPerYear);
		if(itemPartNumber !=null ) w.write("ItemPartNumber", itemPartNumber);
		if(label !=null ) w.write("Label", label);
		if(languages !=null ) w.write("Languages", languages);
		if(legalDisclaimer !=null ) w.write("LegalDisclaimer", legalDisclaimer);
		if(listPrice !=null ) w.write("ListPrice", listPrice);
		if(manufacturer !=null ) w.write("Manufacturer", manufacturer);
		if(manufacturerMaximumAge !=null ) w.write("ManufacturerMaximumAge", manufacturerMaximumAge);
		if(manufacturerMinimumAge !=null ) w.write("ManufacturerMinimumAge", manufacturerMinimumAge);
		if(manufacturerPartsWarrantyDescription !=null ) w.write("ManufacturerPartsWarrantyDescription", manufacturerPartsWarrantyDescription);
		if(materialType !=null && !materialType.isEmpty()) w.writeList("MaterialType", materialType);
		if(maximumResolution !=null ) w.write("MaximumResolution", maximumResolution);
		if(mediaType !=null && !mediaType.isEmpty()) w.writeList("MediaType", mediaType);
		if(metalStamp !=null ) w.write("MetalStamp", metalStamp);
		if(metalType !=null ) w.write("MetalType", metalType);
		if(model !=null ) w.write("Model", model);
		if(numberOfDiscs !=null ) w.write("NumberOfDiscs", numberOfDiscs);
		if(numberOfIssues !=null ) w.write("NumberOfIssues", numberOfIssues);
		if(numberOfItems !=null ) w.write("NumberOfItems", numberOfItems);
		if(numberOfPages !=null ) w.write("NumberOfPages", numberOfPages);
		if(numberOfTracks !=null ) w.write("NumberOfTracks", numberOfTracks);
		if(operatingSystem !=null && !operatingSystem.isEmpty()) w.writeList("OperatingSystem", operatingSystem);
		if(opticalZoom !=null ) w.write("OpticalZoom", opticalZoom);
		if(packageDimensions !=null ) w.write("PackageDimensions", packageDimensions);
		if(packageQuantity !=null ) w.write("PackageQuantity", packageQuantity);
		if(partNumber !=null ) w.write("PartNumber", partNumber);
		if(pegiRating !=null ) w.write("PegiRating", pegiRating);
		if(platform !=null && !platform.isEmpty()) w.writeList("Platform", platform);
		if(processorCount !=null ) w.write("ProcessorCount", processorCount);
		if(productGroup !=null ) w.write("ProductGroup", productGroup);
		if(productTypeName !=null ) w.write("ProductTypeName", productTypeName);
		if(productTypeSubcategory !=null ) w.write("ProductTypeSubcategory", productTypeSubcategory);
		if(publicationDate !=null ) w.write("PublicationDate", publicationDate);
		if(publisher !=null ) w.write("Publisher", publisher);
		if(regionCode !=null ) w.write("RegionCode", regionCode);
		if(releaseDate !=null ) w.write("ReleaseDate", releaseDate);
		if(ringSize !=null ) w.write("RingSize", ringSize);
		if(runningTime !=null ) w.write("RunningTime", runningTime);

		if(shaftMaterial !=null ) w.write("ShaftMaterial", shaftMaterial);
		if(scent !=null ) w.write("Scent", scent);
		if(seasonSequence !=null ) w.write("SeasonSequence", seasonSequence);
		if(seikodoProductCode !=null ) w.write("SeikodoProductCode", seikodoProductCode);
		if(size !=null ) w.write("Size", size);
		if(sizePerPearl !=null ) w.write("SizePerPearl", sizePerPearl);
		if(smallImage !=null ) w.write("SmallImage", smallImage);
		if(studio !=null ) w.write("Studio", studio);
		if(subscriptionLength !=null ) w.write("SubscriptionLength", subscriptionLength);
		if(systemMemorySize !=null ) w.write("SystemMemorySize", systemMemorySize);
		if(systemMemoryType !=null ) w.write("SystemMemoryType", systemMemoryType);
		if(theatricalReleaseDate !=null ) w.write("TheatricalReleaseDate", theatricalReleaseDate);
		if(title !=null ) w.write("Title", title);
		if(totalDiamondWeight !=null ) w.write("TotalDiamondWeight", totalDiamondWeight);
		if(totalGemWeight !=null ) w.write("TotalGemWeight", totalGemWeight);
		if(warranty !=null ) w.write("Warranty", warranty);
		if(weeeTaxValue !=null ) w.write("WEEETaxValue", weeeTaxValue);
		if(lang !=null ) w.write(lang, lang);

	}

	@Override
	public void writeTo(MwsWriter w) {
		w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "ItemAttributesType", this);
	}

	public ItemAttributesType(List<String> actor, List<String> artist, String aspectRatio, String audienceRating,
			List<String> author, String backFinding, String bandMaterialType, String binding, String blurayRegion,
			String brand, String ceroAgeRating, String chainType, String claspType, String color,
			String cpuManufacturer, DecimalWithUnits cpuSpeed, String cpuType, List<CreatorType> creator,
			String department, List<String> director, DecimalWithUnits displaySize, String edition,
			String episodeSequence, String esrbAgeRating, List<String> feature, String flavor, List<String> format,
			List<String> gemType, String genre, String golfClubFlex, DecimalWithUnits golfClubLoft,
			String handOrientation, String hardDiskInterface, DecimalWithUnits hardDiskSize, String hardwarePlatform,
			String hazardousMaterialType, DimensionType itemDimensions, Boolean isAdultProduct, Boolean isAutographed,
			Boolean isEligibleForTradeIn, Boolean isMemorabilia, String issuesPerYear, String itemPartNumber,
			String label, LanguageType languages, String legalDisclaimer, Price listPrice, String manufacturer,
			DecimalWithUnits manufacturerMaximumAge, DecimalWithUnits manufacturerMinimumAge,
			String manufacturerPartsWarrantyDescription, List<String> materialType, DecimalWithUnits maximumResolution,
			List<String> mediaType, String metalStamp, String metalType, String model, Integer numberOfDiscs,
			Integer numberOfIssues, Integer numberOfItems, Integer numberOfPages, Integer numberOfTracks,
			List<String> operatingSystem, DecimalWithUnits opticalZoom, DimensionType packageDimensions,
			Integer packageQuantity, String partNumber, String pegiRating, List<String> platform,
			Integer processorCount, String productGroup, String productTypeName, String productTypeSubcategory,
			String publicationDate, String publisher, String regionCode, String releaseDate, String ringSize,
			DecimalWithUnits runningTime, String shaftMaterial, String scent, String seasonSequence,
			String seikodoProductCode, String size, String sizePerPearl, Image smallImage, String studio,
			NonNegativeIntegerWithUnits subscriptionLength, DecimalWithUnits systemMemorySize, String systemMemoryType,
			String theatricalReleaseDate, String title, DecimalWithUnits totalDiamondWeight,
			DecimalWithUnits totalGemWeight, String warranty, Price weeeTaxValue, String lang) {
		super();
		this.actor = actor;
		this.artist = artist;
		this.aspectRatio = aspectRatio;
		this.audienceRating = audienceRating;
		this.author = author;
		this.backFinding = backFinding;
		this.bandMaterialType = bandMaterialType;
		this.binding = binding;
		this.blurayRegion = blurayRegion;
		this.brand = brand;
		this.ceroAgeRating = ceroAgeRating;
		this.chainType = chainType;
		this.claspType = claspType;
		this.color = color;
		this.cpuManufacturer = cpuManufacturer;
		this.cpuSpeed = cpuSpeed;
		this.cpuType = cpuType;
		this.creator = creator;
		this.department = department;
		this.director = director;
		this.displaySize = displaySize;
		this.edition = edition;
		this.episodeSequence = episodeSequence;
		this.esrbAgeRating = esrbAgeRating;
		this.feature = feature;
		this.flavor = flavor;
		this.format = format;
		this.gemType = gemType;
		this.genre = genre;
		this.golfClubFlex = golfClubFlex;
		this.golfClubLoft = golfClubLoft;
		this.handOrientation = handOrientation;
		this.hardDiskInterface = hardDiskInterface;
		this.hardDiskSize = hardDiskSize;
		this.hardwarePlatform = hardwarePlatform;
		this.hazardousMaterialType = hazardousMaterialType;
		this.itemDimensions = itemDimensions;
		this.isAdultProduct = isAdultProduct;
		this.isAutographed = isAutographed;
		this.isEligibleForTradeIn = isEligibleForTradeIn;
		this.isMemorabilia = isMemorabilia;
		this.issuesPerYear = issuesPerYear;
		this.itemPartNumber = itemPartNumber;
		this.label = label;
		this.languages = languages;
		this.legalDisclaimer = legalDisclaimer;
		this.listPrice = listPrice;
		this.manufacturer = manufacturer;
		this.manufacturerMaximumAge = manufacturerMaximumAge;
		this.manufacturerMinimumAge = manufacturerMinimumAge;
		this.manufacturerPartsWarrantyDescription = manufacturerPartsWarrantyDescription;
		this.materialType = materialType;
		this.maximumResolution = maximumResolution;
		this.mediaType = mediaType;
		this.metalStamp = metalStamp;
		this.metalType = metalType;
		this.model = model;
		this.numberOfDiscs = numberOfDiscs;
		this.numberOfIssues = numberOfIssues;
		this.numberOfItems = numberOfItems;
		this.numberOfPages = numberOfPages;
		this.numberOfTracks = numberOfTracks;
		this.operatingSystem = operatingSystem;
		this.opticalZoom = opticalZoom;
		this.packageDimensions = packageDimensions;
		this.packageQuantity = packageQuantity;
		this.partNumber = partNumber;
		this.pegiRating = pegiRating;
		this.platform = platform;
		this.processorCount = processorCount;
		this.productGroup = productGroup;
		this.productTypeName = productTypeName;
		this.productTypeSubcategory = productTypeSubcategory;
		this.publicationDate = publicationDate;
		this.publisher = publisher;
		this.regionCode = regionCode;
		this.releaseDate = releaseDate;
		this.ringSize = ringSize;
		this.runningTime = runningTime;
		this.shaftMaterial = shaftMaterial;
		this.scent = scent;
		this.seasonSequence = seasonSequence;
		this.seikodoProductCode = seikodoProductCode;
		this.size = size;
		this.sizePerPearl = sizePerPearl;
		this.smallImage = smallImage;
		this.studio = studio;
		this.subscriptionLength = subscriptionLength;
		this.systemMemorySize = systemMemorySize;
		this.systemMemoryType = systemMemoryType;
		this.theatricalReleaseDate = theatricalReleaseDate;
		this.title = title;
		this.totalDiamondWeight = totalDiamondWeight;
		this.totalGemWeight = totalGemWeight;
		this.warranty = warranty;
		this.weeeTaxValue = weeeTaxValue;
		this.lang = lang;
	}

}
