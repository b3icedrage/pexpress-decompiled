package defpackage;

import com.google.android.gms.common.ConnectionResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: uW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.events.impl.SuspendDataStore", f = "SuspendDataStore.kt", l = {ConnectionResult.API_DISABLED_FOR_CONNECTION}, m = "getValues")
public final class C6995uW1 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C7416wW1 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6995uW1(C7416wW1 c7416wW1, LM lm) {
        super(lm);
        this.e = c7416wW1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.b(null, this);
    }
}
