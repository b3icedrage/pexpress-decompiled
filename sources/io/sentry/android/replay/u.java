package io.sentry.android.replay;

import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.EF0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 1)
public final class u {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final int e;
    public final int f;

    public u(int i, int i2, float f, float f2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i3;
        this.f = i4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.a == uVar.a && this.b == uVar.b && Float.compare(this.c, uVar.c) == 0 && Float.compare(this.d, uVar.d) == 0 && this.e == uVar.e && this.f == uVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + EF0.a(this.e, (Float.hashCode(this.d) + ((Float.hashCode(this.c) + EF0.a(this.b, Integer.hashCode(this.a) * 31, 31)) * 31)) * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "ScreenshotRecorderConfig(recordingWidth=" + this.a + ", recordingHeight=" + this.b + ", scaleFactorX=" + this.c + ", scaleFactorY=" + this.d + ", frameRate=" + this.e + ", bitRate=" + this.f + ')';
    }
}
