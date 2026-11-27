package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {287, 296, 304}, m = "readDataAndUpdateCache")
public final class QS extends LM {
    public IS d;
    public EP1 e;
    public boolean g;
    public /* synthetic */ Object h;
    public final /* synthetic */ IS<Object> i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QS(IS<Object> is, JM<? super QS> jm) {
        super(jm);
        this.i = is;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return IS.e(this.i, false, this);
    }
}
