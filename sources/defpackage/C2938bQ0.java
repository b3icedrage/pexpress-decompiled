package defpackage;

import android.content.Context;
import android.graphics.DashPathEffect;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: bQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2938bQ0 implements InterfaceC2714aQ0 {

    @NotNull
    public final Context a;

    public C2938bQ0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    @Override // defpackage.InterfaceC2714aQ0
    @NotNull
    public final YP0 a(@NotNull ZP0 dataSet) {
        Intrinsics.checkNotNullParameter(dataSet, "dataSet");
        int iOrdinal = dataSet.ordinal();
        YP0.a aVar = YP0.a.g;
        Context context = this.a;
        String str = dataSet.d;
        switch (iOrdinal) {
            case 0:
                YP0 yp0 = new YP0(str);
                yp0.d = Kl2.a.d;
                yp0.i0(1.5f);
                yp0.d0(context.getColor(R.color.mainChartLine));
                yp0.B = true;
                yp0.y = C6333rM.getDrawable(context, R.drawable.bg_graph);
                yp0.C = aVar;
                yp0.e = false;
                yp0.j = false;
                yp0.k = false;
                yp0.K = false;
                return yp0;
            case 1:
                YP0 yp1 = new YP0(str);
                yp1.i0(1.0f);
                yp1.d0(context.getColor(R.color.chartLeftPriceLine));
                yp1.C = aVar;
                yp1.e = false;
                yp1.j = false;
                yp1.k = false;
                yp1.K = false;
                return yp1;
            case 2:
                YP0 yp2 = new YP0(str);
                yp2.i0(1.0f);
                yp2.d0(context.getColor(R.color.chartDefaultMarkerBackground));
                yp2.C = aVar;
                yp2.e = false;
                yp2.j = false;
                yp2.k = false;
                yp2.K = false;
                return yp2;
            case 3:
                YP0 yp3 = new YP0(str);
                yp3.i0(1.0f);
                yp3.K = true;
                yp3.j0(context.getColor(R.color.chartMarkerBetDownBackground));
                yp3.d0(context.getColor(R.color.chartMarkerBetDownBackground));
                yp3.l0(4.5f);
                yp3.E = context.getColor(R.color.chartInnerBetPoint);
                yp3.k0(3.0f);
                yp3.C = aVar;
                yp3.e = true;
                yp3.u = false;
                yp3.v = false;
                yp3.j = false;
                yp3.k = false;
                yp3.K = true;
                return yp3;
            case 4:
                YP0 yp4 = new YP0(str);
                yp4.i0(1.0f);
                yp4.K = true;
                yp4.j0(context.getColor(R.color.chartMarkerBetUpBackground));
                yp4.d0(context.getColor(R.color.chartMarkerBetUpBackground));
                yp4.l0(4.5f);
                yp4.E = context.getColor(R.color.chartInnerBetPoint);
                yp4.k0(3.0f);
                yp4.C = aVar;
                yp4.e = true;
                yp4.u = false;
                yp4.v = false;
                yp4.j = false;
                yp4.k = false;
                yp4.K = true;
                return yp4;
            case 5:
                YP0 yp5 = new YP0(str);
                yp5.i0(1.0f);
                yp5.I = new DashPathEffect(new float[]{15.0f, 15.0f}, 0.0f);
                yp5.d0(context.getColor(R.color.chartBetEndLine));
                yp5.C = aVar;
                yp5.e = false;
                yp5.j = false;
                yp5.K = false;
                return yp5;
            case 6:
                YP0 yp6 = new YP0(str);
                yp6.j0(context.getColor(R.color.chartPriceLineOuterPoint));
                yp6.E = context.getColor(R.color.chartPriceLineInnerPoint);
                yp6.k0(4.0f);
                yp6.l0(8.0f);
                yp6.C = aVar;
                yp6.e = true;
                yp6.u = false;
                yp6.v = false;
                yp6.j = false;
                yp6.k = false;
                yp6.K = true;
                return yp6;
            default:
                throw new C6489s51();
        }
    }
}
