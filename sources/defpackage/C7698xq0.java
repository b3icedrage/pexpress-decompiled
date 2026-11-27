package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7698xq0 {
    public final long a;
    public final long b;
    public final long c;

    @NotNull
    public final ConcurrentHashMap<String, Object> d = new ConcurrentHashMap<>();

    @NotNull
    public final ConcurrentHashMap<String, Long> e = new ConcurrentHashMap<>();

    public C7698xq0(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(@NotNull Function1 function1, @NotNull LM lm) throws Throwable {
        C7277vq0 c7277vq0;
        C7698xq0 c7698xq0;
        if (lm instanceof C7277vq0) {
            c7277vq0 = (C7277vq0) lm;
            int i = c7277vq0.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7277vq0.h = i - Integer.MIN_VALUE;
            } else {
                c7277vq0 = new C7277vq0(this, lm);
            }
        } else {
            c7277vq0 = new C7277vq0(this, lm);
        }
        Object obj = c7277vq0.e;
        MN mn = MN.d;
        int i2 = c7277vq0.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            try {
                long j = this.c;
                C7488wq0 c7488wq0 = new C7488wq0(function1, null);
                c7277vq0.d = this;
                c7277vq0.h = 1;
                try {
                    Object objB = OZ1.b(IW.e(j), c7488wq0, c7277vq0);
                    return objB == mn ? mn : objB;
                } catch (MZ1 e) {
                    e = e;
                    c7698xq0 = this;
                    long j2 = c7698xq0.c;
                    b.a aVar = b.e;
                    c7698xq0.b("call_" + b.r(j2, R40.SECONDS) + "s", "timed_out");
                    throw e;
                }
            } catch (MZ1 e2) {
                e = e2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7698xq0 = c7277vq0.d;
            try {
                C1795Pt1.b(obj);
                return obj;
            } catch (MZ1 e3) {
                e = e3;
            }
        }
        long j3 = c7698xq0.c;
        b.a aVar2 = b.e;
        c7698xq0.b("call_" + b.r(j3, R40.SECONDS) + "s", "timed_out");
        throw e;
    }

    public final void b(@Nullable Object obj, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap<String, Object> concurrentHashMap = this.d;
        if (obj == null) {
            concurrentHashMap.remove(key);
        } else {
            concurrentHashMap.put(key, obj);
        }
    }

    public final void c(@NotNull Map<String, ? extends Object> entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        for (Map.Entry<String, ? extends Object> entry : entries.entrySet()) {
            b(entry.getValue(), entry.getKey());
        }
    }

    @Nullable
    public final Long d(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Long l = this.e.get(name);
        if (l == null) {
            return null;
        }
        return Long.valueOf((System.nanoTime() - l.longValue()) / 1000000);
    }
}
