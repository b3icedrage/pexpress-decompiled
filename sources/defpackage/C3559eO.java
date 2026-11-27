package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: eO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.account.usecases.CountryListPreloadUseCaseBase", f = "CountryListPreloadUseCaseBase.kt", l = {30}, m = "loadAndCacheFromApi")
public final class C3559eO extends LM {
    public C3769fO d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C3769fO g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3559eO(C3769fO c3769fO, JM<? super C3559eO> jm) {
        super(jm);
        this.g = c3769fO;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return C3769fO.b(this.g, this);
    }
}
