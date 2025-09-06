public class TestCaptchaClient {

    static CaptchaClient simpleCaptchaClient = null;
    static CaptchaClient chineseCaptchaClient = null;
    static CaptchaClient calculateCaptchaClient = null;


    static {
        simpleCaptchaClient = CaptchaClient.create().
                            captchaStrategy(new SimpleCaptchaStrategy())
                            .build();
        chineseCaptchaClient = CaptchaClient.create()
                        .captchaStrategy(new ChineseCaptchaStrategy())
                        .build();

        calculateCaptchaClient = CaptchaClient.create()
                        .width(90)
                        .height(30)
                        .lineNum(1)
                        .yawp(0.01f)
                        .captchaStrategy(new CalculateCaptchaStrategy())
                        .transform(true)
                        .color(new Color(253, 251, 255))
                        .build();
    }

    public static void main(String[] args) {
        getSimple("/Users/shuzhilong/Documents/temp/SimpleCaptchaStrategy.jpg");
        getChinese("/Users/shuzhilong/Documents/temp/ChineseCaptchaStrategy.jpg");
        getCalculate("/Users/shuzhilong/Documents/temp/CalculateCaptchaStrategy.jpg");
    }

    public static void getSimple(String filepath) {
        CaptchaBean captchaBean = simpleCaptchaClient.generate();

        File file = new File(filepath);
        try {
            file.createNewFile();
            ImageIO.write(captchaBean.getBufferedImage(), "JPG", file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(captchaBean.getResult());

    }

    public static void getChinese(String filepath) {
        CaptchaBean captchaBean = chineseCaptchaClient.generate();

        File file = new File(filepath);
        try {
            file.createNewFile();
            ImageIO.write(captchaBean.getBufferedImage(), "JPG", file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(captchaBean.getResult());

    }

    public static void getCalculate(String filepath) {
        CaptchaBean captchaBean = calculateCaptchaClient.generate();

        File file = new File(filepath);
        try {
            file.createNewFile();
            ImageIO.write(captchaBean.getBufferedImage(), "JPG", file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(captchaBean.getResult());

    }
}