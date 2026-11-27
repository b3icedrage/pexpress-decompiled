package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qK1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6120qK1<T> extends AbstractC3272d1<C6539sK1> implements InterfaceC3487e21<T>, InterfaceC6460ry<T>, InterfaceC4475ik0<T> {
    public final int i;
    public final int j;

    @NotNull
    public final EnumC1796Pu k;

    @Nullable
    public Object[] l;
    public long m;
    public long n;
    public int o;
    public int p;

    /* JADX INFO: renamed from: qK1$a */
    public static final class a implements A20 {

        @NotNull
        public final C6120qK1<?> d;
        public final long e;

        @Nullable
        public final Object g;

        @NotNull
        public final C6251qy h;

        public a(@NotNull C6120qK1 c6120qK1, long j, @Nullable Object obj, @NotNull C6251qy c6251qy) {
            this.d = c6120qK1;
            this.e = j;
            this.g = obj;
            this.h = c6251qy;
        }

        @Override // defpackage.A20
        public final void b() {
            C6120qK1<?> c6120qK1 = this.d;
            synchronized (c6120qK1) {
                if (this.e < c6120qK1.s()) {
                    return;
                }
                Object[] objArr = c6120qK1.l;
                Intrinsics.checkNotNull(objArr);
                if (C1589Ne.j(objArr, this.e) != this) {
                    return;
                }
                C1589Ne.k(objArr, this.e, C1589Ne.g);
                c6120qK1.n();
                Unit unit = Unit.a;
            }
        }
    }

    public C6120qK1(int i, int i2, @NotNull EnumC1796Pu enumC1796Pu) {
        this.i = i;
        this.j = i2;
        this.k = enumC1796Pu;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static void o(C6120qK1 c6120qK1, InterfaceC6606sf0 interfaceC6606sf0, JM jm) throws Throwable {
        C6329rK1 c6329rK1;
        C6120qK1 c6120qK2;
        Throwable th;
        C6539sK1 c6539sK1;
        InterfaceC6606sf0 interfaceC6606sf1;
        XF0 xf0;
        InterfaceC6606sf0 interfaceC6606sf2;
        if (jm instanceof C6329rK1) {
            c6329rK1 = (C6329rK1) jm;
            int i = c6329rK1.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6329rK1.k = i - Integer.MIN_VALUE;
            } else {
                c6329rK1 = new C6329rK1(c6120qK1, jm);
            }
        } else {
            c6329rK1 = new C6329rK1(c6120qK1, jm);
        }
        Object obj = c6329rK1.i;
        MN mn = MN.d;
        int i2 = c6329rK1.k;
        if (i2 != 0) {
            if (i2 == 1) {
                c6539sK1 = c6329rK1.g;
                InterfaceC6606sf0 interfaceC6606sf3 = c6329rK1.e;
                C6120qK1 c6120qK3 = c6329rK1.d;
                try {
                    C1795Pt1.b(obj);
                    interfaceC6606sf1 = interfaceC6606sf3;
                    c6120qK1 = c6120qK3;
                    try {
                        xf0 = (XF0) c6329rK1.getContext().p(XF0.a.d);
                        interfaceC6606sf2 = interfaceC6606sf1;
                    } catch (Throwable th2) {
                        c6120qK2 = c6120qK1;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c6120qK2 = c6120qK3;
                }
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                XF0 xf1 = c6329rK1.h;
                c6539sK1 = c6329rK1.g;
                InterfaceC6606sf0 interfaceC6606sf4 = c6329rK1.e;
                c6120qK2 = c6329rK1.d;
                try {
                    C1795Pt1.b(obj);
                    interfaceC6606sf2 = interfaceC6606sf4;
                    xf0 = xf1;
                    c6120qK1 = c6120qK2;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            c6120qK2.l(c6539sK1);
            throw th;
        }
        C1795Pt1.b(obj);
        C6539sK1 c6539sK1G = c6120qK1.g();
        try {
            if (interfaceC6606sf0 instanceof C6150qU1) {
                c6329rK1.d = c6120qK1;
                c6329rK1.e = interfaceC6606sf0;
                c6329rK1.g = c6539sK1G;
                c6329rK1.k = 1;
                if (((C6150qU1) interfaceC6606sf0).b(c6329rK1) == mn) {
                    return;
                }
            }
            interfaceC6606sf1 = interfaceC6606sf0;
            c6539sK1 = c6539sK1G;
            xf0 = (XF0) c6329rK1.getContext().p(XF0.a.d);
            interfaceC6606sf2 = interfaceC6606sf1;
        } catch (Throwable th5) {
            c6120qK2 = c6120qK1;
            th = th5;
            c6539sK1 = c6539sK1G;
        }
        while (true) {
            Object objW = c6120qK1.w(c6539sK1);
            if (objW == C1589Ne.g) {
                c6329rK1.d = c6120qK1;
                c6329rK1.e = interfaceC6606sf2;
                c6329rK1.g = c6539sK1;
                c6329rK1.h = xf0;
                c6329rK1.k = 2;
                if (c6120qK1.m(c6539sK1, c6329rK1) == mn) {
                    return;
                }
            } else {
                if (xf0 != null && !xf0.g()) {
                    throw xf0.C();
                }
                c6329rK1.d = c6120qK1;
                c6329rK1.e = interfaceC6606sf2;
                c6329rK1.g = c6539sK1;
                c6329rK1.h = xf0;
                c6329rK1.k = 3;
                if (interfaceC6606sf2.a(objW, c6329rK1) == mn) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC3487e21, defpackage.InterfaceC6606sf0
    @Nullable
    public final Object a(T t, @NotNull JM<? super Unit> frame) throws Throwable {
        Throwable th;
        JM<Unit>[] jmArrR;
        a aVar;
        if (h(t)) {
            return Unit.a;
        }
        C6251qy c6251qy = new C6251qy(1, C5885pC0.b(frame));
        c6251qy.r();
        JM<Unit>[] jmArrR2 = C3481e1.a;
        synchronized (this) {
            try {
                if (u(t)) {
                    try {
                        C1717Ot1.a aVar2 = C1717Ot1.e;
                        c6251qy.resumeWith(Unit.a);
                        jmArrR = r(jmArrR2);
                        aVar = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        aVar = new a(this, s() + ((long) (this.o + this.p)), t, c6251qy);
                        q(aVar);
                        this.p++;
                        if (this.j == 0) {
                            jmArrR2 = r(jmArrR2);
                        }
                        jmArrR = jmArrR2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (aVar != null) {
                    c6251qy.v(new D20(aVar));
                }
                for (JM<Unit> jm : jmArrR) {
                    if (jm != null) {
                        C1717Ot1.a aVar3 = C1717Ot1.e;
                        jm.resumeWith(Unit.a);
                    }
                }
                Object objQ = c6251qy.q();
                MN mn = MN.d;
                if (objQ == mn) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (objQ != mn) {
                    objQ = Unit.a;
                }
                return objQ == mn ? objQ : Unit.a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // defpackage.InterfaceC5910pK1
    @NotNull
    public final List<T> b() {
        synchronized (this) {
            int iS = (int) ((s() + ((long) this.o)) - this.m);
            if (iS == 0) {
                return C5653o60.d;
            }
            ArrayList arrayList = new ArrayList(iS);
            Object[] objArr = this.l;
            Intrinsics.checkNotNull(objArr);
            for (int i = 0; i < iS; i++) {
                arrayList.add(C1589Ne.j(objArr, this.m + ((long) i)));
            }
            return arrayList;
        }
    }

    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super T> interfaceC6606sf0, @NotNull JM<?> jm) throws Throwable {
        o(this, interfaceC6606sf0, jm);
        return MN.d;
    }

    @Override // defpackage.InterfaceC3487e21
    public final void e() throws Throwable {
        synchronized (this) {
            try {
                try {
                    x(s() + ((long) this.o), this.n, s() + ((long) this.o), s() + ((long) this.o) + ((long) this.p));
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // defpackage.InterfaceC4475ik0
    @NotNull
    public final InterfaceC6396rf0<T> f(@NotNull CoroutineContext coroutineContext, int i, @NotNull EnumC1796Pu enumC1796Pu) {
        return C1589Ne.o(this, coroutineContext, i, enumC1796Pu);
    }

    @Override // defpackage.InterfaceC3487e21
    public final boolean h(T t) {
        int i;
        boolean z;
        JM<Unit>[] jmArrR = C3481e1.a;
        synchronized (this) {
            if (u(t)) {
                jmArrR = r(jmArrR);
                z = true;
            } else {
                z = false;
            }
        }
        for (JM<Unit> jm : jmArrR) {
            if (jm != null) {
                C1717Ot1.a aVar = C1717Ot1.e;
                jm.resumeWith(Unit.a);
            }
        }
        return z;
    }

    @Override // defpackage.AbstractC3272d1
    public final AbstractC3691f1 j() {
        return new C6539sK1();
    }

    @Override // defpackage.AbstractC3272d1
    public final AbstractC3691f1[] k() {
        return new C6539sK1[2];
    }

    public final Object m(C6539sK1 c6539sK1, C6329rK1 frame) {
        C6251qy c6251qy = new C6251qy(1, C5885pC0.b(frame));
        c6251qy.r();
        synchronized (this) {
            if (v(c6539sK1) < 0) {
                c6539sK1.b = c6251qy;
            } else {
                C1717Ot1.a aVar = C1717Ot1.e;
                c6251qy.resumeWith(Unit.a);
            }
            Unit unit = Unit.a;
        }
        Object objQ = c6251qy.q();
        MN mn = MN.d;
        if (objQ == mn) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objQ == mn ? objQ : Unit.a;
    }

    public final void n() {
        if (this.j != 0 || this.p > 1) {
            Object[] objArr = this.l;
            Intrinsics.checkNotNull(objArr);
            while (this.p > 0 && C1589Ne.j(objArr, (s() + ((long) (this.o + this.p))) - 1) == C1589Ne.g) {
                this.p--;
                C1589Ne.k(objArr, s() + ((long) (this.o + this.p)), null);
            }
        }
    }

    public final void p() {
        Object[] objArr;
        Object[] objArr2 = this.l;
        Intrinsics.checkNotNull(objArr2);
        C1589Ne.k(objArr2, s(), null);
        this.o--;
        long jS = s() + 1;
        if (this.m < jS) {
            this.m = jS;
        }
        if (this.n < jS) {
            if (this.e != 0 && (objArr = this.d) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        C6539sK1 c6539sK1 = (C6539sK1) obj;
                        long j = c6539sK1.a;
                        if (j >= 0 && j < jS) {
                            c6539sK1.a = jS;
                        }
                    }
                }
            }
            this.n = jS;
        }
    }

    public final void q(Object obj) {
        int i = this.o + this.p;
        Object[] objArrT = this.l;
        if (objArrT == null) {
            objArrT = t(null, 0, 2);
        } else if (i >= objArrT.length) {
            objArrT = t(objArrT, i, objArrT.length * 2);
        }
        C1589Ne.k(objArrT, s() + ((long) i), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [JM<kotlin.Unit>[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final JM<Unit>[] r(JM<Unit>[] jmArr) {
        Object[] objArr;
        C6539sK1 c6539sK1;
        C6251qy c6251qy;
        int length = jmArr.length;
        if (this.e != 0 && (objArr = this.d) != null) {
            int length2 = objArr.length;
            int i = 0;
            jmArr = jmArr;
            while (i < length2) {
                Object obj = objArr[i];
                if (obj != null && (c6251qy = (c6539sK1 = (C6539sK1) obj).b) != null && v(c6539sK1) >= 0) {
                    int length3 = jmArr.length;
                    jmArr = jmArr;
                    if (length >= length3) {
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) jmArr, Math.max(2, jmArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                        jmArr = objArrCopyOf;
                    }
                    ((JM[]) jmArr)[length] = c6251qy;
                    c6539sK1.b = null;
                    length++;
                }
                i++;
                jmArr = jmArr;
            }
        }
        return (JM[]) jmArr;
    }

    public final long s() {
        return Math.min(this.n, this.m);
    }

    public final Object[] t(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.l = objArr2;
        if (objArr != null) {
            long jS = s();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + jS;
                C1589Ne.k(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    public final boolean u(T t) {
        int i;
        long jS;
        long j;
        int i2 = this.e;
        int i3 = this.i;
        if (i2 != 0) {
            int i4 = this.o;
            int i5 = this.j;
            if (i4 < i5 || this.n > this.m) {
                q(t);
                i = this.o + 1;
                this.o = i;
                if (i > i5) {
                    p();
                }
                jS = s() + ((long) this.o);
                j = this.m;
                if (((int) (jS - j)) > i3) {
                    x(1 + j, this.n, s() + ((long) this.o), s() + ((long) this.o) + ((long) this.p));
                }
            } else {
                int iOrdinal = this.k.ordinal();
                if (iOrdinal == 0) {
                    return false;
                }
                if (iOrdinal != 2) {
                    q(t);
                    i = this.o + 1;
                    this.o = i;
                    if (i > i5) {
                        p();
                    }
                    jS = s() + ((long) this.o);
                    j = this.m;
                    if (((int) (jS - j)) > i3) {
                        x(1 + j, this.n, s() + ((long) this.o), s() + ((long) this.o) + ((long) this.p));
                    }
                }
            }
        } else if (i3 != 0) {
            q(t);
            int i6 = this.o + 1;
            this.o = i6;
            if (i6 > i3) {
                p();
            }
            this.n = s() + ((long) this.o);
            return true;
        }
        return true;
    }

    public final long v(C6539sK1 c6539sK1) {
        long j = c6539sK1.a;
        if (j < s() + ((long) this.o)) {
            return j;
        }
        if (this.j <= 0 && j <= s() && this.p != 0) {
            return j;
        }
        return -1L;
    }

    public final Object w(C6539sK1 c6539sK1) {
        Object obj;
        JM<Unit>[] jmArrY = C3481e1.a;
        synchronized (this) {
            try {
                long jV = v(c6539sK1);
                if (jV < 0) {
                    obj = C1589Ne.g;
                } else {
                    long j = c6539sK1.a;
                    Object[] objArr = this.l;
                    Intrinsics.checkNotNull(objArr);
                    Object objJ = C1589Ne.j(objArr, jV);
                    if (objJ instanceof a) {
                        objJ = ((a) objJ).g;
                    }
                    c6539sK1.a = jV + 1;
                    Object obj2 = objJ;
                    jmArrY = y(j);
                    obj = obj2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (JM<Unit> jm : jmArrY) {
            if (jm != null) {
                C1717Ot1.a aVar = C1717Ot1.e;
                jm.resumeWith(Unit.a);
            }
        }
        return obj;
    }

    public final void x(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jS = s(); jS < jMin; jS++) {
            Object[] objArr = this.l;
            Intrinsics.checkNotNull(objArr);
            C1589Ne.k(objArr, jS, null);
        }
        this.m = j;
        this.n = j2;
        this.o = (int) (j3 - jMin);
        this.p = (int) (j4 - j3);
    }

    @NotNull
    public final JM<Unit>[] y(long j) {
        long j2;
        long j3;
        long j4;
        JM<Unit>[] jmArr;
        Object[] objArr;
        long j5 = this.n;
        JM<Unit>[] jmArr2 = C3481e1.a;
        if (j <= j5) {
            long jS = s();
            long j6 = ((long) this.o) + jS;
            int i = this.j;
            if (i == 0 && this.p > 0) {
                j6++;
            }
            int i2 = 0;
            if (this.e != 0 && (objArr = this.d) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        long j7 = ((C6539sK1) obj).a;
                        if (j7 >= 0 && j7 < j6) {
                            j6 = j7;
                        }
                    }
                }
            }
            if (j6 > this.n) {
                long jS2 = s() + ((long) this.o);
                int iMin = this.e > 0 ? Math.min(this.p, i - ((int) (jS2 - j6))) : this.p;
                long j8 = ((long) this.p) + jS2;
                GW1 gw1 = C1589Ne.g;
                if (iMin > 0) {
                    JM<Unit>[] jmArr3 = new JM[iMin];
                    j4 = 1;
                    Object[] objArr2 = this.l;
                    Intrinsics.checkNotNull(objArr2);
                    long j9 = jS2;
                    while (true) {
                        if (jS2 >= j8) {
                            j2 = jS;
                            j3 = j6;
                            break;
                        }
                        j2 = jS;
                        Object objJ = C1589Ne.j(objArr2, jS2);
                        if (objJ != gw1) {
                            Intrinsics.c(objJ, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            a aVar = (a) objJ;
                            int i3 = i2 + 1;
                            j3 = j6;
                            jmArr3[i2] = aVar.h;
                            C1589Ne.k(objArr2, jS2, gw1);
                            C1589Ne.k(objArr2, j9, aVar.g);
                            j9++;
                            if (i3 >= iMin) {
                                break;
                            }
                            i2 = i3;
                        } else {
                            j3 = j6;
                        }
                        jS2++;
                        jS = j2;
                        j6 = j3;
                    }
                    jS2 = j9;
                    jmArr = jmArr3;
                } else {
                    j2 = jS;
                    j3 = j6;
                    j4 = 1;
                    jmArr = jmArr2;
                }
                int i4 = (int) (jS2 - j2);
                long j10 = this.e == 0 ? jS2 : j3;
                long jMax = Math.max(this.m, jS2 - ((long) Math.min(this.i, i4)));
                if (i == 0 && jMax < j8) {
                    Object[] objArr3 = this.l;
                    Intrinsics.checkNotNull(objArr3);
                    if (Intrinsics.a(C1589Ne.j(objArr3, jMax), gw1)) {
                        jS2 += j4;
                        jMax += j4;
                    }
                }
                x(jMax, j10, jS2, j8);
                n();
                return jmArr.length == 0 ? jmArr : r(jmArr);
            }
        }
        return jmArr2;
    }
}
