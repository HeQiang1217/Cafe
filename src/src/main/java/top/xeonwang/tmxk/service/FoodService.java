package top.xeonwang.tmxk.service;

import java.util.ArrayList;

import top.xeonwang.tmxk.domain.Food;

public interface FoodService
{
	//增加菜单
	public void AddFood(String FoodName,String FoodType,Integer FoodStore,String FoodUnit,String FoodImg,double FoodPrice);
	//修改菜单
	public void UpdateName(String FoodId,String FoodName);
	public void UpdateType(String FoodId,String FoodType);
	public void UpdateStore(String FoodId,Integer FoodStore);
	public void UpdateUnit(String FoodId,String FoodUnit);
	public void UpdateImg(String FoodId,String FoodImg);
	public void UpdatePrice(String FoodId,double FoodPrice);
	//根据名字查找id
	public String FindByName(String FoodName);
	//删除菜单
	public void DropFood(String FoodId);
	//获取全部菜单
	public ArrayList<Food> GetAll();
}
