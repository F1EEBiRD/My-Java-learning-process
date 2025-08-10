package Movie;

import java.util.Scanner;

//电影操作类
public class MovieOperator {
    private Movie[] movies;//记住一个电影对象的数值
    public MovieOperator(Movie[] movies){
        this.movies = movies;
    }
    //打印全部电影信息
    public void printALLMovies(){
        System.out.println("==============全部电影信息=================");
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println(m.getId() + "\t" + m.getName() + "\t" + m.getPrice() + "\t" + m.getActro());

        }

    }
//搜索电影
    public void searchMovieById() {
        System.out.println("请输入要查询的编号：");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if (m.getId() == id) {
                System.out.println(m.getId() + "\t" + m.getName() + "\t" + m.getPrice() + "\t" + m.getActro());
                return;
            }
        }
        System.out.println("没有找到该编号对应的电影");

    }
}
