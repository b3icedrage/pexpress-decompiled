package defpackage;

import coil.memory.RequestDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "coil.RealImageLoader", f = "RealImageLoader.kt", l = {290, 179, 298, 300, 311, 328, 339}, m = "executeMain")
public final class C5170lo1 extends LM {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ C4750jo1 g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public RequestDelegate l;
    public Object m;
    public Object n;
    public C7716xw0 o;
    public AbstractC7926yw0.a p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5170lo1(C4750jo1 c4750jo1, LM lm) {
        super(lm);
        this.g = c4750jo1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.g.b(null, this);
    }
}
