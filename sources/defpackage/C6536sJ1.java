package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: sJ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6536sJ1 {
    public int a;

    @NotNull
    public final int[] b = new int[10];

    public final int a() {
        if ((this.a & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            return this.b[7];
        }
        return 65535;
    }

    public final void b(@NotNull C6536sJ1 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & other.a) != 0) {
                c(i, other.b[i]);
            }
        }
    }

    @NotNull
    public final void c(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i >= iArr.length) {
                return;
            }
            this.a = (1 << i) | this.a;
            iArr[i] = i2;
        }
    }
}
