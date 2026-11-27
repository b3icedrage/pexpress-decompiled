package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lg2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.repositories.WebSocketConnectionRepositoryImpl", f = "WebSocketConnectionRepositoryImpl.kt", l = {38, 44, 46}, m = "authenticate")
public final class C5140lg2 extends LM {
    public C5563ng2 d;
    public String e;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ C5563ng2 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5140lg2(C5563ng2 c5563ng2, LM lm) {
        super(lm);
        this.i = c5563ng2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.c(false, null, 0L, this);
    }
}
