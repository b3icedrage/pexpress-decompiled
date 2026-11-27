package defpackage;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ua0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.experiments.model.ExperimentBase", f = "ExperimentBase.kt", l = {25}, m = "buildFeatureRequest$suspendImpl")
public final class C7006ua0 extends LM {
    public ZT1 d;
    public Context e;
    public String g;
    public /* synthetic */ Object h;
    public final /* synthetic */ K0 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7006ua0(K0 k0, LM lm) {
        super(lm);
        this.i = k0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return AbstractC7216va0.c(this.i, null, null, null, this);
    }
}
