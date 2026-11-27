package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Cp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0767Cp1 extends AbstractC5173lp1 implements InterfaceC7360wE0 {

    @NotNull
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0767Cp1(@Nullable C5638o21 c5638o21, @NotNull Object value) {
        super(c5638o21);
        Intrinsics.checkNotNullParameter(value, "value");
        this.b = value;
    }

    @Override // defpackage.InterfaceC7360wE0
    @NotNull
    public final Object getValue() {
        return this.b;
    }
}
