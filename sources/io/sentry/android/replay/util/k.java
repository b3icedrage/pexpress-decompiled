package io.sentry.android.replay.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import defpackage.C4564j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 1)
public final class k {

    @Nullable
    public final Color a;
    public final boolean b;

    public k(Color color, boolean z) {
        this.a = color;
        this.b = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.a(this.a, kVar.a) && this.b == kVar.b;
    }

    public final int hashCode() {
        Color color = this.a;
        return Boolean.hashCode(this.b) + ((color == null ? 0 : Color.hashCode-impl(color.unbox-impl())) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TextAttributes(color=");
        sb.append(this.a);
        sb.append(", hasFillModifier=");
        return C4564j.f(sb, this.b, ')');
    }
}
