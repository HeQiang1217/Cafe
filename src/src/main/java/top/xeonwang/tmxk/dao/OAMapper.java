package top.xeonwang.tmxk.dao;

import org.apache.ibatis.annotations.Param;

public interface OAMapper
{
	//新建 订单-管理员-用户
	public void AddOA(@Param("OrderId") String OrderId,@Param("AdminId") String AdminId,@Param("UserId") String UserId);
	//删除 订单-管理员-用户
	public void DropOa(@Param("OrderId") String OrderId,@Param("AdminId") String AdminId,@Param("UserId") String UserId);
	
	
}
