package defpackage;

import android.graphics.drawable.Drawable;
import com.pexpress.tool.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class T7 implements S7 {

    @NotNull
    public final InterfaceC2714aQ0 a;

    @NotNull
    public final JA b;

    public T7(@NotNull InterfaceC2714aQ0 lineDataSetsProvider, @NotNull JA startTimeProvider) {
        Intrinsics.checkNotNullParameter(lineDataSetsProvider, "lineDataSetsProvider");
        Intrinsics.checkNotNullParameter(startTimeProvider, "startTimeProvider");
        this.a = lineDataSetsProvider;
        this.b = startTimeProvider;
    }

    @Override // defpackage.S7
    @NotNull
    public final BS a(@NotNull JQ bet, @NotNull OQ chart, @NotNull ArrayList listHighlights, @NotNull ArrayList fullDataList) {
        InterfaceC3876ft0 interfaceC3876ft0;
        InterfaceC3876ft0 interfaceC3876ft1;
        InterfaceC3876ft0 interfaceC3876ft2;
        Intrinsics.checkNotNullParameter(bet, "bet");
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(listHighlights, "listHighlights");
        Intrinsics.checkNotNullParameter(fullDataList, "fullDataList");
        WP0 wp0 = (WP0) chart.getData();
        InterfaceC3876ft0 interfaceC3876ft3 = (InterfaceC3876ft0) wp0.f("UP");
        InterfaceC3876ft0 interfaceC3876ft4 = (InterfaceC3876ft0) wp0.f("DOWN");
        InterfaceC3876ft0 interfaceC3876ft5 = (InterfaceC3876ft0) wp0.f("END");
        InterfaceC2714aQ0 interfaceC2714aQ0 = this.a;
        InterfaceC3876ft0 interfaceC3876ft6 = interfaceC3876ft5;
        if (interfaceC3876ft5 == null) {
            YP0 yp0A = interfaceC2714aQ0.a(ZP0.BetEnd);
            wp0.a(yp0A);
            interfaceC3876ft6 = yp0A;
        }
        int iOrdinal = bet.e.ordinal();
        InterfaceC3876ft0 interfaceC3876ft7 = interfaceC3876ft3;
        if (iOrdinal != 0) {
            InterfaceC3876ft0 interfaceC3876ft8 = interfaceC3876ft4;
            if (iOrdinal != 1) {
                throw new C6489s51();
            }
            if (interfaceC3876ft4 == null) {
                YP0 yp0A2 = interfaceC2714aQ0.a(ZP0.BetDown);
                wp0.a(yp0A2);
                interfaceC3876ft8 = yp0A2;
            }
            interfaceC3876ft0 = interfaceC3876ft8;
            interfaceC3876ft2 = interfaceC3876ft3;
            interfaceC3876ft1 = interfaceC3876ft8;
        } else {
            if (interfaceC3876ft3 == null) {
                YP0 yp0A3 = interfaceC2714aQ0.a(ZP0.BetUp);
                wp0.a(yp0A3);
                interfaceC3876ft7 = yp0A3;
            }
            interfaceC3876ft0 = interfaceC3876ft4;
            interfaceC3876ft1 = interfaceC3876ft7;
            interfaceC3876ft2 = interfaceC3876ft7;
        }
        int iIndexOf = wp0.i.indexOf(interfaceC3876ft2);
        int iIndexOf2 = wp0.i.indexOf(interfaceC3876ft0);
        JA ja = this.b;
        float fD = ja.d(bet);
        float fC = ja.c(bet);
        float f = (float) bet.g;
        Float fValueOf = Float.valueOf(f);
        Object next = null;
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            fValueOf = null;
        }
        if (fValueOf == null) {
            return new BS(iIndexOf, iIndexOf2);
        }
        float fFloatValue = fValueOf.floatValue();
        Iterator it = fullDataList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(((C3506e70) next).b() - fD);
                do {
                    Object next2 = it.next();
                    float fAbs2 = Math.abs(((C3506e70) next2).b() - fD);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        }
        C3506e70 c3506e70 = (C3506e70) next;
        if (c3506e70 != null) {
            c3506e70.d = fFloatValue;
        }
        float f2 = chart.getAxisLeft().y;
        float f3 = chart.getAxisLeft().x;
        interfaceC3876ft6.w(new C3506e70(fC, f3));
        Drawable drawable = C6333rM.getDrawable(chart.getContext(), R.drawable.ic_finish_bet_chart);
        C3506e70 c3506e71 = new C3506e70(((f3 - f2) * 0.02f) + f2);
        c3506e71.g = drawable;
        c3506e71.h = fC;
        interfaceC3876ft6.w(c3506e71);
        interfaceC3876ft1.w(new C3506e70(fD, fFloatValue));
        interfaceC3876ft1.w(new C3506e70(fC, fFloatValue));
        listHighlights.add(new C7482wo0(fD, fFloatValue, wp0.i.indexOf(interfaceC3876ft1)));
        listHighlights.add(new C7482wo0(fC, f2, wp0.i.indexOf(interfaceC3876ft6)));
        return new BS(iIndexOf, iIndexOf2);
    }
}
