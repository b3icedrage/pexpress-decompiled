package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.events.impl.BackendApiImplKt", f = "BackendApiImpl.kt", l = {78}, m = "requestMapper")
public final class C6643sp<T> extends LM {
    public /* synthetic */ Object d;
    public int e;

    public C6643sp() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        Object objA = C6853tp.a(null, this);
        return objA == MN.d ? objA : new C1717Ot1(objA);
    }
}
