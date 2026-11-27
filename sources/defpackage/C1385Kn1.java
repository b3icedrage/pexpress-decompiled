package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.charset.CharacterCodingException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Kn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1385Kn1 extends AbstractC4995l0 {

    @NotNull
    public final PE0 e;
    public int f;

    @NotNull
    public final C5782oj g;

    public C1385Kn1(@NotNull PE0 reader, @NotNull char[] buffer) throws CharacterCodingException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.e = reader;
        this.f = UserVerificationMethods.USER_VERIFY_PATTERN;
        this.g = new C5782oj(buffer);
        D(0);
    }

    @Override // defpackage.AbstractC4995l0
    @NotNull
    public final String A(int i, int i2) {
        C5782oj c5782oj = this.g;
        return d.f(c5782oj.d, i, Math.min(i2, c5782oj.e));
    }

    @Override // defpackage.AbstractC4995l0
    public final boolean B() {
        int iZ = z();
        C5782oj c5782oj = this.g;
        if (iZ >= c5782oj.e || iZ == -1 || c5782oj.d[iZ] != ',') {
            return false;
        }
        this.a++;
        return true;
    }

    public final void D(int i) throws CharacterCodingException {
        C5782oj c5782oj = this.g;
        char[] buffer = c5782oj.d;
        if (i != 0) {
            int i2 = this.a;
            Intrinsics.checkNotNullParameter(buffer, "<this>");
            Intrinsics.checkNotNullParameter(buffer, "destination");
            System.arraycopy(buffer, i2, buffer, 0, (i2 + i) - i2);
        }
        int i3 = c5782oj.e;
        while (i != i3) {
            PE0 pe0 = this.e;
            pe0.getClass();
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            int iA = pe0.a.a(buffer, i, i3 - i);
            if (iA == -1) {
                c5782oj.e = Math.min(c5782oj.d.length, i);
                this.f = -1;
                break;
            }
            i += iA;
        }
        this.a = 0;
    }

    @Override // defpackage.AbstractC4995l0
    public final void b(int i, int i2) {
        StringBuilder sb = this.d;
        sb.append(this.g.d, i, i2 - i);
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
    }

    @Override // defpackage.AbstractC4995l0
    public final boolean c() throws CharacterCodingException {
        o();
        int i = this.a;
        while (true) {
            int iY = y(i);
            if (iY == -1) {
                this.a = iY;
                return false;
            }
            char c = this.g.d[iY];
            if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
                this.a = iY;
                return !(c == '}' || c == ']' || c == ':' || c == ',');
            }
            i = iY + 1;
        }
    }

    @Override // defpackage.AbstractC4995l0
    @NotNull
    public final String e() throws CharacterCodingException {
        char[] cArr;
        h('\"');
        int i = this.a;
        C5782oj c5782oj = this.g;
        int i2 = c5782oj.e;
        int i3 = i;
        while (true) {
            cArr = c5782oj.d;
            if (i3 >= i2) {
                i3 = -1;
                break;
            }
            if (cArr[i3] == '\"') {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            int iY = y(i);
            if (iY != -1) {
                return k(c5782oj, this.a, iY);
            }
            s((byte) 1, true);
            throw null;
        }
        for (int i4 = i; i4 < i3; i4++) {
            if (cArr[i4] == '\\') {
                return k(c5782oj, this.a, i4);
            }
        }
        this.a = i3 + 1;
        return d.f(cArr, i, Math.min(i3, c5782oj.e));
    }

    @Override // defpackage.AbstractC4995l0
    public final byte f() throws CharacterCodingException {
        o();
        int i = this.a;
        while (true) {
            int iY = y(i);
            if (iY == -1) {
                this.a = iY;
                return (byte) 10;
            }
            int i2 = iY + 1;
            byte bE = C5208m0.e(this.g.d[iY]);
            if (bE != 3) {
                this.a = i2;
                return bE;
            }
            i = i2;
        }
    }

    @Override // defpackage.AbstractC4995l0
    public final void o() throws CharacterCodingException {
        int i = this.g.e - this.a;
        if (i > this.f) {
            return;
        }
        D(i);
    }

    @Override // defpackage.AbstractC4995l0
    public final CharSequence u() {
        return this.g;
    }

    @Override // defpackage.AbstractC4995l0
    @Nullable
    public final String v(@NotNull String keyToMatch, boolean z) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        return null;
    }

    @Override // defpackage.AbstractC4995l0
    public final int y(int i) throws CharacterCodingException {
        C5782oj c5782oj = this.g;
        if (i < c5782oj.e) {
            return i;
        }
        this.a = i;
        o();
        return (this.a != 0 || c5782oj.length() == 0) ? -1 : 0;
    }
}
