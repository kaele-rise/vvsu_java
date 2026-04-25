package lab10;

public class testProduct {
    public static void main(String[] args) throws InterruptedException {

        Thread a = new Thread(() -> {
            try {
                while (Product.productCount < Product.productLimit) {
                    Product.queueA.put(new Object());
                    System.out.println("+A, на складе: " + Product.queueA.size());
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
            }
        });

        Thread c = new Thread(() -> {
            try {
                while (Product.productCount < Product.productLimit) {
                    Product.queueC.put(new Object());
                    System.out.println("+C, на складе: " + Product.queueC.size());
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
            }
        });

        Thread d = new Thread(() -> {
            try {
                while (Product.productCount < Product.productLimit) {
                    Product.queueD.put(new Object());
                    System.out.println("+D, на складе: " + Product.queueD.size());
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
            }
        });

        Thread b = new Thread(() -> {
            try {
                while (Product.productCount < Product.productLimit) {
                    Product.queueC.take();
                    Product.queueD.take();
                    Thread.sleep(3000);
                    Product.queueB.put(new Object());
                    System.out.println("+B, на складе: " + Product.queueB.size());

                }
            } catch (InterruptedException e) {
            }
        });

        Thread product = new Thread(() -> {
            try {
                while (Product.productCount < Product.productLimit) {
                    Product.queueA.take();
                    Product.queueB.take();
                    Thread.sleep(2000);
                    Product.productCount++;
                    System.out.println("+Продукт, всего: " + Product.productCount);

                }
            } catch (InterruptedException e) {
            }
        });

        a.start();
        c.start();
        d.start();
        b.start();
        product.start();

        product.join();

        a.interrupt();
        c.interrupt();
        d.interrupt();
        b.interrupt();

        System.out.println("Конвейер остановлен");
    }
}