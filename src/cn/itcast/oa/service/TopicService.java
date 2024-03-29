package cn.itcast.oa.service;

import java.util.List;

import cn.itcast.oa.base.BaseDao;
import cn.itcast.oa.domain.Forum;
import cn.itcast.oa.domain.Topic;

public interface TopicService extends BaseDao<Topic> {

	/**
	 * 查询指定版块中的主题列表，排序：所有置顶帖都在最上面，然后把最新状态的主题显示到前面。
	 * 
	 * @param forum
	 * @return
	 */
	List<Topic> findByForum(Forum forum);

}
