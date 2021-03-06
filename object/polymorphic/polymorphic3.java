/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-14 13:17:21
 * @LastEditTime: 2020-09-14 13:22:57
 * @FilePath: \java\object\polymorphic\polymorphic3.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package polymorphic;

public class polymorphic3 {
    public static void main(String[] args){
        // 向上转型
        Animal a = new Cat();
        a.eat();        // 调用的是 Cat 的 eat

        // 向下转型
        Cat c = (Cat)a;
        c.catchMouse();     // 调用的是 Cat 的 catchMouse
    }

    abstract static class Animal {
        abstract void eat();
    }

    static class Cat extends Animal{
        public void eat(){
            System.out.println("吃鱼");
        }

        public void catchMouse(){
            System.out.println("抓老鼠");
        }
    }

    class Dog extends Animal{
        public void eat(){
            System.out.println("吃骨头");
        }

        public void watchHouse(){
            System.out.println("看家");
        }
    }
}



/*
吃鱼
抓老鼠
*/