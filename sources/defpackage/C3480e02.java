package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: e02, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3480e02 implements InterfaceC6353rS1 {

    @NotNull
    public final EnumC2694aJ1 a;

    @NotNull
    public final C0658Bf0 b;

    public C3480e02(@NotNull ZT1 subIdProvider) {
        Intrinsics.checkNotNullParameter(subIdProvider, "subIdProvider");
        this.a = EnumC2694aJ1.TOKEN_ID_KEY;
        this.b = new C0658Bf0(subIdProvider.b());
    }

    @Override // defpackage.ZI1
    @Nullable
    public final Object a(@NotNull TA ta, @NotNull XA.d dVar) {
        String str = (String) this.b.d;
        if (str == null) {
            str = "";
        }
        ta.setId(str);
        Unit unit = Unit.a;
        if (unit != MN.d) {
            unit = Unit.a;
        }
        return unit == MN.d ? unit : Unit.a;
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
