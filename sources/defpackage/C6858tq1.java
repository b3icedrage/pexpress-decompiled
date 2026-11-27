package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.impl.library.registration.usecases.RegisterRequestUseCaseImpl", f = "RegisterRequestUseCaseImpl.kt", l = {39}, m = "getRequest")
public final class C6858tq1 extends LM {
    public String d;
    public String e;
    public String g;
    public String h;
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ C7278vq1 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6858tq1(C7278vq1 c7278vq1, LM lm) {
        super(lm);
        this.k = c7278vq1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
