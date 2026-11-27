package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: t01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6679t01 extends AbstractC7346w92<InterfaceC2966bZ1> {

    @NotNull
    public final EnumC6172qb1 e;

    /* JADX WARN: Illegal instructions before constructor call */
    public C6679t01() {
        EnumC6172qb1 padding = EnumC6172qb1.e;
        Intrinsics.checkNotNullParameter(padding, "padding");
        C6926u92<InterfaceC2966bZ1> c6926u92 = C3175cZ1.b;
        EnumC6172qb1 enumC6172qb1 = EnumC6172qb1.d;
        super(c6926u92, 2, null);
        this.e = padding;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C6679t01) {
            return this.e == ((C6679t01) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
