package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: renamed from: db0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3391db0 extends N71.a {
    public static final N71<C3391db0> h;
    public float e;
    public float g;

    static {
        N71<C3391db0> n71A = N71.a(UserVerificationMethods.USER_VERIFY_HANDPRINT, new C3391db0(0));
        h = n71A;
        n71A.f = 0.5f;
    }

    public C3391db0() {
    }

    @Override // N71.a
    public final N71.a a() {
        return new C3391db0(0);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3391db0) {
            C3391db0 c3391db0 = (C3391db0) obj;
            if (this.e == c3391db0.e && this.g == c3391db0.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.e) ^ Float.floatToIntBits(this.g);
    }

    public final String toString() {
        return this.e + "x" + this.g;
    }

    public C3391db0(int i) {
        this.e = 0.0f;
        this.g = 0.0f;
    }
}
