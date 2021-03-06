/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-16 17:56:00
 * @LastEditTime: 2020-09-16 18:01:40
 * @FilePath: \java\Generic\Generic3.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Generic;

public class Generic3 {
    public static void main(String[] args) {
        // 创建一个泛型为String的类
        MyGenericClass<String> my = new MyGenericClass<String>();
        // 调用setMVP
        my.setMvp("cpucode");
        // 调用getMVP
        String mvp = my.getMvp();

        System.out.println(mvp);

        //创建一个泛型为Integer的类
        MyGenericClass<Integer> my2 = new MyGenericClass<Integer>();
        my2.setMvp(100);
        Integer mvp2 = my2.getMvp();

        System.out.println(mvp2);
    }
}

class MyGenericClass<MVP> {
    //没有MVP类型，在这里代表 未知的一种数据类型 未来传递什么就是什么类型
    private MVP mvp;

    public void setMvp(MVP mvp) {
        this.mvp = mvp;
    }

    public MVP getMvp() {
        return mvp;
    }
}

/*
cpucode
100
*/