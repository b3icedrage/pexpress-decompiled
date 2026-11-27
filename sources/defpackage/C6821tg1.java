package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6821tg1 implements ES<AbstractC0662Bg1> {

    @NotNull
    public final ES<AbstractC0662Bg1> a;

    public C6821tg1(@NotNull ES<AbstractC0662Bg1> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.a = delegate;
    }

    @Override // defpackage.ES
    @Nullable
    public final Object a(@NotNull Function2 function2, @NotNull LM lm) {
        return this.a.a(new C6611sg1(function2, null), lm);
    }

    @Override // defpackage.ES
    @NotNull
    public final InterfaceC6396rf0<AbstractC0662Bg1> getData() {
        return this.a.getData();
    }
}
