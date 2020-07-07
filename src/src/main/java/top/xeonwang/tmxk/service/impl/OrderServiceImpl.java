package top.xeonwang.tmxk.service.impl;

import javax.annotation.Resource;

import top.xeonwang.tmxk.dao.OrderMapper;
import top.xeonwang.tmxk.service.OrderService;

public class OrderServiceImpl implements OrderService
{
	@Resource
	public OrderMapper ordermapper;

	@Override
	public void AddOrder(String DataTime, String OrderStatus)
	{
		// TODO Auto-generated method stub
		ordermapper.AddOrder(DataTime, OrderStatus);
	}

	@Override
	public void UpdateStatus(String OrderId,String OrderStatus)
	{
		// TODO Auto-generated method stub
		ordermapper.UpdateStatus(OrderId,OrderStatus);
	}

	@Override
	public void DropOrder(String OrderId)
	{
		// TODO Auto-generated method stub
		ordermapper.DropOrder(OrderId);
	}
}