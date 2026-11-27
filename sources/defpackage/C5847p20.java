package defpackage;

import com.google.android.gms.common.api.Api;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: p20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5847p20 {

    @Nullable
    public ThreadPoolExecutor a;

    @NotNull
    public final ArrayDeque<C3233co1.a> b = new ArrayDeque<>();

    @NotNull
    public final ArrayDeque<C3233co1.a> c = new ArrayDeque<>();

    @NotNull
    public final ArrayDeque<C3233co1> d = new ArrayDeque<>();

    @NotNull
    public final synchronized ExecutorService a() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (this.a == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String name = C6806tc2.g + " Dispatcher";
                Intrinsics.checkNotNullParameter(name, "name");
                this.a = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60L, timeUnit, synchronousQueue, new ThreadFactoryC5967pc2(name, false));
            }
            threadPoolExecutor = this.a;
            Intrinsics.checkNotNull(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public final void b(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            Unit unit = Unit.a;
        }
        d();
    }

    public final void c(@NotNull C3233co1.a call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.e.decrementAndGet();
        b(this.c, call);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    public final void d() {
        int size;
        int i;
        C3233co1.a aVar;
        byte[] bArr = C6806tc2.a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<C3233co1.a> it = this.b.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    C3233co1.a asyncCall = it.next();
                    if (this.c.size() >= 64) {
                        break;
                    }
                    if (asyncCall.e.get() < 5) {
                        it.remove();
                        asyncCall.e.incrementAndGet();
                        Intrinsics.checkNotNullExpressionValue(asyncCall, "asyncCall");
                        arrayList.add(asyncCall);
                        this.c.add(asyncCall);
                    }
                }
                synchronized (this) {
                    this.c.size();
                    this.d.size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    aVar = (C3233co1.a) arrayList.get(i);
                    ExecutorService executorService = a();
                    aVar.getClass();
                    Intrinsics.checkNotNullParameter(executorService, "executorService");
                    C3233co1 c3233co1 = aVar.g;
                    C5847p20 c5847p20 = c3233co1.d.d;
                    byte[] bArr2 = C6806tc2.a;
                    try {
                        try {
                            ((ThreadPoolExecutor) executorService).execute(aVar);
                        } catch (RejectedExecutionException e) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e);
                            c3233co1.i(interruptedIOException);
                            aVar.d.b(c3233co1, interruptedIOException);
                            c3233co1.d.d.c(aVar);
                        }
                    } catch (Throwable th) {
                        c3233co1.d.d.c(aVar);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Unit unit = Unit.a;
        size = arrayList.size();
        while (i < size) {
            aVar = (C3233co1.a) arrayList.get(i);
            ExecutorService executorService2 = a();
            aVar.getClass();
            Intrinsics.checkNotNullParameter(executorService2, "executorService");
            C3233co1 c3233co2 = aVar.g;
            C5847p20 c5847p21 = c3233co2.d.d;
            byte[] bArr3 = C6806tc2.a;
            ((ThreadPoolExecutor) executorService2).execute(aVar);
        }
    }
}
