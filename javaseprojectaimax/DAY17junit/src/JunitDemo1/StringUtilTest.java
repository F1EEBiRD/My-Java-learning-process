package JunitDemo1;

import org.junit.Assert;
import org.junit.Test;


// 测试类：junit单元测试框架，对业务类中的业务方法进行正确性测试
public class StringUtilTest {
    //测试方法必须是公开public，无参，无返回值。
    // 测试方法必须以@test注解（Junit框架核心步骤）
    @Test
    public void testPrinNumber() {
        //测试步骤
        StringUtil.printNumber("张三ZBC");//5
        //测试用例
        StringUtil.printNumber(" ");
        StringUtil.printNumber(null);
    }
        @Test
                public void testGetMaxIndex() {
                    //测试步骤
                    int index1 = StringUtil.getMaxIndex("abcdefg");//6
                    System.out.println(index1);
                    //测试
                    int index2 = StringUtil.getMaxIndex("");
                    System.out.println(index2);
                    int index3 = StringUtil.getMaxIndex(null);
                    System.out.println(index3);

                    //做断言：断言结果是否与预期结果一致
            Assert.assertEquals("本轮测试失败，业务获取最大索引有问题！请检查", 6, index1);

                }
    }

