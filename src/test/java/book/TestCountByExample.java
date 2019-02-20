package book;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Assert;
import org.junit.Test;
import demo.dto.BookExample;
import demo.mapper.BookMapper;
import util.MyBatisUtil;

/**
 * @author : Lin Can
 * @date : 2019/2/20 15:29
 */
public class TestCountByExample {
    private SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();


    @Test
    public void test1() {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
            BookExample bookExample = new BookExample();
            bookExample.createCriteria().andBookIdEqualTo(1001L);
            long result = bookMapper.countByExample(bookExample);
            Assert.assertEquals(1,result);
        }
    }
}
