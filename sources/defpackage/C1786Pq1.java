package defpackage;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Pq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.usecases.RegistrationCurrenciesUseCaseBase", f = "RegistrationCurrenciesUseCaseBase.kt", l = {46, 51}, m = "getValidCurrencies")
public final class C1786Pq1 extends LM {
    public C2020Sq1 d;
    public ArrayList e;
    public ArrayList g;
    public /* synthetic */ Object h;
    public final /* synthetic */ C2020Sq1 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1786Pq1(C2020Sq1 c2020Sq1, LM lm) {
        super(lm);
        this.i = c2020Sq1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.c(this);
    }
}
