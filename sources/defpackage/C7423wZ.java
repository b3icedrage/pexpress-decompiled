package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7423wZ implements CC {

    @NotNull
    public final InterfaceC2973bb1 a;

    public C7423wZ(@NotNull InterfaceC2973bb1 packageFragmentProvider) {
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        this.a = packageFragmentProvider;
    }

    @Override // defpackage.CC
    @Nullable
    public final BC a(@NotNull QC classId) {
        BC bcA;
        Intrinsics.checkNotNullParameter(classId, "classId");
        for (InterfaceC2392Xa1 interfaceC2392Xa1 : C5027l8.v(this.a, classId.a)) {
            if ((interfaceC2392Xa1 instanceof WZ) && (bcA = ((WZ) interfaceC2392Xa1).U0().a(classId)) != null) {
                return bcA;
            }
        }
        return null;
    }
}
