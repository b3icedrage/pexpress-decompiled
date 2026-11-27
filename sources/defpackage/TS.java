package defpackage;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {365, 366, 368, 369, 380, 384}, m = "readDataOrHandleCorruption")
public final class TS extends LM {
    public Object d;
    public Object e;
    public Serializable g;
    public C3027bp1 h;
    public boolean i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ IS<Object> l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TS(IS is, LM lm) {
        super(lm);
        this.l = is;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return IS.f(this.l, false, this);
    }
}
