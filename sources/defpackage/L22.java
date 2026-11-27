package defpackage;

import com.api.core.backend.domain.models.requestModels.AddDealRequest;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class L22 implements K22 {

    @NotNull
    public final InterfaceC7007ua1 a;

    public L22(@NotNull InterfaceC7007ua1 ourSideHttpService) {
        Intrinsics.checkNotNullParameter(ourSideHttpService, "ourSideHttpService");
        this.a = ourSideHttpService;
    }

    @Override // defpackage.K22
    @Nullable
    public final Object d(@NotNull AddDealRequest addDealRequest, @NotNull M32 m32) {
        return this.a.j(addDealRequest, m32);
    }
}
