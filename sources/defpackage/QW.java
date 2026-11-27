package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class QW extends AbstractC5533nZ {

    @NotNull
    public final AbstractC2766af2 a;

    public QW(@NotNull AbstractC2766af2 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.a = delegate;
    }

    @Override // defpackage.AbstractC5533nZ
    @NotNull
    public final AbstractC2766af2 a() {
        return this.a;
    }

    @Override // defpackage.AbstractC5533nZ
    @NotNull
    public final String b() {
        return this.a.b();
    }

    @Override // defpackage.AbstractC5533nZ
    @NotNull
    public final AbstractC5533nZ d() {
        AbstractC5533nZ abstractC5533nZG = C5323mZ.g(this.a.c());
        Intrinsics.checkNotNullExpressionValue(abstractC5533nZG, "toDescriptorVisibility(...)");
        return abstractC5533nZG;
    }
}
