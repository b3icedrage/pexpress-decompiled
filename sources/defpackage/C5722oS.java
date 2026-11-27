package defpackage;

import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: renamed from: oS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5722oS implements InterfaceC3129cK0 {
    public final InterfaceC3129cK0 b;
    public final InterfaceC3129cK0 c;

    public C5722oS(InterfaceC3129cK0 interfaceC3129cK0, InterfaceC3129cK0 interfaceC3129cK1) {
        this.b = interfaceC3129cK0;
        this.c = interfaceC3129cK1;
    }

    @Override // defpackage.InterfaceC3129cK0
    public final void b(@NonNull MessageDigest messageDigest) {
        this.b.b(messageDigest);
        this.c.b(messageDigest);
    }

    @Override // defpackage.InterfaceC3129cK0
    public final boolean equals(Object obj) {
        if (obj instanceof C5722oS) {
            C5722oS c5722oS = (C5722oS) obj;
            if (this.b.equals(c5722oS.b) && this.c.equals(c5722oS.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC3129cK0
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + '}';
    }
}
