package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: c60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3083c60 implements InterfaceC7719xx0 {
    public final boolean d;

    public C3083c60(boolean z) {
        this.d = z;
    }

    @Override // defpackage.InterfaceC7719xx0
    public final boolean g() {
        return this.d;
    }

    @Override // defpackage.InterfaceC7719xx0
    @Nullable
    public final C7119v51 h() {
        return null;
    }

    @NotNull
    public final String toString() {
        return C1039Gc0.e(new StringBuilder("Empty{"), this.d ? "Active" : "New", '}');
    }
}
