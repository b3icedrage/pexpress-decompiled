package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.pexpress.tool.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOQ;", "LsR;", "FeatureGraphicApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class OQ extends AbstractC6558sR {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OQ(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OQ(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OQ(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        setBackground(Pd2.a(this, R.color.surface));
        Hl2 xAxis = getXAxis();
        xAxis.g = C0648Bc.c(this, R.color.altSurface);
        xAxis.i = C0648Bc.c(this, R.color.transparent);
        xAxis.e = C0648Bc.c(this, R.color.textGrey);
        xAxis.n = 3;
        getAxisLeft().C = 45.0f;
        Kl2 axisRight = getAxisRight();
        axisRight.g = C0648Bc.c(this, R.color.altSurface);
        axisRight.n = 3;
        axisRight.C = 45.0f;
        setScaleEnabled(false);
    }
}
