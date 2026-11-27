package com.base.feature.stub.usecases;

import android.content.Context;
import android.util.AttributeSet;
import com.pexpress.tool.R;
import defpackage.OQ;
import defpackage.Pd2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/base/feature/stub/usecases/StubGameLineChart;", "LOQ;", "FeatureStubBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StubGameLineChart extends OQ {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StubGameLineChart(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        setBackground(Pd2.a(this, R.color.background));
    }
}
