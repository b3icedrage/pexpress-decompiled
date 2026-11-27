package defpackage;

import java.util.LinkedHashSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5657o70 extends G1 {
    public final /* synthetic */ LinkedHashSet e;

    public C5657o70(LinkedHashSet linkedHashSet) {
        this.e = linkedHashSet;
    }

    public static /* synthetic */ void w(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.G1
    public final void a(@NotNull InterfaceC1490Lx interfaceC1490Lx) {
        if (interfaceC1490Lx == null) {
            w(0);
            throw null;
        }
        C1346Ka1.r(interfaceC1490Lx, null);
        this.e.add(interfaceC1490Lx);
    }

    @Override // defpackage.G1
    public final void e(@NotNull InterfaceC1490Lx interfaceC1490Lx, @NotNull InterfaceC1490Lx interfaceC1490Lx2) {
        if (interfaceC1490Lx2 != null) {
            return;
        }
        w(2);
        throw null;
    }
}
