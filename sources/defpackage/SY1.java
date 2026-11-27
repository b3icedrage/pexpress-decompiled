package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class SY1 implements InterfaceC2355Wx {

    @NotNull
    public static final SY1 a = new SY1();

    @Override // defpackage.InterfaceC2355Wx
    @Nullable
    public final Object a(@NotNull Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // defpackage.InterfaceC2355Wx
    @NotNull
    public final List<Type> b() {
        return C5653o60.d;
    }

    @Override // defpackage.InterfaceC2355Wx
    public final /* bridge */ /* synthetic */ Member c() {
        return null;
    }

    @Override // defpackage.InterfaceC2355Wx
    @NotNull
    public final Type n() {
        Class TYPE = Void.TYPE;
        Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
        return TYPE;
    }
}
