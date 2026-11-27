package defpackage;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: renamed from: ao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2812ao extends AbstractC5713oP.d.a {
    public final String a;
    public final byte[] b;

    public C2812ao(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    @Override // defpackage.AbstractC5713oP.d.a
    @NonNull
    public final byte[] a() {
        return this.b;
    }

    @Override // defpackage.AbstractC5713oP.d.a
    @NonNull
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5713oP.d.a)) {
            return false;
        }
        AbstractC5713oP.d.a aVar = (AbstractC5713oP.d.a) obj;
        if (this.a.equals(aVar.b())) {
            return Arrays.equals(this.b, aVar instanceof C2812ao ? ((C2812ao) aVar).b : aVar.a());
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}
