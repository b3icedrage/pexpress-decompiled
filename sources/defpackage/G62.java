package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class G62 {

    @NotNull
    public static final G62 k = new G62(false, false, false, false, false, new G62(false, false, false, false, false, null, false, null, null, 1023), false, null, null, 988);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    @Nullable
    public final G62 f;
    public final boolean g;

    @Nullable
    public final G62 h;

    @Nullable
    public final G62 i;
    public final boolean j;

    public G62(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, G62 g62, boolean z6, G62 g63, G62 g64, int i) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        z3 = (i & 4) != 0 ? false : z3;
        z4 = (i & 8) != 0 ? false : z4;
        z5 = (i & 16) != 0 ? false : z5;
        g62 = (i & 32) != 0 ? null : g62;
        z6 = (i & 64) != 0 ? true : z6;
        g63 = (i & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? g62 : g63;
        g64 = (i & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? g62 : g64;
        boolean z7 = (i & UserVerificationMethods.USER_VERIFY_NONE) == 0;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = g62;
        this.g = z6;
        this.h = g63;
        this.i = g64;
        this.j = z7;
    }
}
