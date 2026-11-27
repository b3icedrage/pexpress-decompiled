package defpackage;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: renamed from: p8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5870p8 implements InterfaceC7807yN {
    public final InterfaceC7807yN a;
    public final float b;

    public C5870p8(float f, @NonNull InterfaceC7807yN interfaceC7807yN) {
        while (interfaceC7807yN instanceof C5870p8) {
            interfaceC7807yN = ((C5870p8) interfaceC7807yN).a;
            f += ((C5870p8) interfaceC7807yN).b;
        }
        this.a = interfaceC7807yN;
        this.b = f;
    }

    @Override // defpackage.InterfaceC7807yN
    public final float a(@NonNull RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5870p8)) {
            return false;
        }
        C5870p8 c5870p8 = (C5870p8) obj;
        return this.a.equals(c5870p8.a) && this.b == c5870p8.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
