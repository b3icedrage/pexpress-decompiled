package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Sq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2020Sq1 implements InterfaceC1549Mq1 {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final InterfaceC3985gQ b;

    @Nullable
    public C2098Tq1 c;

    public C2020Sq1(@NotNull C4923kf appDataRepository, @NotNull InterfaceC3985gQ cryptoEnablementProvider) {
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(cryptoEnablementProvider, "cryptoEnablementProvider");
        this.a = appDataRepository;
        this.b = cryptoEnablementProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC1549Mq1
    @Nullable
    public final Serializable a(@NotNull LM lm) throws Throwable {
        C1630Nq1 c1630Nq1;
        C2020Sq1 c2020Sq1;
        if (lm instanceof C1630Nq1) {
            c1630Nq1 = (C1630Nq1) lm;
            int i = c1630Nq1.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1630Nq1.h = i - Integer.MIN_VALUE;
            } else {
                c1630Nq1 = new C1630Nq1(this, lm);
            }
        } else {
            c1630Nq1 = new C1630Nq1(this, lm);
        }
        Object objC = c1630Nq1.e;
        MN mn = MN.d;
        int i2 = c1630Nq1.h;
        if (i2 == 0) {
            C1795Pt1.b(objC);
            c1630Nq1.d = this;
            c1630Nq1.h = 1;
            objC = c(c1630Nq1);
            if (objC == mn) {
                return mn;
            }
            c2020Sq1 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2020Sq1 = c1630Nq1.d;
            C1795Pt1.b(objC);
        }
        List<LF> list = (List) objC;
        ArrayList arrayList = new ArrayList(XE.m(list, 10));
        for (LF lf : list) {
            String str = lf.c;
            if (c2020Sq1.c == null) {
                C5189lv.o(new C1942Rq1(c2020Sq1, null));
            }
            C2098Tq1 c2098Tq1 = c2020Sq1.c;
            Intrinsics.checkNotNull(c2098Tq1);
            boolean zA = Intrinsics.a(str, c2098Tq1.a);
            String str2 = lf.b;
            String str3 = "USDT";
            boolean zI = d.i(str2, "USDT");
            String str4 = lf.c;
            if (!zI) {
                str3 = str4;
            }
            arrayList.add(new C2098Tq1(str4, str2, str3, zA));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC1549Mq1
    @Nullable
    public final Object b(@NotNull C2098Tq1 c2098Tq1, @NotNull LM lm) {
        C1864Qq1 c1864Qq1;
        C2020Sq1 c2020Sq1;
        if (lm instanceof C1864Qq1) {
            c1864Qq1 = (C1864Qq1) lm;
            int i = c1864Qq1.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1864Qq1.i = i - Integer.MIN_VALUE;
            } else {
                c1864Qq1 = new C1864Qq1(this, lm);
            }
        } else {
            c1864Qq1 = new C1864Qq1(this, lm);
        }
        Object objC = c1864Qq1.g;
        MN mn = MN.d;
        int i2 = c1864Qq1.i;
        if (i2 == 0) {
            C1795Pt1.b(objC);
            c1864Qq1.d = this;
            c1864Qq1.e = c2098Tq1;
            c1864Qq1.i = 1;
            objC = c(c1864Qq1);
            if (objC == mn) {
                return mn;
            }
            c2020Sq1 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2098Tq1 = c1864Qq1.e;
            c2020Sq1 = c1864Qq1.d;
            C1795Pt1.b(objC);
        }
        Iterable iterable = (Iterable) objC;
        ArrayList arrayList = new ArrayList(XE.m(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((LF) it.next()).c);
        }
        if (!arrayList.contains(c2098Tq1.a)) {
            return Unit.a;
        }
        c2020Sq1.c = c2098Tq1;
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(LM lm) {
        C1786Pq1 c1786Pq1;
        C2020Sq1 c2020Sq1;
        ArrayList arrayList;
        C2020Sq1 c2020Sq2;
        ArrayList arrayList2;
        if (lm instanceof C1786Pq1) {
            c1786Pq1 = (C1786Pq1) lm;
            int i = c1786Pq1.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1786Pq1.j = i - Integer.MIN_VALUE;
            } else {
                c1786Pq1 = new C1786Pq1(this, lm);
            }
        } else {
            c1786Pq1 = new C1786Pq1(this, lm);
        }
        Object objA = c1786Pq1.h;
        MN mn = MN.d;
        int i2 = c1786Pq1.j;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            GP1 gp1 = this.a.i;
            c1786Pq1.d = this;
            c1786Pq1.j = 1;
            objA = C7236vf0.a(gp1, c1786Pq1);
            if (objA != mn) {
                c2020Sq1 = this;
            }
            return mn;
        }
        if (i2 == 1) {
            c2020Sq1 = c1786Pq1.d;
            C1795Pt1.b(objA);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = c1786Pq1.g;
            arrayList2 = c1786Pq1.e;
            c2020Sq2 = c1786Pq1.d;
            C1795Pt1.b(objA);
        }
        if (!c2020Sq2.b.c((FF) objA)) {
            C2904bF.r(arrayList, new C6224qp(2));
        }
        return arrayList2;
        ArrayList arrayList3 = ((KF) objA).a;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            ((LF) it.next()).getClass();
        }
        ArrayList arrayListF0 = CollectionsKt.f0(CollectionsKt.Z(arrayList4, new C1708Oq1()));
        GP1 gp2 = c2020Sq1.a.b;
        c1786Pq1.d = c2020Sq1;
        c1786Pq1.e = arrayListF0;
        c1786Pq1.g = arrayListF0;
        c1786Pq1.j = 2;
        Object objA2 = C7236vf0.a(gp2, c1786Pq1);
        if (objA2 != mn) {
            arrayList = arrayListF0;
            objA = objA2;
            c2020Sq2 = c2020Sq1;
            arrayList2 = arrayList;
            if (!c2020Sq2.b.c((FF) objA)) {
                C2904bF.r(arrayList, new C6224qp(2));
            }
            return arrayList2;
        }
        return mn;
    }
}
