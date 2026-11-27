package defpackage;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class A implements InterfaceC7807yN {
    public final float a;

    public A(float f) {
        this.a = f;
    }

    @Override // defpackage.InterfaceC7807yN
    public final float a(@NonNull RectF rectF) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A) && this.a == ((A) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
