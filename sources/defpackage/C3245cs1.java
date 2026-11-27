package defpackage;

import com.base.feature.analytics.reporters.ReporterBase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.analytics.reporters.ReporterBase", f = "ReporterBase.kt", l = {137, 145}, m = "handleNewUser")
public final class C3245cs1 extends LM {
    public ReporterBase d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ReporterBase g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3245cs1(ReporterBase reporterBase, LM lm) {
        super(lm);
        this.g = reporterBase;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return ReporterBase.n(this.g, this);
    }
}
