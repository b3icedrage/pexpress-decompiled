package defpackage;

import com.api.core.backend.domain.models.responseModels.CommonAccount;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: c4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3074c4 extends AbstractC4766ju implements InterfaceC2865b4 {

    @NotNull
    public final AbstractC5463nB1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3074c4(@NotNull AbstractC5463nB1 router) {
        super(router);
        Intrinsics.checkNotNullParameter(router, "router");
        this.b = router;
    }

    @Override // defpackage.InterfaceC2865b4
    public final void c(@NotNull CommonAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.b.b();
    }
}
