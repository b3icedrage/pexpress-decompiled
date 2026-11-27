package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: j8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4607j8 implements InterfaceC3509e8 {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final InterfaceC7012ub2 b;

    @NotNull
    public final C3719f8 c;

    public C4607j8(C4923kf appData, InterfaceC7012ub2 userRepositoryApi) {
        C3719f8 registerPushEmail = new C3719f8();
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(userRepositoryApi, "userRepositoryApi");
        Intrinsics.checkNotNullParameter(registerPushEmail, "registerPushEmail");
        this.a = appData;
        this.b = userRepositoryApi;
        this.c = registerPushEmail;
    }

    @Override // defpackage.InterfaceC3509e8
    @Nullable
    public final Object a(long j, @NotNull LM lm) {
        Object value = this.a.k.getValue();
        Intrinsics.checkNotNull(value);
        C6945uG c6945uG = (C6945uG) value;
        this.c.invoke(c6945uG.b);
        return C4349i8.a(j, new C3929g8(this, c6945uG, null), lm);
    }
}
