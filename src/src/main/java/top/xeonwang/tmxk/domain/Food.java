package top.xeonwang.tmxk.domain;

public class Food
{
	private String FoodId;
	private String FoodName;
	private String FoodType;
	private Integer FoodStock;
	private String FoodUnit;
	private String FoodImg;

	public String getFoodId()
	{
		return this.FoodId;
	}

	public void setFoodId(String id)
	{
		this.FoodId = id;
	}
	public String getFoodName()
	{
		return this.FoodName;
	}

	public void setFoodName(String name)
	{
		this.FoodName = name;
	}
	public String getFoodType()
	{
		return this.FoodType;
	}

	public void setFoodType(String type)
	{
		this.FoodType = type;
	}
	public Integer getFoodStock()
	{
		return this.FoodStock;
	}

	public void setFoodStock(Integer stock)
	{
		this.FoodStock = stock;
	}
	public String getFoodUnit()
	{
		return this.FoodUnit;
	}

	public void setFoodUnit(String unit)
	{
		this.FoodUnit = unit;
	}
	public String getFoodImg()
	{
		return this.FoodImg;
	}

	public void setFoodImg(String img)
	{
		this.FoodImg = img;
	}

}