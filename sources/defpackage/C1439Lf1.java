package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: renamed from: Lf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1439Lf1<T> {
    public final Object[] a = new Object[UserVerificationMethods.USER_VERIFY_HANDPRINT];
    public int b;

    public final void a(C0747Cj c0747Cj) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            objArr[i] = c0747Cj;
            this.b = i + 1;
        }
    }
}
