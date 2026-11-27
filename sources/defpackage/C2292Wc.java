package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2292Wc extends CK<InterfaceC1583Nc> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2292Wc(@NotNull InterfaceC1583Nc value) {
        super(value);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // defpackage.CK
    @NotNull
    public final AbstractC4649jL0 a(@NotNull S01 module) {
        Intrinsics.checkNotNullParameter(module, "module");
        return ((InterfaceC1583Nc) this.a).getType();
    }
}
