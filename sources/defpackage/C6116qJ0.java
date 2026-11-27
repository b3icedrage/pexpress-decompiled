package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6116qJ0 extends LP {
    @Override // defpackage.LP, defpackage.InterfaceC5518nU
    public final Object e(AC descriptor, Object obj) {
        Unit data = (Unit) obj;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(data, "data");
        throw new IllegalStateException("No constructors should appear here: " + descriptor);
    }
}
