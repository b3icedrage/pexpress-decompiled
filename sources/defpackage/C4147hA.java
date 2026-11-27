package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4147hA extends AbstractC1112Ha1.d {

    @NotNull
    public final GL0 a;

    @Nullable
    public final C4651jM b;

    public C4147hA(GL0 body, C4651jM c4651jM) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.a = body;
        this.b = c4651jM;
    }

    @Override // defpackage.AbstractC1112Ha1
    @Nullable
    public final Long a() {
        return null;
    }

    @Override // defpackage.AbstractC1112Ha1
    @Nullable
    public final C4651jM b() {
        return this.b;
    }

    @Override // defpackage.AbstractC1112Ha1.d
    @Nullable
    public final Object d(@NotNull InterfaceC1958Rw interfaceC1958Rw, @NotNull AW1 aw1) {
        Object objInvoke = this.a.invoke(interfaceC1958Rw, aw1);
        return objInvoke == MN.d ? objInvoke : Unit.a;
    }
}
