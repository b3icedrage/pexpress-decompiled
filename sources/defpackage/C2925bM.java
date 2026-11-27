package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: bM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2925bM implements InterfaceC4861kM {
    public final /* synthetic */ C4651jM a;

    public C2925bM(C4651jM c4651jM) {
        this.a = c4651jM;
    }

    @Override // defpackage.InterfaceC4861kM
    public final boolean a(@NotNull C4651jM contentType) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        return contentType.b(this.a);
    }
}
