package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: zH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7999zH extends C7789yH {
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7999zH(@NotNull IH0 writer, boolean z) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.c = z;
    }

    @Override // defpackage.C7789yH
    public final void h(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.c) {
            super.h(value);
        } else {
            f(value);
        }
    }
}
