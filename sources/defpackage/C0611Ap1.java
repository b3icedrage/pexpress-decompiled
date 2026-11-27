package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ap1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0611Ap1 extends AbstractC5173lp1 implements InterfaceC6310rE0 {

    @NotNull
    public final Enum<?> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0611Ap1(@Nullable C5638o21 c5638o21, @NotNull Enum<?> value) {
        super(c5638o21);
        Intrinsics.checkNotNullParameter(value, "value");
        this.b = value;
    }

    @Override // defpackage.InterfaceC6310rE0
    @Nullable
    public final QC b() {
        Class<?> enclosingClass = this.b.getClass();
        if (!enclosingClass.isEnum()) {
            enclosingClass = enclosingClass.getEnclosingClass();
        }
        Intrinsics.checkNotNull(enclosingClass);
        return C4753jp1.a(enclosingClass);
    }

    @Override // defpackage.InterfaceC6310rE0
    @Nullable
    public final C5638o21 d() {
        return C5638o21.k(this.b.name());
    }
}
