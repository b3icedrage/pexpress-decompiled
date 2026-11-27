package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wE1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7361wE1 extends AbstractC7346w92<InterfaceC2966bZ1> {

    @NotNull
    public final EnumC6172qb1 e;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7361wE1() {
        EnumC6172qb1 padding = EnumC6172qb1.e;
        Intrinsics.checkNotNullParameter(padding, "padding");
        C6926u92<InterfaceC2966bZ1> c6926u92 = C3175cZ1.c;
        EnumC6172qb1 enumC6172qb1 = EnumC6172qb1.d;
        super(c6926u92, 2, null);
        this.e = padding;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C7361wE1) {
            return this.e == ((C7361wE1) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
