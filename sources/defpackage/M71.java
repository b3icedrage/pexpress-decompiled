package defpackage;

import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class M71 implements InterfaceC3129cK0 {
    public final Object b;

    public M71(@NonNull Object obj) {
        UE.e(obj, "Argument must not be null");
        this.b = obj;
    }

    @Override // defpackage.InterfaceC3129cK0
    public final void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(InterfaceC3129cK0.a));
    }

    @Override // defpackage.InterfaceC3129cK0
    public final boolean equals(Object obj) {
        if (obj instanceof M71) {
            return this.b.equals(((M71) obj).b);
        }
        return false;
    }

    @Override // defpackage.InterfaceC3129cK0
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.b + '}';
    }
}
