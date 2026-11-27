package defpackage;

import com.api.core.deeplinks.models.OneActionDeeplinkData;
import com.api.core.deeplinks.models.PromoCodeDeeplinkData;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class LU {

    @NotNull
    public final C6355rT0 a;

    @NotNull
    public final FU<PromoCodeDeeplinkData> b;

    @NotNull
    public final GP1 c;

    @Nullable
    public String d;

    @NotNull
    public final Gson e;

    @NotNull
    public final LinkedHashMap f;

    @NotNull
    public final Object g;

    public LU(@NotNull C6355rT0 logoutManager, @NotNull Set<FU<Unit>> oneActionDeeplinkExecutorsSet, @NotNull FU<PromoCodeDeeplinkData> promoCodeDeeplinkExecutor) {
        Intrinsics.checkNotNullParameter(logoutManager, "logoutManager");
        Intrinsics.checkNotNullParameter(oneActionDeeplinkExecutorsSet, "oneActionDeeplinkExecutorsSet");
        Intrinsics.checkNotNullParameter(promoCodeDeeplinkExecutor, "promoCodeDeeplinkExecutor");
        this.a = logoutManager;
        this.b = promoCodeDeeplinkExecutor;
        this.c = C1589Ne.i(Boolean.FALSE);
        this.e = new Gson();
        int iA = OW0.a(XE.m(oneActionDeeplinkExecutorsSet, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (Object obj : oneActionDeeplinkExecutorsSet) {
            linkedHashMap.put(((FU) obj).getKey().d, obj);
        }
        this.f = linkedHashMap;
        PU[] puArr = PU.d;
        this.g = PW0.e(new Pair("one_action", OneActionDeeplinkData.class), new Pair("promo_code", PromoCodeDeeplinkData.class));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0090, code lost:
    
        if (r8 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a4, code lost:
    
        if (r7.b.a(r8, r0) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:
    
        return r1;
     */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.LM r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.HU
            if (r0 == 0) goto L13
            r0 = r8
            HU r0 = (defpackage.HU) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            HU r0 = new HU
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L2f
            if (r2 != r3) goto L27
            goto L2f
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            LU r0 = r0.d
            defpackage.C1795Pt1.b(r8)
            goto La8
        L36:
            defpackage.C1795Pt1.b(r8)
            java.lang.String r8 = r7.d
            if (r8 != 0) goto L40
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L40:
            com.google.gson.Gson r2 = r7.e
            java.lang.Class<com.api.core.deeplinks.models.DeeplinkData> r5 = com.api.core.deeplinks.models.DeeplinkData.class
            java.lang.Object r5 = defpackage.C3476e.i(r2, r8, r5)
            com.api.core.deeplinks.models.DeeplinkData r5 = (com.api.core.deeplinks.models.DeeplinkData) r5
            if (r5 != 0) goto L4f
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L4f:
            r5.toString()
            java.lang.Object r6 = r7.g
            java.lang.String r5 = r5.getType()
            java.lang.Object r5 = r6.get(r5)
            java.lang.Class r5 = (java.lang.Class) r5
            if (r5 != 0) goto L63
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L63:
            java.lang.Object r8 = defpackage.C3476e.i(r2, r8, r5)
            if (r8 != 0) goto L6c
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L6c:
            boolean r2 = r8 instanceof com.api.core.deeplinks.models.OneActionDeeplinkData
            if (r2 == 0) goto L93
            r2 = r8
            com.api.core.deeplinks.models.OneActionDeeplinkData r2 = (com.api.core.deeplinks.models.OneActionDeeplinkData) r2
            java.util.LinkedHashMap r3 = r7.f
            java.lang.String r2 = r2.getAction()
            java.lang.Object r2 = r3.get(r2)
            FU r2 = (defpackage.FU) r2
            if (r2 == 0) goto La7
            r0.d = r7
            r0.e = r8
            r0.i = r4
            kotlin.Unit r8 = kotlin.Unit.a
            java.lang.Object r0 = r2.a(r8, r0)
            if (r0 != r1) goto L90
            r8 = r0
        L90:
            if (r8 != r1) goto La7
            goto La6
        L93:
            boolean r2 = r8 instanceof com.api.core.deeplinks.models.PromoCodeDeeplinkData
            if (r2 == 0) goto La7
            r8.toString()
            r0.d = r7
            r0.i = r3
            FU<com.api.core.deeplinks.models.PromoCodeDeeplinkData> r2 = r7.b
            java.lang.Object r8 = r2.a(r8, r0)
            if (r8 != r1) goto La7
        La6:
            return r1
        La7:
            r0 = r7
        La8:
            r8 = 0
            r0.d = r8
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LU.a(LM):java.lang.Object");
    }

    @Nullable
    public final Object b(@NotNull String str, @NotNull AW1 aw1) {
        this.d = str;
        if (!((Boolean) this.c.getValue()).booleanValue()) {
            return Unit.a;
        }
        Object objA = a(aw1);
        MN mn = MN.d;
        if (objA != mn) {
            objA = Unit.a;
        }
        return objA == mn ? objA : Unit.a;
    }

    @Nullable
    public final Object c(@NotNull AW1 aw1) throws Throwable {
        RV rv = C6266r20.a;
        Object objP = C5189lv.p(QV0.a, new KU(this, null), aw1);
        return objP == MN.d ? objP : Unit.a;
    }
}
