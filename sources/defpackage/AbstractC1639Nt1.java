package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Nt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1639Nt1 extends AbstractC1558Mt1 implements InterfaceC1764Pj0<Object> {
    private final int d;

    public AbstractC1639Nt1(int i, @Nullable JM<Object> jm) {
        super(jm);
        this.d = i;
    }

    @Override // defpackage.InterfaceC1764Pj0
    public final int getArity() {
        return this.d;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strH = C2017Sp1.a.h(this);
        Intrinsics.checkNotNullExpressionValue(strH, "renderLambdaToString(...)");
        return strH;
    }
}
