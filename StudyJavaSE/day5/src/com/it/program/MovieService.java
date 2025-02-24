package com.it.program;

public class MovieService {
    private Movie[] movies;

    public MovieService() {
        movies = new Movie[10];
        movies[0] = new Movie(1, "阿甘", 20, "汤姆·汉克斯");
        movies[1] = new Movie(2, "肖申克的救赎", 30, "蒂姆·罗宾斯");
        movies[2] = new Movie(3, "泰坦尼克号", 40, "莱昂纳多·迪卡普里奥");
        movies[3] = new Movie(4, "霸王别姬", 50, "张国荣");
        movies[4] = new Movie(5, "这个杀手不太冷", 60, "让·雷诺");
    }

    public void display() {
        System.out.println("显示所有电影信息:");
        for (Movie movie : movies) {
            if (movie != null) {
                System.out.println("编号:" + movie.getId() + "\t" + "名称:" + movie.getName() + "\t" + "价格:" + movie.getPrice());
            }
        }
        System.out.println();
    }

    public void displayById(int id) {
        if (id > 0 && id < movies.length) {
            movies[id - 1].showdetails();
        } else {
            System.out.println("输入的编号不存在，请重新输入！");
        }
        System.out.println();
    }
}
