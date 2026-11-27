package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: vb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7220vb0 implements InterfaceC1013Ft1 {

    @NotNull
    public final String a;

    public C7220vb0(@NotNull JSONObject response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.a = C0957Fb.o(response);
    }
}
