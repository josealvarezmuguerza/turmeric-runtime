package org.ebayopensource.qajunittests.advertisinguniqueidservicev2consumer.sif.caching;

import javax.xml.bind.annotation.XmlElement;

public class AnnotateGetItemRequest2 {

    protected Integer id1;
    protected Integer itemId;

    public Integer getId1() {
        return id1;
    }

    public void setId1(Integer value) {
        this.id1 = value;
    }
    
    public Integer getTestItem() {
        return itemId;
    }
    
    @XmlElement(name = "ABC")
    public void setTestItem(Integer value) {
        this.itemId = value;
    }

}
