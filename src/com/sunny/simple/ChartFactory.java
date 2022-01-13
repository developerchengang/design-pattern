package com.sunny.simple;

/**
 * 图表工厂类：工厂类
 */
public class ChartFactory {

    public static Chart createChart(ChartType type) {
        Chart chart = null;
        switch (type) {
            case HISTOGRAM:
                chart = new HistogramChart();
                System.out.println("初始化设置柱状图！");
                break;
            case PIE:
                chart = new PieChart();
                System.out.println("初始化设置饼状图！");
                break;
            case LINE:
                chart = new LineChart();
                System.out.println("初始化设置折线图！");
                break;
        }

        return chart;
    }

}
