package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.C3060c01;
import defpackage.C3270d01;
import defpackage.T50;
import defpackage.U0;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    @NonNull
    public final C3270d01 a;

    @NonNull
    public final char[] b;

    @NonNull
    public final a c = new a(UserVerificationMethods.USER_VERIFY_ALL);

    @NonNull
    public final Typeface d;

    public static class a {
        public final SparseArray<a> a;
        public T50 b;

        public a() {
            this(1);
        }

        public final void a(@NonNull T50 t50, int i, int i2) {
            int iA = t50.a(i);
            SparseArray<a> sparseArray = this.a;
            a aVar = sparseArray == null ? null : sparseArray.get(iA);
            if (aVar == null) {
                aVar = new a();
                sparseArray.put(t50.a(i), aVar);
            }
            if (i2 > i) {
                aVar.a(t50, i + 1, i2);
            } else {
                aVar.b = t50;
            }
        }

        public a(int i) {
            this.a = new SparseArray<>(i);
        }
    }

    public g(@NonNull Typeface typeface, @NonNull C3270d01 c3270d01) {
        int i;
        int i2;
        int i3;
        int i4;
        this.d = typeface;
        this.a = c3270d01;
        int iA = c3270d01.a(6);
        if (iA != 0) {
            int i5 = iA + c3270d01.a;
            i = c3270d01.b.getInt(c3270d01.b.getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.b = new char[i * 2];
        int iA2 = c3270d01.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + c3270d01.a;
            i2 = c3270d01.b.getInt(c3270d01.b.getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            T50 t50 = new T50(this, i7);
            C3060c01 c3060c01B = t50.b();
            int iA3 = c3060c01B.a(4);
            Character.toChars(iA3 != 0 ? c3060c01B.b.getInt(iA3 + c3060c01B.a) : 0, this.b, i7 * 2);
            C3060c01 c3060c01B2 = t50.b();
            int iA4 = c3060c01B2.a(16);
            if (iA4 != 0) {
                int i8 = iA4 + c3060c01B2.a;
                i3 = c3060c01B2.b.getInt(c3060c01B2.b.getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            U0.d("invalid metadata codepoint length", i3 > 0);
            C3060c01 c3060c01B3 = t50.b();
            int iA5 = c3060c01B3.a(16);
            if (iA5 != 0) {
                int i9 = iA5 + c3060c01B3.a;
                i4 = c3060c01B3.b.getInt(c3060c01B3.b.getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            this.c.a(t50, 0, i4 - 1);
        }
    }
}
