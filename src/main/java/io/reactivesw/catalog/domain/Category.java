package io.reactivesw.catalog.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * this is the entity class for category.
 * 
 * @author Davis
 *
 */
@Entity
@Table(name = "SW_CATEGORY")
public class Category implements Serializable {
  private static final long serialVersionUID = 8764204942198494928L;

  /**
   * id for category. auto generated by database.
   */
  @Id
  @Column(name = "category_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  /**
   * name for category. max length is 255, cann't be null.
   */
  @Column(name = "name", length = 255, nullable = false)
  private String name;

  /**
   * description for category. max length is 1024, can be null.
   */
  @Column(name = "description", length = 1024)
  private String description;

  /**
   * display order for category.
   */
  @Column(name = "display_order")
  private int displayOrder;

  /**
   * depth for category.
   */
  @Column(name = "depth")
  private int depth;

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
   * subcategories.
   */
  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
  @JoinTable(name = "sw_category_xref", joinColumns = @JoinColumn(name = "parent_id") ,
      inverseJoinColumns = @JoinColumn(name = "sub_category_id") )
  private Set<Category> subCategories;

  /**
   * products.
   */
  @OneToMany(mappedBy = "category")
  private Set<Product> products = new HashSet<Product>();

  /**
   * get if for category.
   * 
   * @return id
   */
  public long getId() {
    return id;
  }

  /**
   * set if for category.
   * 
   * @param id id.
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * get name for category.
   * 
   * @return name.
   */
  public String getName() {
    return name;
  }

  /**
   * set name for category.
   * 
   * @param name name.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * get description for category.
   * 
   * @return description.
   */
  public String getDescription() {
    return description;
  }

  /**
   * set description for category.
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
   * set display order.
   * 
   * @param displayOrder displayOrder
   */
  public void setDisplayOrder(int displayOrder) {
    this.displayOrder = displayOrder;
  }

  /**
   * get depth.
   * 
   * @return depth.
   */
  public int getDepth() {
    return depth;
  }

  /**
   * set depth.
   * 
   * @param depth depth.
   */
  public void setDepth(int depth) {
    this.depth = depth;
  }

  /**
   * get create time.
   * 
   * @return create time.
   */
  public Date getCreateTime() {
    return new Date(createTime.getTime());
  }

  /**
   * set create time.
   * 
   * @param createTime create time.
   */
  public void setCreateTime(Date createTime) {
    this.createTime = new Date(createTime.getTime());
  }

  /**
   * get last modified time.
   * 
   * @return lastModifiedTime.
   */
  public Date getLastModifiedTime() {
    return new Date(lastModifiedTime.getTime());
  }

  /**
   * set last modified time.
   * 
   * @param lastModifiedTime last modified time.
   */
  public void setLastModifiedTime(Date lastModifiedTime) {
    this.lastModifiedTime = new Date(lastModifiedTime.getTime());
  }

  /**
   * get all products.
   * 
   * @return products.
   */
  public Set<Product> getProducts() {
    return products;
  }

  /**
   * set products.
   * 
   * @param products products.
   */
  public void setProducts(Set<Product> products) {
    this.products = products;
  }

  /**
   * get all subcategories.
   * 
   * @return list of subcategories.
   */
  public Set<Category> getSubCategories() {
    return subCategories;
  }

  /**
   * set subcategories.
   * 
   * @param subCategories subcategories.
   */
  public void setSubCategories(Set<Category> subCategories) {
    this.subCategories = subCategories;
  }

  /**
   * hashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, displayOrder, depth);
  }

  /**
   * equals.
   */
  @Override
  public boolean equals(Object obj) {
    boolean equalsResult = false;
    if (this == obj) {
      equalsResult = true;
    } else if (obj instanceof Category) {
      final Category other = (Category) obj;
      equalsResult = Objects.equals(id, other.id) && Objects.equals(name, other.name)
          && Objects.equals(description, other.description)
          && Objects.equals(displayOrder, other.displayOrder) && Objects.equals(depth, other.depth);
    }
    return equalsResult;
  }
}
