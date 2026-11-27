package defpackage;

import com.appsflyer.share.attribution.RequestError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mC1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.backend.helpers.SafeRequestsApi$DefaultImpls", f = "SafeRequestsApi.kt", l = {RequestError.NO_DEV_KEY, 43}, m = "tryOrNullWithError")
public final class C5256mC1<T> extends LM {
    public InterfaceC4833kC1 d;
    public /* synthetic */ Object e;
    public int g;

    public C5256mC1() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return InterfaceC4833kC1.a.b(this, null, null);
    }
}
