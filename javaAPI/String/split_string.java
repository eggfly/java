/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-12 21:19:11
 * @LastEditTime: 2020-09-12 21:24:26
 * @FilePath: \java\javaAPI\String\split_string.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.String;

public class split_string {
    public static void main(String[] args){
        String s = "cpu|co|de";
        String[] strArray = s.split("|");

        for(int i = 0; i < strArray.length; i++){
            System.out.println(strArray[i]);
        }
    }
}

/*
cpu|co|de
*/