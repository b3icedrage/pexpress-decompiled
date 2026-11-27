package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.usecases.AnalyticsUseCaseBase", f = "AnalyticsUseCaseBase.kt", l = {99, 100, 101, 102}, m = "getRegisterProperty$suspendImpl")
public final class C0876Ea extends LM {
    public C1110Ha d;
    public String e;
    public String g;
    public String h;
    public /* synthetic */ Object i;
    public final /* synthetic */ C1110Ha j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0876Ea(C1110Ha c1110Ha, LM lm) {
        super(lm);
        this.j = c1110Ha;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return C1110Ha.e(this.j, this);
    }
}
