package com.techelevator.item;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.techelevator.FileReader;

public class Beverage extends Item {  

	private String noise;
	private String slot;

	public Beverage(String slot) {
		super(slot);
		this.slot = slot;
	}

	public String getSlot() {
		return slot;
	}
}
