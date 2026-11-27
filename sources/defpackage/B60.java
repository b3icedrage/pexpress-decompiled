package defpackage;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class B60 {
    public final H60 a;
    public final byte[] b;

    public B60(@NonNull H60 h60, @NonNull byte[] bArr) {
        if (h60 == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.a = h60;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B60)) {
            return false;
        }
        B60 b60 = (B60) obj;
        if (this.a.equals(b60.a)) {
            return Arrays.equals(this.b, b60.b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
