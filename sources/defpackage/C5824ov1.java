package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ov1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5824ov1 implements InterfaceC5614nv1 {

    @NotNull
    public final InterfaceC4976ku a;

    public C5824ov1(@NotNull InterfaceC4976ku bottomSheetDialogsDataProviderApi) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogsDataProviderApi, "bottomSheetDialogsDataProviderApi");
        this.a = bottomSheetDialogsDataProviderApi;
    }

    @Override // defpackage.InterfaceC5614nv1
    @NotNull
    public final C3668eu a(@NotNull EnumC5404mv1 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        int iOrdinal = type.ordinal();
        InterfaceC4976ku interfaceC4976ku = this.a;
        if (iOrdinal == 0) {
            return interfaceC4976ku.b();
        }
        if (iOrdinal == 1) {
            return interfaceC4976ku.a();
        }
        if (iOrdinal == 2) {
            return interfaceC4976ku.c();
        }
        if (iOrdinal == 3) {
            return interfaceC4976ku.e();
        }
        throw new C6489s51();
    }
}
