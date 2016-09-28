package io.reactivesw.catalog.domain.entity;

import com.google.common.base.Objects;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * this is the entity class for attribute value.
 * 
 * @author Davis
 *
 */
@Entity
@Table(name = "sw_attribute_value")
public class AttributeValue implements Serializable {
  private static final long serialVersionUID = -6486752768122183026L;

  /**
   * id for attribute value. auto generated by database.
   */
  @Id
  @Column(name = "attribute_value_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  /**
   * value for attribute value.
   */
  @Size(max = 255)
  @Column(name = "value", length = 255, nullable = false)
  private String value;

  /**
   * create time.
   */
  @Column(name = "create_time")
  private Date createTime;

  /**
   * last modified time.
   */
  @Column(name = "last_modified_time")
  private Date lastModifiedTime;

  /**
   * attribute.
   */
  @ManyToOne(targetEntity = Attribute.class, cascade = CascadeType.ALL)
  @JoinColumn(name = "attribute_id")
  private Attribute attribute;

  /**
   * get id.
   * 
   * @return the id
   */
  public long getId() {
    return id;
  }

  /**
   * set id.
   * 
   * @param id the id to set
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * get value.
   * 
   * @return the value
   */
  public String getValue() {
    return value;
  }

  /**
   * set value.
   * 
   * @param value the value to set
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * get createTime.
   * 
   * @return the create time.
   */
  public Date getCreateTime() {
    return new Date(createTime.getTime());
  }

  /**
   * set createTime.
   * 
   * @param createTime the create time to set
   */
  public void setCreateTime(Date createTime) {
    this.createTime = new Date(createTime.getTime());
  }

  /**
   * get lastModifiedTime.
   * 
   * @return last modified time.
   */
  public Date getLastModifiedTime() {
    return new Date(lastModifiedTime.getTime());
  }

  /**
   * set lastModifiedTime.
   * 
   * @param lastModifiedTime the last modified time
   */
  public void setLastModifiedTime(Date lastModifiedTime) {
    this.lastModifiedTime = new Date(lastModifiedTime.getTime());
  }

  /**
   * get attribute.
   * 
   * @return the attribute
   */
  public Attribute getAttribute() {
    return attribute;
  }

  /**
   * set attribute.
   * 
   * @param attribute the attribute to set
   */
  public void setAttribute(Attribute attribute) {
    this.attribute = attribute;
  }

  /**
   * hashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hashCode(id, value);
  }

  /**
   * equals.
   */
  @Override
  public boolean equals(Object obj) {
    boolean equalsResult = false;
    if (this == obj) {
      equalsResult = true;
    } else if (obj instanceof AttributeValue) {
      final AttributeValue other = (AttributeValue) obj;
      equalsResult = Objects.equal(id, other.id) && Objects.equal(value, other.value);
    }
    return equalsResult;
  }
}
