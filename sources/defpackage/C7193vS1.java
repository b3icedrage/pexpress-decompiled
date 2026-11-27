package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: vS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7193vS1 extends CK<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7193vS1(@NotNull String value) {
        super(value);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // defpackage.CK
    public final AbstractC4649jL0 a(S01 module) {
        Intrinsics.checkNotNullParameter(module, "module");
        AbstractC5706oM1 abstractC5706oM1U = module.t().u();
        Intrinsics.checkNotNullExpressionValue(abstractC5706oM1U, "getStringType(...)");
        return abstractC5706oM1U;
    }

    @Override // defpackage.CK
    @NotNull
    public final String toString() {
        return C1039Gc0.e(new StringBuilder("\""), (String) this.a, '\"');
    }
}
