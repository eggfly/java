/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-21 15:41:14
 * @LastEditTime: 2020-09-21 15:43:09
 * @FilePath: \java\jdk8\jdk85.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package jdk8;

public class jdk85 {
    public static void main(String[] args) {
        startThread(() -> System.out.println("线程任务执行"));
    }

    private static void startThread(Runnable task) {
        new Thread(task).start();
    }
}

/*
线程任务执行
*/