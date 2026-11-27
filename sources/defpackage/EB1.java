package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class EB1 {
    public static AbstractC4836kD1 a(Callable<AbstractC4836kD1> callable) {
        try {
            AbstractC4836kD1 abstractC4836kD1Call = callable.call();
            C1589Ne.r(abstractC4836kD1Call, "Scheduler Callable result can't be null");
            return abstractC4836kD1Call;
        } catch (Throwable th) {
            throw C90.a(th);
        }
    }

    public static void b(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th instanceof C2663a91) && !(th instanceof C7940z01) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof HH)) {
            th = new C7575xF1(th);
        }
        th.printStackTrace();
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
