package com.panthers.warehouse;

import com.panthers.orders.PurchaseOrder;

public interface ShipperControls {
	public void generateManifest(PurchaseOrder po);
}
