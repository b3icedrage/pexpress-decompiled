package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: pm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6006pm1 {
    public final long a;
    public final long b;
    public final TimeUnit c;

    /* JADX INFO: renamed from: pm1$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C6006pm1(long j, long j2, TimeUnit timeUnit) {
        this.a = j;
        this.b = j2;
        this.c = timeUnit;
    }
}
