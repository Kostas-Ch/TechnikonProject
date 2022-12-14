package com.europeandynamics.model;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.europeandynamics.model.enums.RepairStatus;
import com.europeandynamics.model.enums.RepairType;

@Entity
@Table(name = "property_repair")
@AttributeOverride(name = "Id", column = @Column(name = "property_repair_id"))
public class PropertyRepair extends BaseEntity {

	private LocalDateTime dateTimeOfRepair;

	private String shortDescription;

	@Enumerated(EnumType.STRING)
	private RepairType repairType;

	@Enumerated(EnumType.STRING)
	private RepairStatus repairStatus;

	private double costOfRepair;

	@Lob
	private String longDescription;

	@ManyToOne(
//			cascade = CascadeType.ALL, 
			fetch = FetchType.LAZY)
	@JoinColumn(name = "vat_number")
	private PropertyOwner propertyOwner;

	@ManyToOne
	@JoinColumn(name = "property_id")
	private Property property;

	public PropertyRepair() {
	}

	public PropertyRepair(String Id, LocalDateTime dateTimeOfRepair, String shortDescription, String longDescription,
			RepairType repairType, RepairStatus repairStatus, double costOfRepair) {
		super(Id);
		this.dateTimeOfRepair = dateTimeOfRepair;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.repairType = repairType;
		this.repairStatus = repairStatus;
		this.costOfRepair = costOfRepair;
	}

	public LocalDateTime getDateTimeOfRepair() {
		return dateTimeOfRepair;
	}

	public void setDateTimeOfRepair(LocalDateTime dateTimeOfRepair) {
		this.dateTimeOfRepair = dateTimeOfRepair;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public RepairType getRepairType() {
		return repairType;
	}

	public void setRepairType(RepairType repairType) {
		this.repairType = repairType;
	}

	public RepairStatus getRepairStatus() {
		return repairStatus;
	}

	public void setRepairStatus(RepairStatus repairStatus) {
		this.repairStatus = repairStatus;
	}

	public double getCostOfRepair() {
		return costOfRepair;
	}

	public void setCostOfRepair(double costOfRepair) {
		this.costOfRepair = costOfRepair;
	}

	public PropertyOwner getPropertyOwner() {
		return propertyOwner;
	}

	public void setPropertyOwner(PropertyOwner propertyOwner) {
		this.propertyOwner = propertyOwner;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public String getDescription() {
		return longDescription;
	}

	public void setDescription(String LongDescription) {
		this.longDescription = LongDescription;
	}

	@Override
	public int hashCode() {
		return Objects.hash(costOfRepair, dateTimeOfRepair, longDescription, property, propertyOwner, repairStatus,
				repairType, shortDescription);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PropertyRepair other = (PropertyRepair) obj;
		return Double.doubleToLongBits(costOfRepair) == Double.doubleToLongBits(other.costOfRepair)
				&& Objects.equals(dateTimeOfRepair, other.dateTimeOfRepair)
				&& Objects.equals(longDescription, other.longDescription) && Objects.equals(property, other.property)
				&& Objects.equals(propertyOwner, other.propertyOwner) && repairStatus == other.repairStatus
				&& repairType == other.repairType && Objects.equals(shortDescription, other.shortDescription);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PropertyRepair [dateTimeOfRepair=");
		builder.append(dateTimeOfRepair);
		builder.append(", shortDescription=");
		builder.append(shortDescription);
		builder.append(", repairType=");
		builder.append(repairType);
		builder.append(", repairStatus=");
		builder.append(repairStatus);
		builder.append(", costOfRepair=");
		builder.append(costOfRepair);
		builder.append(", propertyOwner=");
		builder.append(propertyOwner);
		builder.append(", property=");
		builder.append(property);
		builder.append(", description=");
		builder.append(longDescription);
		builder.append("]");
		return builder.toString();
	}

}
