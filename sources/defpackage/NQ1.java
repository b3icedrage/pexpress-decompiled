package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.datastore.core.StorageConnectionKt$readData$2", f = "StorageConnection.kt", l = {74}, m = "invokeSuspend")
public final class NQ1 extends AW1 implements InterfaceC1060Gj0<InterfaceC1151Hn1<Object>, Boolean, JM<Object>, Object> {
    public int d;
    public /* synthetic */ InterfaceC1151Hn1 e;

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        C1795Pt1.b(obj);
        InterfaceC1151Hn1 interfaceC1151Hn1 = this.e;
        this.d = 1;
        Object objB = interfaceC1151Hn1.b(this);
        return objB == mn ? mn : objB;
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(InterfaceC1151Hn1<Object> interfaceC1151Hn1, Boolean bool, JM<Object> jm) {
        bool.getClass();
        NQ1 nq1 = new NQ1(3, jm);
        nq1.e = interfaceC1151Hn1;
        return nq1.invokeSuspend(Unit.a);
    }
}
