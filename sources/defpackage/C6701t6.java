package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: t6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6701t6 implements ZI1 {

    @NotNull
    public final EnumC2694aJ1 a;

    @NotNull
    public final GP1 b;

    public C6701t6(@NotNull C4923kf appData) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        this.a = EnumC2694aJ1.IS_USER_ACTIVATED_KEY;
        this.b = appData.e;
    }

    @Override // defpackage.ZI1
    @Nullable
    public final Object a(@NotNull TA ta, @NotNull XA.d dVar) throws Throwable {
        Object objC = ((GP1) b()).c(new YI1(ta, this), dVar);
        MN mn = MN.d;
        return objC;
    }

    @Override // defpackage.ZI1
    @NotNull
    public final InterfaceC6396rf0<Boolean> b() {
        return this.b;
    }

    @Override // defpackage.ZI1
    @NotNull
    public final EnumC2694aJ1 getKey() {
        return this.a;
    }
}
