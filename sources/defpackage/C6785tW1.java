package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.events.impl.SuspendDataStore", f = "SuspendDataStore.kt", l = {28}, m = "getEntries")
public final class C6785tW1 extends LM {
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C7416wW1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6785tW1(C7416wW1 c7416wW1, LM lm) {
        super(lm);
        this.g = c7416wW1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, this);
    }
}
