package defpackage;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class UC1 implements QC1 {

    @NotNull
    public final AbstractC5267mG0.a a;

    @NotNull
    public final DR0 b;

    public UC1(@NotNull C7416wW1 store) {
        Intrinsics.checkNotNullParameter(store, "store");
        this.a = AbstractC5267mG0.d;
        this.b = new DR0(store);
    }

    @Override // defpackage.QC1
    @Nullable
    public final Object a(@NotNull LM lm) {
        EnumC2758ad2 enumC2758ad2 = EnumC2758ad2.Events;
        DR0 dr0 = this.b;
        dr0.getClass();
        Object objA = dr0.a.a.a(new C1130Hg1(new C6575sW1("events_", null), null), lm);
        MN mn = MN.d;
        if (objA != mn) {
            objA = Unit.a;
        }
        if (objA != mn) {
            objA = Unit.a;
        }
        return objA == mn ? objA : Unit.a;
    }

    @Override // defpackage.QC1
    @Nullable
    public final Object b(@NotNull LM lm) {
        EnumC2758ad2 enumC2758ad2 = EnumC2758ad2.Events;
        DR0 dr0 = this.b;
        dr0.getClass();
        Object objA = dr0.a.a.a(new C1130Hg1(new C6575sW1("Identify_", null), null), lm);
        MN mn = MN.d;
        if (objA != mn) {
            objA = Unit.a;
        }
        if (objA != mn) {
            objA = Unit.a;
        }
        return objA == mn ? objA : Unit.a;
    }

    @Override // defpackage.QC1
    @Nullable
    public final Object c(@NotNull C4672jT c4672jT, @NotNull C7344w90 c7344w90) {
        String str = c4672jT.a;
        AbstractC5267mG0.a aVar = this.a;
        aVar.getClass();
        Object objA = this.b.a(str, aVar.b(C4672jT.Companion.serializer(), c4672jT), EnumC2758ad2.Identify, c7344w90);
        return objA == MN.d ? objA : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
    
        if (r2.a(r0) == r1) goto L32;
     */
    @Override // defpackage.QC1
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(@org.jetbrains.annotations.NotNull defpackage.LM r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.SC1
            if (r0 == 0) goto L13
            r0 = r9
            SC1 r0 = (defpackage.SC1) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            SC1 r0 = new SC1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r9)
            goto L92
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L32:
            UC1 r2 = r0.d
            defpackage.C1795Pt1.b(r9)     // Catch: java.lang.Exception -> L86
            goto L52
        L38:
            defpackage.C1795Pt1.b(r9)
            DR0 r9 = r8.b     // Catch: java.lang.Exception -> L85
            ad2 r2 = defpackage.EnumC2758ad2.Events     // Catch: java.lang.Exception -> L85
            r0.d = r8     // Catch: java.lang.Exception -> L85
            r0.h = r4     // Catch: java.lang.Exception -> L85
            r9.getClass()     // Catch: java.lang.Exception -> L85
            java.lang.String r2 = "events_"
            wW1 r9 = r9.a     // Catch: java.lang.Exception -> L85
            java.lang.Object r9 = r9.b(r2, r0)     // Catch: java.lang.Exception -> L85
            if (r9 != r1) goto L51
            goto L91
        L51:
            r2 = r8
        L52:
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Exception -> L86
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> L86
            r5 = 10
            int r5 = defpackage.XE.m(r9, r5)     // Catch: java.lang.Exception -> L86
            r4.<init>(r5)     // Catch: java.lang.Exception -> L86
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Exception -> L86
        L63:
            boolean r5 = r9.hasNext()     // Catch: java.lang.Exception -> L86
            if (r5 == 0) goto L84
            java.lang.Object r5 = r9.next()     // Catch: java.lang.Exception -> L86
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L86
            mG0$a r6 = r2.a     // Catch: java.lang.Exception -> L86
            r6.getClass()     // Catch: java.lang.Exception -> L86
            jT$b r7 = defpackage.C4672jT.Companion     // Catch: java.lang.Exception -> L86
            RJ0 r7 = r7.serializer()     // Catch: java.lang.Exception -> L86
            java.lang.Object r5 = r6.c(r7, r5)     // Catch: java.lang.Exception -> L86
            jT r5 = (defpackage.C4672jT) r5     // Catch: java.lang.Exception -> L86
            r4.add(r5)     // Catch: java.lang.Exception -> L86
            goto L63
        L84:
            return r4
        L85:
            r2 = r8
        L86:
            r9 = 0
            r0.d = r9
            r0.h = r3
            java.lang.Object r9 = r2.a(r0)
            if (r9 != r1) goto L92
        L91:
            return r1
        L92:
            o60 r9 = defpackage.C5653o60.d
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.UC1.d(LM):java.io.Serializable");
    }

    @Override // defpackage.QC1
    @Nullable
    public final Object e(@NotNull C4672jT c4672jT, @NotNull C6085q90 c6085q90) {
        String str = c4672jT.a;
        AbstractC5267mG0.a aVar = this.a;
        aVar.getClass();
        Object objA = this.b.a(str, aVar.b(C4672jT.Companion.serializer(), c4672jT), EnumC2758ad2.Events, c6085q90);
        return objA == MN.d ? objA : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
    
        if (r2.b(r0) == r1) goto L32;
     */
    @Override // defpackage.QC1
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable f(@org.jetbrains.annotations.NotNull defpackage.LM r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.TC1
            if (r0 == 0) goto L13
            r0 = r9
            TC1 r0 = (defpackage.TC1) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            TC1 r0 = new TC1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r9)
            goto L92
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L32:
            UC1 r2 = r0.d
            defpackage.C1795Pt1.b(r9)     // Catch: java.lang.Exception -> L86
            goto L52
        L38:
            defpackage.C1795Pt1.b(r9)
            DR0 r9 = r8.b     // Catch: java.lang.Exception -> L85
            ad2 r2 = defpackage.EnumC2758ad2.Events     // Catch: java.lang.Exception -> L85
            r0.d = r8     // Catch: java.lang.Exception -> L85
            r0.h = r4     // Catch: java.lang.Exception -> L85
            r9.getClass()     // Catch: java.lang.Exception -> L85
            java.lang.String r2 = "Identify_"
            wW1 r9 = r9.a     // Catch: java.lang.Exception -> L85
            java.lang.Object r9 = r9.b(r2, r0)     // Catch: java.lang.Exception -> L85
            if (r9 != r1) goto L51
            goto L91
        L51:
            r2 = r8
        L52:
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Exception -> L86
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> L86
            r5 = 10
            int r5 = defpackage.XE.m(r9, r5)     // Catch: java.lang.Exception -> L86
            r4.<init>(r5)     // Catch: java.lang.Exception -> L86
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Exception -> L86
        L63:
            boolean r5 = r9.hasNext()     // Catch: java.lang.Exception -> L86
            if (r5 == 0) goto L84
            java.lang.Object r5 = r9.next()     // Catch: java.lang.Exception -> L86
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L86
            mG0$a r6 = r2.a     // Catch: java.lang.Exception -> L86
            r6.getClass()     // Catch: java.lang.Exception -> L86
            jT$b r7 = defpackage.C4672jT.Companion     // Catch: java.lang.Exception -> L86
            RJ0 r7 = r7.serializer()     // Catch: java.lang.Exception -> L86
            java.lang.Object r5 = r6.c(r7, r5)     // Catch: java.lang.Exception -> L86
            jT r5 = (defpackage.C4672jT) r5     // Catch: java.lang.Exception -> L86
            r4.add(r5)     // Catch: java.lang.Exception -> L86
            goto L63
        L84:
            return r4
        L85:
            r2 = r8
        L86:
            r9 = 0
            r0.d = r9
            r0.h = r3
            java.lang.Object r9 = r2.b(r0)
            if (r9 != r1) goto L92
        L91:
            return r1
        L92:
            o60 r9 = defpackage.C5653o60.d
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.UC1.f(LM):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Serializable g(@NotNull LM lm) {
        RC1 rc1;
        UC1 uc1;
        if (lm instanceof RC1) {
            rc1 = (RC1) lm;
            int i = rc1.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                rc1.h = i - Integer.MIN_VALUE;
            } else {
                rc1 = new RC1(this, lm);
            }
        } else {
            rc1 = new RC1(this, lm);
        }
        Object objA = rc1.e;
        MN mn = MN.d;
        int i2 = rc1.h;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            EnumC2758ad2 enumC2758ad2 = EnumC2758ad2.Events;
            rc1.d = this;
            rc1.h = 1;
            DR0 dr0 = this.b;
            dr0.getClass();
            objA = dr0.a.a("properties_", rc1);
            if (objA == mn) {
                return mn;
            }
            uc1 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uc1 = rc1.d;
            C1795Pt1.b(objA);
        }
        Map map = (Map) objA;
        LinkedHashMap linkedHashMap = new LinkedHashMap(OW0.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            AbstractC5267mG0.a aVar = uc1.a;
            String str = (String) entry.getValue();
            aVar.getClass();
            linkedHashMap.put(key, (JsonElement) aVar.c(JsonElement.Companion.serializer(), str));
        }
        return linkedHashMap;
    }
}
