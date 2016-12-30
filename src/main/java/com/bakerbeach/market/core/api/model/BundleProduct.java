package com.bakerbeach.market.core.api.model;

import java.util.List;

import com.bakerbeach.market.core.api.model.BundleComponent;
import com.bakerbeach.market.core.api.model.Product;

public interface BundleProduct extends Product {

	List<BundleComponent> getComponents();

}
