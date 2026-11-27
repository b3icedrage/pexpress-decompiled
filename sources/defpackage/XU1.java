package defpackage;

import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.direction.local_calculators.SummaryDirectionCalculator", f = "SummaryDirectionCalculator.kt", l = {54}, m = "indicatorImplementation")
public final class XU1 extends LM {
    public List d;
    public I10 e;
    public C3163cV1 g;
    public C2590Zo1 h;
    public C2590Zo1 i;
    public Iterator j;
    public /* synthetic */ Object k;
    public final /* synthetic */ YU1 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XU1(YU1 yu1, LM lm) {
        super(lm);
        this.l = yu1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.p(null, null, null, this);
    }
}
