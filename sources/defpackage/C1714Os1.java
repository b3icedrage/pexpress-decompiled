package defpackage;

import com.appsflyer.share.attribution.RequestError;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Os1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.usecases.impl.RequestPermissionUseCaseBase", f = "RequestPermissionUseCaseBase.kt", l = {36, RequestError.NETWORK_FAILURE}, m = "requestPermission$suspendImpl")
public final class C1714Os1 extends LM {
    public AbstractC1870Qs1 d;
    public Function0 e;
    public Function0 g;
    public /* synthetic */ Object h;
    public final /* synthetic */ AbstractC1870Qs1 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1714Os1(AbstractC1870Qs1 abstractC1870Qs1, LM lm) {
        super(lm);
        this.i = abstractC1870Qs1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return AbstractC1870Qs1.e(this.i, null, null, null, this);
    }
}
