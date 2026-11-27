package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5304mS1 extends AbstractC4995l0 {

    @NotNull
    public final String e;

    public C5304mS1(@NotNull String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.e = source;
    }

    @Override // defpackage.AbstractC4995l0
    public final boolean B() {
        int iZ = z();
        String str = this.e;
        if (iZ == str.length() || iZ == -1 || str.charAt(iZ) != ',') {
            return false;
        }
        this.a++;
        return true;
    }

    @Override // defpackage.AbstractC4995l0
    public final boolean c() {
        int i = this.a;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.e;
            if (i >= str.length()) {
                this.a = i;
                return false;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.a = i;
                return !(cCharAt == '}' || cCharAt == ']' || cCharAt == ':' || cCharAt == ',');
            }
            i++;
        }
    }

    @Override // defpackage.AbstractC4995l0
    @NotNull
    public final String e() {
        h('\"');
        int i = this.a;
        String str = this.e;
        int iF = StringsKt.F('\"', i, 4, str);
        if (iF == -1) {
            l();
            s((byte) 1, false);
            throw null;
        }
        for (int i2 = i; i2 < iF; i2++) {
            if (str.charAt(i2) == '\\') {
                return k(str, this.a, i2);
            }
        }
        this.a = iF + 1;
        String strSubstring = str.substring(i, iF);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // defpackage.AbstractC4995l0
    public final byte f() {
        byte bE;
        do {
            int i = this.a;
            if (i == -1) {
                return (byte) 10;
            }
            String str = this.e;
            if (i >= str.length()) {
                return (byte) 10;
            }
            int i2 = this.a;
            this.a = i2 + 1;
            bE = C5208m0.e(str.charAt(i2));
        } while (bE == 3);
        return bE;
    }

    @Override // defpackage.AbstractC4995l0
    public final void h(char c) {
        if (this.a == -1) {
            C(c);
            throw null;
        }
        while (true) {
            int i = this.a;
            String str = this.e;
            if (i >= str.length()) {
                this.a = -1;
                C(c);
                throw null;
            }
            int i2 = this.a;
            this.a = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt == c) {
                    return;
                }
                C(c);
                throw null;
            }
        }
    }

    @Override // defpackage.AbstractC4995l0
    public final CharSequence u() {
        return this.e;
    }

    @Override // defpackage.AbstractC4995l0
    @Nullable
    public final String v(@NotNull String keyToMatch, boolean z) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        int i = this.a;
        try {
            if (f() != 6) {
                return null;
            }
            if (!Intrinsics.a(x(z), keyToMatch)) {
                return null;
            }
            this.c = null;
            if (f() != 5) {
                return null;
            }
            return x(z);
        } finally {
            this.a = i;
            this.c = null;
        }
    }

    @Override // defpackage.AbstractC4995l0
    public final int y(int i) {
        if (i < this.e.length()) {
            return i;
        }
        return -1;
    }

    @Override // defpackage.AbstractC4995l0
    public final int z() {
        char cCharAt;
        int i = this.a;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.e;
            if (i >= str.length() || !((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i++;
        }
        this.a = i;
        return i;
    }
}
