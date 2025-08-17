package MovieManagerSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieService {
    //4.准备一个集合容器，存储全部上架的电影数据
    private static List<Movie> movies = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);




    public void start(){
        while (true) {
            //3.准备操作界面
            System.out.println("==欢迎来到电影管理系统==");
            System.out.println("1.上架");
            System.out.println("2.下架");
            System.out.println("3.查询");
            System.out.println("4.封杀明星");
            System.out.println("5.退出");
            System.out.println("6.修改电影信息");
            System.out.println("7.展示全部电影");
            System.out.println("请输入操作命令");
            String command = sc.next();
            switch (command){
                case "1":
                    //1.上架（独立功能独立成立方法）
                    addMovie();
                    break;
                case "2":
                    //2.下架
                    deleteMovie();
                    break;
                case "3":
                    //3.查询
                    queryMovie();
                    break;
                case "4":
                    //4.封杀明星
                    killActor();
                    break;
                case "5":
                    //5.退出
                    System.out.println("退出系统");
                    return;
                case "6":
                    //6.修改电影信息
                    updateMovie();
                    break;
                case "7":
                    //7.展示全部电影
                    showALLMovies();
                    break;
                default:
                    System.out.println("输入错误");
            }
        }
    }

    /**
     * 修改电影信息
     */

    private void updateMovie() {
        System.out.println("================修改电影信息================");
        System.out.println("请输入要修改的电影名称：");
        String name = sc.next();
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            if (movie.getName().equals(name)) {
                System.out.println("请输入新的电影名称：");
                movie.setName(sc.next());
                System.out.println("请输入新的主演：");
                movie.setActor(sc.next());
                System.out.println("请输入新的价格：");
                movie.setPrice(sc.nextDouble());
                System.out.println("请输入新的评分：");
                movie.setScore(sc.nextDouble());
                System.out.println("修改成功");
                return;
            }
            System.out.println("没有找到该电影");
        }
    }

    /**
     * 展示全部电影
     */
    private void showALLMovies() {
        System.out.println("================展示全部电影================");
        for (Movie m : movies){
            System.out.println(m.getName() + " " + m.getScore() + " " + m.getActor() + " " + m.getPrice());
        }
    }

    /**
     * 封杀明星
     */
    private void killActor() {
        System.out.println("================封杀明星================");
        System.out.println("请输入要封杀的明星名称：");
        String name = sc.next();
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            if (movie.getActor().contains(name)) {
                movies.remove(movie);
                System.out.println("封杀成功");
                i--;//删除一个元素，索引位置会自动前移，所以i--
            }
        }
        //展示当前全部电影
        showALLMovies();
    }


    /**
     * 查询电影
     */
    private void queryMovie() {
        System.out.println("================查询电影================");
        System.out.println("请输入电影名称：");
        String name = sc.next();
        //根据电影名称查询电影对象返回，显示这个对象数据。
        Movie movie = queryMovie(name);
        if (movie != null) {
            System.out.println(movie.getName() + " " + movie.getActor() + " " + movie.getScore() + " " + movie.getPrice() );
        } else {
            System.out.println("没有找到");
        }
    }

    //movies = [m1,m2,m3,.....]
    //遍历集合movies,最好新建方法然后返回
        public Movie queryMovie(String name) {
            for (Movie movie : movies) {
                if (movie.getName().equals(name)) {
                    return movie;//找到了
                }
            }
            return null;//集合中没有找到
        }



    /**
     * 上架电影
     */
    private void addMovie() {
        System.out.println("================上架电影================");
        //每点击一次商家电影，其实就是新增一部电影，每部电影是一个电影对象封装数据的
        //1.创造电影对象，封装这部电影信息。
        Movie movie = new Movie();
        //2.把电影对象注入到数据中。
        System.out.println("请输入电影名称：");
        movie.setName(sc.next());
        System.out.println("请输入主演：");
        movie.setActor(sc.next());
        System.out.println("请输入电影价格：");
        movie.setPrice(sc.nextDouble());
        System.out.println("请输入电影评分：");
        movie.setScore(sc.nextDouble());

        //3.把电影对象添加到集合中
        movies.add(movie);
        System.out.println("上架成功");
    }

    /**
     * 删除电影
     */
    private void deleteMovie() {
        System.out.println("================下架电影================");
        System.out.println("请输入电影名称：");
        String name = sc.next();
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            if (movie.getName().equals(name)) {
                movies.remove(i);
                System.out.println("下架成功");
                return;
            }
        }
        //展示当前全部电影
        showALLMovies();

    }

}

