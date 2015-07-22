package cn.freeteam.cms.dao;

import cn.freeteam.cms.model.TempletChannel;
import cn.freeteam.cms.model.TempletChannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TempletChannelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_templet_channel
     *
     * @mbggenerated Tue May 07 21:00:02 CST 2013
     */
    int countByExample(TempletChannelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_templet_channel
     *
     * @mbggenerated Tue May 07 21:00:02 CST 2013
     */
    int deleteByExample(TempletChannelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_templet_channel
     *
     * @mbggenerated Tue May 07 21:00:02 CST 2013
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_templet_channel
     *
     * @mbggenerated Tue May 07 21:00:02 CST 2013
     */
    int insert(TempletChannel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_templet_channel
     *
     * @mbggenerated Tue May 07 21:00:02 CST 2013
     */
    int insertSelective(TempletChannel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_templet_channel
     *
     * @mbggenerated Tue May 07 21:00:02 CST 2013
     */
    List<TempletChannel> selectByExampleWithBLOBs(TempletChannelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_templet_channel
     *
     * @mbggenerated Tue May 07 21:00:02 CST 2013
     */
    List<TempletChannel> selectByExample(TempletChannelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_templet_channel
     *
     * @mbggenerated Tue May 07 21:00:02 CST 2013
     */
    TempletChannel selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_templet_channel
     *
     * @mbggenerated Tue May 07 21:00:02 CST 2013
     */
    int updateByExampleSelective(@Param("record") TempletChannel record, @Param("example") TempletChannelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_templet_channel
     *
     * @mbggenerated Tue May 07 21:00:02 CST 2013
     */
    int updateByExampleWithBLOBs(@Param("record") TempletChannel record, @Param("example") TempletChannelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_templet_channel
     *
     * @mbggenerated Tue May 07 21:00:02 CST 2013
     */
    int updateByExample(@Param("record") TempletChannel record, @Param("example") TempletChannelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_templet_channel
     *
     * @mbggenerated Tue May 07 21:00:02 CST 2013
     */
    int updateByPrimaryKeySelective(TempletChannel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_templet_channel
     *
     * @mbggenerated Tue May 07 21:00:02 CST 2013
     */
    int updateByPrimaryKeyWithBLOBs(TempletChannel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_templet_channel
     *
     * @mbggenerated Tue May 07 21:00:02 CST 2013
     */
    int updateByPrimaryKey(TempletChannel record);
}