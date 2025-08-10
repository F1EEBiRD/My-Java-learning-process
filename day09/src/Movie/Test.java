package Movie;

public class Test {
    public static void main(String[] args) {
        //目标：完成面向对象的综合小案例
        //1.设计电影类Movie，以便创造电影对象，封装电影数据。
        //2.封装系统中的全部电影数据。（自己造一些数据）
        Movie[] movies = new Movie[5];
        movies[0] = new Movie(1,"唐顿庄园",19.9,"罗宾·怀特");
        movies[1] = new Movie(2,"唐顿庄园2",19.9,"罗宾·怀特");
        movies[2] = new Movie(3,"唐顿庄园3",19.9,"罗宾·怀特");
        movies[3] = new Movie(4,"唐顿庄园4",19.9,"罗宾·怀特");
        movies[4] = new Movie(5,"唐顿庄园5",19.9,"罗宾·怀特");

        //3.创建电操作对象出来，专门负责电影数据的业务操作
        MovieOperator mo = new MovieOperator(movies);
        mo.printALLMovies();
        mo.searchMovieById();

        }

    }

