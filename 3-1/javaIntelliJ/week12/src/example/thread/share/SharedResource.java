package example.thread.share;

class SharedResource {
    long nF1 = 1, nF2 = 1, nResult = 0;
    public synchronized void changeShared(String srName) { // 임계 영역
        nResult = nF1 + nF2;
        for(long i=0; i<1000000; i++) {}
        nF2 = nF1;
        for(long i=0; i<1000000; i++) {}
        nF1 = nResult;
        System.out.println(srName + ":" + nResult);
    }
}
