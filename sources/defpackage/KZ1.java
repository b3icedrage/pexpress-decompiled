package defpackage;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class KZ1 extends JZ1 {

    @Nullable
    public final Long c;

    @NotNull
    public final C2030Su d;

    @NotNull
    public final AtomicLong e;
    public boolean f;
    public long g;
    public long h;

    public KZ1() {
        this(null);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0157 A[PHI: r3 r5 r13 r14
      0x0157: PHI (r3v10 int) = (r3v0 int), (r3v2 int), (r3v4 int), (r3v5 int), (r3v7 int), (r3v11 int) binds: [B:31:0x00dc, B:28:0x00ce, B:17:0x006f, B:38:0x00fc, B:44:0x011f, B:52:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x0157: PHI (r5v5 java.lang.Iterable) = 
      (r5v0 java.lang.Iterable)
      (r5v0 java.lang.Iterable)
      (r5v0 java.lang.Iterable)
      (r5v2 java.lang.Iterable)
      (r5v0 java.lang.Iterable)
      (r5v6 java.lang.Iterable)
     binds: [B:31:0x00dc, B:28:0x00ce, B:17:0x006f, B:38:0x00fc, B:44:0x011f, B:52:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x0157: PHI (r13v16 KZ1) = (r13v0 KZ1), (r13v3 KZ1), (r13v7 KZ1), (r13v8 KZ1), (r13v11 KZ1), (r13v19 KZ1) binds: [B:31:0x00dc, B:28:0x00ce, B:17:0x006f, B:38:0x00fc, B:44:0x011f, B:52:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x0157: PHI (r14v14 Aq) = (r14v1 Aq), (r14v4 Aq), (r14v6 Aq), (r14v7 Aq), (r14v9 Aq), (r14v17 Aq) binds: [B:31:0x00dc, B:28:0x00ce, B:17:0x006f, B:38:0x00fc, B:44:0x011f, B:52:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0159  */
    /* JADX WARN: Code duplicated, block: B:63:0x0170  */
    /* JADX WARN: Code duplicated, block: B:66:0x017a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0195  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code duplicated, block: B:81:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e6 A[LOOP:0: B:82:0x01e0->B:84:0x01e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:91:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011b, code lost:
    
        if (r13.f(r6, r0) == r1) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.KZ1 r13, defpackage.Q80 r14, defpackage.LM r15) {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.KZ1.e(KZ1, Q80, LM):java.lang.Object");
    }

    @Override // defpackage.JZ1
    public final void d(@NotNull C0612Aq incomingEvent) {
        Intrinsics.checkNotNullParameter(incomingEvent, "incomingEvent");
        if (incomingEvent.c == null) {
            incomingEvent.c = Long.valueOf(System.currentTimeMillis());
        }
        this.d.n(new Q80(incomingEvent));
    }

    public final Object f(long j, LM lm) {
        if (this.e.get() < 0) {
            return Unit.a;
        }
        this.h = j;
        Unit unitH = c().g().h(LQ1.a.LAST_EVENT_TIME, String.valueOf(this.h));
        return unitH == MN.d ? unitH : Unit.a;
    }

    public final Object g(long j, LM lm) {
        AtomicLong atomicLong = this.e;
        atomicLong.set(j);
        Unit unitH = c().g().h(LQ1.a.PREVIOUS_SESSION_ID, String.valueOf(atomicLong.get()));
        return unitH == MN.d ? unitH : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object h(long j, LM lm) {
        HZ1 hz1;
        boolean zContains;
        KZ1 kz1;
        List list;
        boolean z;
        long j2;
        List list2;
        KZ1 kz2;
        long j3 = j;
        if (lm instanceof HZ1) {
            hz1 = (HZ1) lm;
            int i = hz1.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                hz1.k = i - Integer.MIN_VALUE;
            } else {
                hz1 = new HZ1(this, lm);
            }
        } else {
            hz1 = new HZ1(this, lm);
        }
        Object obj = hz1.i;
        MN mn = MN.d;
        int i2 = hz1.k;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            ArrayList arrayList = new ArrayList();
            MI mi = c().a;
            Intrinsics.c(mi, "null cannot be cast to non-null type com.amplitude.android.Configuration");
            zContains = mi.t.contains(EnumC2012So.d);
            if (zContains) {
                AtomicLong atomicLong = this.e;
                if (atomicLong.get() >= 0) {
                    C0612Aq c0612Aq = new C0612Aq();
                    Intrinsics.checkNotNullParameter("session_end", "<set-?>");
                    c0612Aq.N = "session_end";
                    long j4 = this.h;
                    c0612Aq.c = j4 > 0 ? new Long(j4) : null;
                    c0612Aq.e = new Long(atomicLong.get());
                    arrayList.add(c0612Aq);
                }
            }
            hz1.d = this;
            hz1.e = arrayList;
            hz1.g = j3;
            hz1.h = zContains;
            hz1.k = 1;
            if (g(j3, hz1) != mn) {
                kz1 = this;
                list = arrayList;
            }
            return mn;
        }
        if (i2 == 1) {
            boolean z2 = hz1.h;
            long j5 = hz1.g;
            List list3 = hz1.e;
            KZ1 kz3 = hz1.d;
            C1795Pt1.b(obj);
            list = list3;
            zContains = z2;
            j3 = j5;
            kz1 = kz3;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = hz1.h;
            j2 = hz1.g;
            List list4 = hz1.e;
            kz2 = hz1.d;
            C1795Pt1.b(obj);
            list2 = list4;
        }
        if (z) {
            C0612Aq c0612Aq2 = new C0612Aq();
            Intrinsics.checkNotNullParameter("session_start", "<set-?>");
            c0612Aq2.N = "session_start";
            c0612Aq2.c = new Long(j2);
            c0612Aq2.e = new Long(kz2.e.get());
            list2.add(c0612Aq2);
        }
        return list2;
        hz1.d = kz1;
        hz1.e = list;
        hz1.g = j3;
        hz1.h = zContains;
        hz1.k = 2;
        if (kz1.f(j3, hz1) != mn) {
            long j6 = j3;
            z = zContains;
            j2 = j6;
            list2 = list;
            kz2 = kz1;
            if (z) {
                C0612Aq c0612Aq3 = new C0612Aq();
                Intrinsics.checkNotNullParameter("session_start", "<set-?>");
                c0612Aq3.N = "session_start";
                c0612Aq3.c = new Long(j2);
                c0612Aq3.e = new Long(kz2.e.get());
                list2.add(c0612Aq3);
            }
            return list2;
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(long j, LM lm) {
        IZ1 iz1;
        Object objH;
        if (lm instanceof IZ1) {
            iz1 = (IZ1) lm;
            int i = iz1.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                iz1.g = i - Integer.MIN_VALUE;
            } else {
                iz1 = new IZ1(this, lm);
            }
        } else {
            iz1 = new IZ1(this, lm);
        }
        Object obj = iz1.d;
        Object obj2 = MN.d;
        int i2 = iz1.g;
        if (i2 != 0) {
            if (i2 == 1) {
                C1795Pt1.b(obj);
                return null;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        C1795Pt1.b(obj);
        if (this.e.get() >= 0) {
            MI mi = c().a;
            Intrinsics.c(mi, "null cannot be cast to non-null type com.amplitude.android.Configuration");
            if (j - this.h < mi.l) {
                iz1.g = 1;
                if (f(j, iz1) != obj2) {
                    return null;
                }
            } else {
                iz1.g = 2;
                objH = h(j, iz1);
                if (objH == obj2) {
                    return objH;
                }
            }
        } else {
            iz1.g = 2;
            objH = h(j, iz1);
            if (objH == obj2) {
                return objH;
            }
        }
        return obj2;
    }

    public KZ1(@Nullable Long l) {
        this.c = l;
        this.d = C2889bA.a(Api.BaseClientBuilder.API_PRIORITY_OTHER, 6, null);
        this.e = new AtomicLong(l != null ? l.longValue() : -1L);
        this.h = -1L;
    }
}
