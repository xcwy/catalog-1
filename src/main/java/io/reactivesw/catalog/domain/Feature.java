package io.reactivesw.catalog.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * this is entity class for feature.
 * 
 * @author Davis
 *
 */
@Entity
@Table(name = "sw_feature")
public class Feature implements Serializable {

  /**
   * serialVersionUID.
   */
  private static final long serialVersionUID = 5183827823083989429L;

  /**
   * id for feature. auto generated by database;
   */
  @Id
  @Column(name = "feature_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  /**
   * name for feature. max length is 16, not null.
   */
  @Size(max = 16)
  @Column(name = "name", length = 16, nullable = false)
  private String name;

  /**
   * description for feature. max length is 1024.
   */
  @Size(max = 1024)
  @Column(name = "description", length = 1024)
  private String description;

  /**
   * display order for feature.
   */
  @Column(name = "display_order")
  private int displayOrder;

  /**
   * create time for feature.
   */
  @Column(name = "create_time")
  private Date createTime;

  /**
   * last modified time for feature.
   */
  @Column(name = "last_modified_time")
  private Date lastModifiedTime;

  /**
   * get id.
   * 
   * @return id.
   */
  public long getId() {
    return id;
  }

  /**
   * set id.
   * 
   * @param id id.
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * get name.
   * 
   * @return name.
   */
  public String getName() {
    return name;
  }

  /**
   * set name.
   * 
   * @param name name.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * get description.
   * 
   * @return description.
   */
  public String getDescription() {
    return description;
  }

  /**
   * set description.
   * 
   * @param description description.
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * get display order.
   * 
   * @return displayOrder.
   */
  public int getDisplayOrder() {
    return displayOrder;
  }

  /**
   * set displayorder.
   * 
   * @param displayOrder.
   */
  public void setDisplayOrder(int displayOrder) {
    this.displayOrder = displayOrder;
  }

  /**
   * get create time.
   * 
   * @return createTime.
   */
  public Date getCreateTime() {
    return new Date(createTime.getTime());
  }

  /**
   * set create time.
   * 
   * @param createTime.
   */
  public void setCreateTime(Date createTime) {
    this.createTime = new Date(createTime.getTime());
  }

  /**
   * get lastModifiedTime.
   * 
   * @return lastModifiedTime.
   */
  public Date getLastModifiedTime() {
    return new Date(lastModifiedTime.getTime());
  }

  /**
   * set lastModifiedTime.
   * 
   * @param lastModifiedTime.
   */
  public void setLastModifiedTime(Date lastModifiedTime) {
    this.lastModifiedTime = new Date(lastModifiedTime.getTime());
  }

  /**
   * hashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, displayOrder);
  }

  /**
   * equals.
   */
  @Override
  public boolean equals(Object obj) {
    boolean equalsResult = false;
    if (this == obj) {
      equalsResult = true;
    } else if (obj instanceof Feature) {
      final Feature other = (Feature) obj;
      equalsResult = Objects.equals(id, other.id) && Objects.equals(name, other.name)
          && Objects.equals(description, other.description)
          && Objects.equals(displayOrder, other.displayOrder);
    }
    return equalsResult;
  }
}
