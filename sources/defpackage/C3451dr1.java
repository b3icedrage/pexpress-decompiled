package defpackage;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: renamed from: dr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3451dr1 implements InterfaceC7807yN {
    public final float a;

    public C3451dr1(float f) {
        this.a = f;
    }

    @Override // defpackage.InterfaceC7807yN
    public final float a(@NonNull RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3451dr1) && this.a == ((C3451dr1) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
