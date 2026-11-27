package defpackage;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zX1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8049zX1 {

    @NotNull
    public static final C8049zX1 h;

    @NotNull
    public static final Logger i;

    @NotNull
    public final a a;
    public int b;
    public boolean c;
    public long d;

    @NotNull
    public final ArrayList e;

    @NotNull
    public final ArrayList f;

    @NotNull
    public final AX1 g;

    /* JADX INFO: renamed from: zX1$a */
    public static final class a {

        @NotNull
        public final ThreadPoolExecutor a;

        public a(@NotNull ThreadFactoryC5967pc2 threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.a = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        public final void a(@NotNull AX1 runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.a.execute(runnable);
        }
    }

    static {
        String name = C6806tc2.g + " TaskRunner";
        Intrinsics.checkNotNullParameter(name, "name");
        h = new C8049zX1(new a(new ThreadFactoryC5967pc2(name, true)));
        Logger logger = Logger.getLogger(C8049zX1.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(TaskRunner::class.java.name)");
        i = logger;
    }

    public C8049zX1(@NotNull a backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.a = backend;
        this.b = 10000;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new AX1(this);
    }

    public static final void a(C8049zX1 c8049zX1, AbstractC6578sX1 abstractC6578sX1) {
        c8049zX1.getClass();
        byte[] bArr = C6806tc2.a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(abstractC6578sX1.a);
        try {
            long jA = abstractC6578sX1.a();
            synchronized (c8049zX1) {
                c8049zX1.b(abstractC6578sX1, jA);
                Unit unit = Unit.a;
            }
        } finally {
            synchronized (c8049zX1) {
                c8049zX1.b(abstractC6578sX1, -1L);
                Unit unit2 = Unit.a;
                threadCurrentThread.setName(name);
            }
        }
    }

    public final void b(AbstractC6578sX1 abstractC6578sX1, long j) {
        byte[] bArr = C6806tc2.a;
        C7839yX1 c7839yX1 = abstractC6578sX1.c;
        Intrinsics.checkNotNull(c7839yX1);
        if (c7839yX1.d != abstractC6578sX1) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z = c7839yX1.f;
        c7839yX1.f = false;
        c7839yX1.d = null;
        this.e.remove(c7839yX1);
        if (j != -1 && !z && !c7839yX1.c) {
            c7839yX1.e(abstractC6578sX1, j, true);
        }
        if (c7839yX1.e.isEmpty()) {
            return;
        }
        this.f.add(c7839yX1);
    }

    @Nullable
    public final AbstractC6578sX1 c() {
        long j;
        AbstractC6578sX1 abstractC6578sX1;
        boolean z;
        byte[] bArr = C6806tc2.a;
        while (true) {
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                return null;
            }
            a aVar = this.a;
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            AbstractC6578sX1 abstractC6578sX2 = null;
            while (true) {
                if (!it.hasNext()) {
                    j = jNanoTime;
                    abstractC6578sX1 = null;
                    z = false;
                    break;
                }
                AbstractC6578sX1 abstractC6578sX3 = (AbstractC6578sX1) ((C7839yX1) it.next()).e.get(0);
                j = jNanoTime;
                abstractC6578sX1 = null;
                long jMax = Math.max(0L, abstractC6578sX3.d - j);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC6578sX2 != null) {
                        z = true;
                        break;
                    }
                    abstractC6578sX2 = abstractC6578sX3;
                }
                jNanoTime = j;
            }
            ArrayList arrayList2 = this.e;
            if (abstractC6578sX2 != null) {
                byte[] bArr2 = C6806tc2.a;
                abstractC6578sX2.d = -1L;
                C7839yX1 c7839yX1 = abstractC6578sX2.c;
                Intrinsics.checkNotNull(c7839yX1);
                c7839yX1.e.remove(abstractC6578sX2);
                arrayList.remove(c7839yX1);
                c7839yX1.d = abstractC6578sX2;
                arrayList2.add(c7839yX1);
                if (z || (!this.c && !arrayList.isEmpty())) {
                    aVar.a(this.g);
                }
                return abstractC6578sX2;
            }
            if (this.c) {
                if (jMin >= this.d - j) {
                    return abstractC6578sX1;
                }
                Intrinsics.checkNotNullParameter(this, "taskRunner");
                notify();
                return abstractC6578sX1;
            }
            this.c = true;
            this.d = j + jMin;
            try {
                try {
                    Intrinsics.checkNotNullParameter(this, "taskRunner");
                    long j2 = jMin / 1000000;
                    long j3 = jMin - (1000000 * j2);
                    if (j2 > 0 || jMin > 0) {
                        wait(j2, (int) j3);
                    }
                } catch (InterruptedException unused) {
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((C7839yX1) arrayList2.get(size)).b();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        C7839yX1 c7839yX2 = (C7839yX1) arrayList.get(size2);
                        c7839yX2.b();
                        if (c7839yX2.e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
                this.c = false;
            } catch (Throwable th) {
                this.c = false;
                throw th;
            }
        }
    }

    public final void d(@NotNull C7839yX1 taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        byte[] bArr = C6806tc2.a;
        if (taskQueue.d == null) {
            boolean zIsEmpty = taskQueue.e.isEmpty();
            ArrayList arrayList = this.f;
            if (zIsEmpty) {
                arrayList.remove(taskQueue);
            } else {
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        boolean z = this.c;
        a aVar = this.a;
        if (!z) {
            aVar.a(this.g);
        } else {
            Intrinsics.checkNotNullParameter(this, "taskRunner");
            notify();
        }
    }

    @NotNull
    public final C7839yX1 e() {
        int i2;
        synchronized (this) {
            i2 = this.b;
            this.b = i2 + 1;
        }
        return new C7839yX1(this, EK.e(i2, "Q"));
    }
}
