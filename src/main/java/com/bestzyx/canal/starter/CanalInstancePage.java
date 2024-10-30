package com.bestzyx.canal.starter;

import java.util.List;
import java.util.Objects;

/**
 * Created by zhangyongxiang on 2024/4/2 8:22 PM
 **/

public class CanalInstancePage<T> {
    
    private Integer count;
    
    private Integer offset;
    
    private Integer page;
    
    private Integer size;
    
    private List<T> items;
    
    public Integer getCount() {
        return count;
    }
    
    public void setCount(final Integer count) {
        this.count = count;
    }
    
    public Integer getOffset() {
        return offset;
    }
    
    public void setOffset(final Integer offset) {
        this.offset = offset;
    }
    
    public Integer getPage() {
        return page;
    }
    
    public void setPage(final Integer page) {
        this.page = page;
    }
    
    public Integer getSize() {
        return size;
    }
    
    public void setSize(final Integer size) {
        this.size = size;
    }
    
    public List<T> getItems() {
        return items;
    }
    
    public void setItems(final List<T> items) {
        this.items = items;
    }
    
    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof final CanalInstancePage<?> that)) {
            return false;
        }
        return Objects.equals(getCount(), that.getCount())
                && Objects.equals(getOffset(), that.getOffset())
                && Objects.equals(getPage(), that.getPage())
                && Objects.equals(getSize(), that.getSize())
                && Objects.deepEquals(getItems(), that.getItems());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getCount(), getOffset(), getPage(), getSize(),
                getItems());
    }
    
    @Override
    public String toString() {
        return "InstancePage{" + "count=" + count + ", offset=" + offset
                + ", page=" + page + ", size=" + size + ", items=" + items
                + '}';
    }
}
