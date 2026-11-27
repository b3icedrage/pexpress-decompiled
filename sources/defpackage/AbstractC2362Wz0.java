package defpackage;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Wz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2362Wz0 implements InterfaceC2124Tz0 {

    @NotNull
    public final JA a;

    @NotNull
    public final InterfaceC4255hh1 b;

    @NotNull
    public final S7 c;

    @Nullable
    public OQ d;

    @NotNull
    public final ArrayList e;
    public boolean f;

    public AbstractC2362Wz0(@NotNull JA chartStartTimeProvider, @NotNull InterfaceC4255hh1 priceLinesUseCase, @NotNull S7 addBetOnChartUseCase) {
        Intrinsics.checkNotNullParameter(chartStartTimeProvider, "chartStartTimeProvider");
        Intrinsics.checkNotNullParameter(priceLinesUseCase, "priceLinesUseCase");
        Intrinsics.checkNotNullParameter(addBetOnChartUseCase, "addBetOnChartUseCase");
        this.a = chartStartTimeProvider;
        this.b = priceLinesUseCase;
        this.c = addBetOnChartUseCase;
        this.e = new ArrayList();
    }

    @Override // defpackage.InterfaceC2124Tz0
    public final void a(@NotNull OQ chart) {
        Intrinsics.checkNotNullParameter(chart, "chart");
        this.d = chart;
        chart.getXAxis().f = this.a.b();
        chart.setOnChartGestureListener(d().c(chart));
    }

    @Override // defpackage.InterfaceC2124Tz0
    public final void b(@NotNull SZ1 entry, long j, long j2, @NotNull Function0<JQ> currentBetProvider, @NotNull Function0<Boolean> isParentResumed) {
        WP0 wp0;
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(currentBetProvider, "currentBetProvider");
        Intrinsics.checkNotNullParameter(isParentResumed, "isParentResumed");
        OQ oq = this.d;
        if (oq == null) {
            return;
        }
        long j3 = entry.a;
        float f = entry.b;
        if (Float.isNaN(f) || j3 < 0 || j2 == 0) {
            return;
        }
        C2202Uz0 c2202Uz0 = new C2202Uz0(j3);
        JA ja = this.a;
        ja.g(c2202Uz0);
        float fE = ja.e(j3);
        long j4 = (long) fE;
        long j5 = 1;
        for (int i = 0; i < 3; i++) {
            j5 *= (long) 10;
        }
        final float f2 = (j4 / j5) * j5;
        long j6 = j / ((long) 60);
        long j7 = 0;
        final long j8 = j6 / ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
        ArrayList arrayList = this.e;
        C2904bF.r(arrayList, new Function1() { // from class: Vz0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C3506e70 it = (C3506e70) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                float fB = it.b();
                float f3 = f2;
                return Boolean.valueOf(fB >= f3 || Math.abs(f3 - it.b()) > ((float) (((long) 900000) * j8)));
            }
        });
        arrayList.add(new C3506e70(f2, f));
        if (isParentResumed.invoke().booleanValue() && (wp0 = (WP0) oq.getData()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                C3506e70 c3506e70 = (C3506e70) obj;
                long j9 = j7;
                if (((long) c3506e70.b()) % j6 == j9 || c3506e70.b() == f2) {
                    arrayList2.add(obj);
                }
                j7 = j9;
            }
            Hl2 xAxis = oq.getXAxis();
            float fB = ((C3506e70) CollectionsKt.F(arrayList2)).b();
            xAxis.v = true;
            xAxis.y = fB;
            xAxis.z = Math.abs(xAxis.x - fB);
            InterfaceC4255hh1 interfaceC4255hh1 = this.b;
            InterfaceC3876ft0 interfaceC3876ft0D = interfaceC4255hh1.d(wp0, arrayList2);
            JQ jqInvoke = currentBetProvider.invoke();
            interfaceC4255hh1.c(wp0, interfaceC3876ft0D, f, fE);
            Hl2 xAxis2 = oq.getXAxis();
            Intrinsics.checkNotNullExpressionValue(xAxis2, "getXAxis(...)");
            this.b.a(wp0, fE, f, j2, jqInvoke, xAxis2);
            interfaceC4255hh1.b(wp0, fE, f);
            ArrayList arrayList3 = new ArrayList();
            Object data = oq.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            WP0 wp1 = (WP0) data;
            InterfaceC3876ft0 interfaceC3876ft0 = (InterfaceC3876ft0) wp1.f("DOWN");
            if (interfaceC3876ft0 != null) {
                interfaceC3876ft0.clear();
            }
            InterfaceC3876ft0 interfaceC3876ft1 = (InterfaceC3876ft0) wp1.f("UP");
            if (interfaceC3876ft1 != null) {
                interfaceC3876ft1.clear();
            }
            InterfaceC3876ft0 interfaceC3876ft2 = (InterfaceC3876ft0) wp1.f("END");
            if (interfaceC3876ft2 != null) {
                interfaceC3876ft2.clear();
            }
            if (jqInvoke != null) {
                BS bsA = this.c.a(jqInvoke, oq, arrayList3, arrayList);
                oq.setBetUpDataSetIndex(bsA.a);
                oq.setBetDownDataSetIndex(bsA.b);
            }
            arrayList3.add(new C7482wo0(interfaceC3876ft0D.L(), f, 3));
            d().b(fE, j2, jqInvoke, oq, this.f);
            C7482wo0[] c7482wo0Arr = (C7482wo0[]) arrayList3.toArray(new C7482wo0[0]);
            oq.D = c7482wo0Arr;
            oq.setLastHighlighted(c7482wo0Arr);
            ((WP0) oq.e).d(oq.getLowestVisibleX(), oq.getHighestVisibleX());
            oq.h();
            oq.a();
            oq.invalidate();
        }
    }

    @Override // defpackage.InterfaceC2124Tz0
    public final void c(@NotNull List<? extends C3506e70> historyCandles, @NotNull List<SZ1> notShownCandles) {
        Intrinsics.checkNotNullParameter(historyCandles, "historyCandles");
        Intrinsics.checkNotNullParameter(notShownCandles, "notShownCandles");
        this.f = false;
        d().a();
        OQ oq = this.d;
        if (oq != null) {
            oq.D = null;
            oq.setLastHighlighted(null);
        }
        OQ oq2 = this.d;
        if (oq2 != null) {
            T t = oq2.e;
            ArrayList arrayList = t.i;
            if (arrayList != null) {
                arrayList.clear();
            }
            t.b();
            oq2.invalidate();
        }
        ArrayList arrayList2 = this.e;
        arrayList2.clear();
        ArrayList arrayListD = CollectionsKt.D(notShownCandles);
        boolean zIsEmpty = arrayListD.isEmpty();
        JA ja = this.a;
        if (zIsEmpty) {
            ja.a(System.currentTimeMillis());
            arrayList2.addAll(0, historyCandles);
        } else {
            ja.a(((SZ1) CollectionsKt.F(arrayListD)).a);
            arrayList2.addAll(0, CollectionsKt.Q(historyCandles, ja.f(arrayListD)));
        }
        this.f = true;
    }

    @NotNull
    public abstract InterfaceC7524x11 d();
}
