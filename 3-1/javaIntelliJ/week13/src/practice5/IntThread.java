package practice5;

class IntThread extends Thread {
    @Override
    public void run() {
        int[] intArray = {3,14,52,7,11,8,90,74};
        try {
            for (int i = 0; i < intArray.length; i++) {
                System.out.println("int-thread : " + intArray[i]);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
