package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Rd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1902Rd0 implements InterfaceC6353rS1 {

    @NotNull
    public final EnumC2694aJ1 a;

    @NotNull
    public final InterfaceC6396rf0<String> b;

    public C1902Rd0(@NotNull AbstractC1276Jd0 firebaseAppInstanceIdUseCase) {
        Intrinsics.checkNotNullParameter(firebaseAppInstanceIdUseCase, "firebaseAppInstanceIdUseCase");
        this.a = EnumC2694aJ1.FIREBASE_ID_KEY;
        this.b = firebaseAppInstanceIdUseCase.l();
    }

    @Override // defpackage.ZI1
    @Nullable
    public final Object a(@NotNull TA ta, @NotNull XA.d dVar) {
        return InterfaceC6353rS1.a.a(this, ta, dVar);
    }

    @Override // defpackage.ZI1
    @NotNull
    public final InterfaceC6396rf0<String> b() {
        return this.b;
    }

    @Override // defpackage.ZI1
    @NotNull
    public final EnumC2694aJ1 getKey() {
        return this.a;
    }
}
