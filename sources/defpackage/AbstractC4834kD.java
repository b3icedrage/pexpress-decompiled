package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4834kD implements InterfaceC6494s62 {
    public int a;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof InterfaceC6494s62) && obj.hashCode() == hashCode()) {
            InterfaceC6494s62 interfaceC6494s62 = (InterfaceC6494s62) obj;
            if (interfaceC6494s62.b().size() == b().size()) {
                InterfaceC5044lD interfaceC5044lDC = c();
                InterfaceC5044lD interfaceC5044lDC2 = interfaceC6494s62.c();
                if (interfaceC5044lDC2 == null || R70.f(interfaceC5044lDC) || C4432iZ.o(interfaceC5044lDC) || R70.f(interfaceC5044lDC2) || C4432iZ.o(interfaceC5044lDC2)) {
                    return false;
                }
                return g(interfaceC5044lDC2);
            }
        }
        return false;
    }

    public abstract boolean g(@NotNull InterfaceC5044lD interfaceC5044lD);

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        InterfaceC5044lD interfaceC5044lDC = c();
        int iIdentityHashCode = (R70.f(interfaceC5044lDC) || C4432iZ.o(interfaceC5044lDC)) ? System.identityHashCode(this) : C4432iZ.g(interfaceC5044lDC).a.hashCode();
        this.a = iIdentityHashCode;
        return iIdentityHashCode;
    }
}
