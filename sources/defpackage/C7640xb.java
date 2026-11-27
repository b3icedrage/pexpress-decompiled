package defpackage;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: renamed from: xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7640xb implements InterfaceC3129cK0 {
    public final int b;
    public final InterfaceC3129cK0 c;

    public C7640xb(int i, InterfaceC3129cK0 interfaceC3129cK0) {
        this.b = i;
        this.c = interfaceC3129cK0;
    }

    @Override // defpackage.InterfaceC3129cK0
    public final void b(@NonNull MessageDigest messageDigest) {
        this.c.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }

    @Override // defpackage.InterfaceC3129cK0
    public final boolean equals(Object obj) {
        if (obj instanceof C7640xb) {
            C7640xb c7640xb = (C7640xb) obj;
            if (this.b == c7640xb.b && this.c.equals(c7640xb.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC3129cK0
    public final int hashCode() {
        return C6177qc2.h(this.b, this.c);
    }
}
